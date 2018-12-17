package com.daojia.authority.service.impl;

import com.daojia.authority.entity.DJTest;
import com.daojia.authority.entity.DJTestExample;
import com.daojia.authority.listener.event.AuthorityEvent;
import com.daojia.authority.mapper.DJTestMapper;
import com.daojia.authority.service.AuthorityService;
import com.daojia.authority.util.SpringContextHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: weitao.liu
 * @Date: 2018/12/8 16:23
 * @Description:
 */
@Service
public class AuthorityServiceImpl implements AuthorityService {
    @Autowired
    private DJTestMapper djTestMapper;

    @Override
    public DJTest getDjtest() {
        ApplicationContext applicationContext = SpringContextHolder.applicationContext;
        applicationContext.publishEvent(new AuthorityEvent(this));
        DJTestExample djTestExample = new DJTestExample();
        djTestExample.createCriteria().andWokerIdEqualTo("1");
        List<DJTest> djTests = djTestMapper.selectByExample(djTestExample);
        return djTests.get(0);
    }
}

package com.tangyao.authority.service.impl;

import com.tangyao.authority.entity.DJTest;
import com.tangyao.authority.entity.DJTestExample;
import com.tangyao.authority.listener.event.AuthorityEvent;
import com.tangyao.authority.mapper.DJTestMapper;
import com.tangyao.authority.service.AuthorityService;
import com.tangyao.authority.util.SpringContextHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
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
        HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
        ApplicationContext applicationContext = SpringContextHolder.applicationContext;
        applicationContext.publishEvent(new AuthorityEvent(this));
        DJTestExample djTestExample = new DJTestExample();
        djTestExample.createCriteria().andWokerIdEqualTo("1");
        List<DJTest> djTests = djTestMapper.selectByExample(djTestExample);
        return djTests.get(0);
    }
}

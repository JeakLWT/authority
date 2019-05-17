package com.tangyao.authority.mapper;

import com.tangyao.authority.entity.Merchant;
import com.tangyao.authority.entity.MerchantExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface MerchantMapper {
    int countByExample(MerchantExample example);

    int deleteByExample(MerchantExample example);

    int deleteByPrimaryKey(Long merchantId);

    int insert(Merchant record);

    int insertSelective(Merchant record);

    List<Merchant> selectByExample(MerchantExample example);

    Merchant selectByPrimaryKey(Long merchantId);

    int updateByExampleSelective(@Param("record") Merchant record, @Param("example") MerchantExample example);

    int updateByExample(@Param("record") Merchant record, @Param("example") MerchantExample example);

    int updateByPrimaryKeySelective(Merchant record);

    int updateByPrimaryKey(Merchant record);
}
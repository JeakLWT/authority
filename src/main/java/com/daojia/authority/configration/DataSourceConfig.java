package com.daojia.authority.configration;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @Author: weitao.liu
 * @Date: 2018/12/8 14:30
 * @Description:
 */
@Configuration
public class DataSourceConfig {
    @Bean
    public DataSource druidDataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUrl(dataSourceProperties().getUrl());
        druidDataSource.setUsername(dataSourceProperties().getUsername());
        druidDataSource.setPassword(dataSourceProperties().getPassword());
        druidDataSource.setDriverClassName(dataSourceProperties().getDriverClassName());
        druidDataSource.setInitialSize(dataSourceProperties().getInitialSize());
        druidDataSource.setMinIdle(dataSourceProperties().getMinIdle());
        druidDataSource.setMaxActive(dataSourceProperties().getMaxActive());
        druidDataSource.setMaxWait(dataSourceProperties().getMaxWait());
        return druidDataSource;
    }

    @Bean
    public DataSourceProperties dataSourceProperties(){
        return new DataSourceProperties();
    }

}

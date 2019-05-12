package com.daojia.authority.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisShardInfo;

public class RedisUtil {
    private static final Logger logger = LogManager
            .getLogger(RedisUtil.class);
    private static Jedis jedis=null;

    static {
        logger.info("redis begin connecting.............");
        JedisShardInfo jedisShardInfo=new JedisShardInfo("47.105.176.198",6379);
        jedisShardInfo.setPassword("123456");
        jedis = jedisShardInfo.createResource();
        logger.info("redis begin connected.............");
        jedis.ping();

    }

    public static String getKey(String key){
       return jedis.get(key);
    }


    public static void setKey(String key,String value){
        jedis.set(key,value);
    }
}

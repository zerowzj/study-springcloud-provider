package com.company.project.support.redis;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisPassword;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

public class RedisCfg {

    @Value("${redis.node1.host}")
    private String host;
    @Value("${redis.node2.port}")
    private int port;

    @Bean(name = "redis1Template")
    public RedisTemplate redis1Template() {
        RedisStandaloneConfiguration config = new RedisStandaloneConfiguration();
        config.setHostName(host);
        config.setPort(port);
        config.setPassword(RedisPassword.of("abc123"));
//
//        JedisConnectionFactory factory = new JedisConnectionFactory(config);
//        factory.afterPropertiesSet();

        StringRedisTemplate template = new StringRedisTemplate();
        template.afterPropertiesSet();
        return template;
    }
}

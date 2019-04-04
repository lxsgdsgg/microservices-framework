package com.unicorn.usercenter.config;

import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * 开启session共享
 *
 * @author Awake
 */
@EnableRedisHttpSession
public class SessionConfig {

}

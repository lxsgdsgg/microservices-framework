package com.unicorn.authcenter.config;

import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * 开启session共享
 *
 * @author awake
 */
@EnableRedisHttpSession
public class SessionConfig {

}

package com.unicorn.serviceb.configuration;/**
 * @AUTHOR Awake
 * Created by awake on 2019/3/24.
 */

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: microservice-framework
 * @description:
 * @author: Awake
 * @create: 2019-03-24 16:27
 **/
@Configuration
public class FeignLogConfiguration {
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}

package com.unicorn.serviceb.feignService;/**
 * @AUTHOR Awake
 * Created by awake on 2019/3/24.
 */

import com.unicorn.serviceb.configuration.FeignLogConfiguration;
import com.unicorn.serviceb.feignService.fallback.CourseClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @program: microservice-framework
 * @description:
 * @author: Awake
 * @create: 2019-03-24 15:24
 **/
@Service
@FeignClient(name = "service-a", configuration = FeignLogConfiguration.class, fallback = CourseClientFallback.class)
public interface CourseClient {

    /**
     * 根据名称获取课程信息
     *
     * @param name
     * @return
     */
    @RequestMapping(value = "/getJsonData/{name}", method = RequestMethod.GET)
    String findByName(@PathVariable("name") String name);
}

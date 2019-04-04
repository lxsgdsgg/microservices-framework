package com.unicorn.serviceb.controller;/**
 * @AUTHOR Awake
 * Created by Awake on 2019/3/24.
 */

import com.unicorn.serviceb.feignService.CourseClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: microservice-framework
 * @description:
 * @author: Awake
 * @create: 2019-03-24 15:28
 **/
@RestController
public class CourseController {

    @Autowired
    CourseClient courseClient;

    @GetMapping("/courseApi/{name}")
    public String getCourseInfo(@PathVariable String name) {

        return courseClient.findByName(name);
    }

}

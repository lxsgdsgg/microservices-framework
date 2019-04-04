package com.unicorn.servicea.controller;/**
 * @AUTHOR Awake
 * Created by Awake on 2019/3/24.
 */

import com.google.gson.Gson;
import com.unicorn.servicea.dto.CourseDTO;
import com.unicorn.servicea.dto.ResultDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: microservice-framework
 * @description:
 * @author: Awake
 * @create: 2019-03-24 11:36
 **/
@RestController
public class TestController {


    @GetMapping(value = "/getJsonData/{name}")
    public String getJsonData(@PathVariable(name = "name") String courseName) {

        ResultDTO<List<CourseDTO>> jsonDTO = new ResultDTO();
        jsonDTO.setCode("100");
        jsonDTO.setMsg("成功");

        List<CourseDTO> utCourseList = new ArrayList<>();
        CourseDTO courseOne = new CourseDTO();
        courseOne.setName(courseName);
        courseOne.setCodeR("SW001");
        utCourseList.add(courseOne);
        CourseDTO courseTwo = new CourseDTO();
        courseTwo.setName(courseName);
        courseTwo.setCodeR("FY002");
        utCourseList.add(courseTwo);
        jsonDTO.setData(utCourseList);

        Gson gson = new Gson();
        String resultJson = gson.toJson(jsonDTO);
        return resultJson;
    }

}

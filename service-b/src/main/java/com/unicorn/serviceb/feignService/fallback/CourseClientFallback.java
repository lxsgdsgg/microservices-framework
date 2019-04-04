package com.unicorn.serviceb.feignService.fallback;/**
 * @AUTHOR Awake
 * Created by Awake on 2019/3/24.
 */

import com.unicorn.serviceb.feignService.CourseClient;
import org.springframework.stereotype.Component;

/**
 * @program: microservice-framework 每个接口务必要写回退方法，避免微服务雪崩的发生
 * @description:
 * @author: Awake
 * @create: 2019-03-24 18:17
 **/
@Component
public class CourseClientFallback implements CourseClient {

    @Override
    public String findByName(String name) {
        return "请求失败!";
    }


}

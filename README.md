# microservice-framework
项目说明
===
### 1.registry 服务注册中心 
    netflix-eureka
    微服务的注册、发现与管理
### 2.config-center 配置中心 
    spring-config
    所有其他微服务模块都需要从配置中心读取配置文件，存放地址为classpath:/config/dev/{module-name}
### 3.common 通用模块 
    通用模块中一般放置一些通用的model和utils工具类
### 4.gateway 网关模块 
    netflix-zuul
    微服务中的网关层
### 5 monitor 监控模块 
    spring-cloud-admin Hystrix-dashboard
    负责监控整个微服务架构的运行情况
### 6 auth-center 认证模块 
    spring-security spring-security-oauth2
    负责整个微服务的授权与鉴权，从而保证微服务的安全性。
### 7 user-center 用户模块 
    spring-boot netflix-feign
    负责全局的用户、角色、权限
### 8 zipkin  
    spring-cloud-sleuth zipkin
    微服务的数据收集以及链路追踪
### 9 log-center 日志中心 （待完成）
    elasticSearch logstash kibana
    日志收集、分析、处理

### 10 service A 和 service b
    两个示例模块。微服务B模块通过feignClient声明式的调用service A中的服务

操作说明
===
    1.首先运行个项目sql文件夹中的sql并启动redis
    2.然后修改config-center中的各项目的相关数据库地址以及redis地址
    3.按顺序启动服务
      registry--->config-center--->gateway--->auth-center--->其他微服务
    4.通过地址可以访问serviceA中暴露的接口。 地址示例：localhost:{port}/getJsonData/{name}
    5.通过ServiceB的Feign接口可以声明式访问serviceA中的暴露的的接口。地址示例：locahost:{port}/courseApi/{name}
    6.通过密码模式访问受保护接口。
        a.auth-center获取访问受保护接口的token 地址示例：localhost:8762/uaa/oauth/token?grant_type=password&client_id=system&client_secret=system&scope=app&username=admin&password=admin
        b.根据获取的token访问受保护的接口 地址示例:localhost:8001/users/current?access_token=ad630d4d-24ab-4496-8294-49ae03e1ce2f
    8.通过授权码模式访问受保护的接口
        a.通过浏览器访问http://localhost:8766/oauth/authorize?client_id=system&redirect_uri=http://localhost:9001/callback&response_type=code&scope=app
        b.输入admin admin
        c.点击确认授权，获取到授权码
        d.根据授权码获取access_token:localhost:8766/oauth/token?code=MXqYZb&grant_type=authorization_code&redirect_uri=http://localhost:9001/callback&scope=app(注意要添加header属性 [{"key":"Content-Type","value":"application/x-www-form-urlencoded","description":""}])
        e.根据token范围接口
        ps:若未说明由浏览器访问则均通过PostMan发送相关请求
 
 Q&A
 ===
1.运行时报错：The server time zone value 'ÖÐ¹ú±ê×¼Ê±¼ä' is unrecognized or represents more than one time zone
解决方案：在mysql中运行set GLOBAL time_zone = '+8:00'

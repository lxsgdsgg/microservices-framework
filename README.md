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
    
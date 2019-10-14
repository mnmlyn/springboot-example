# 项目说明
使用IDEA的Spring Initializr建立这个Spring Boot项目。

# 运行项目
## 遇到的第一个问题-端口冲突
在src\main\resources\application.properties中，添加
```
server.port=8088
```
即可修改默认监听端口。

## 启动及访问方式
启动src\main\java\com\mnmlyn\blog\sb\BlogSpringbootApplication.java
浏览器访问http://localhost:8088/
即可看到
```
Whitelabel Error Page
```
页面

# 配置第一个页面
配置页面的方式也很简单。
在src下，新建一个controller包，建立一个类，用@Controller注解，实现一个方法，用@RequestMapping("/url")和@ResponseBody进行注解即可。

测试了一下，
@RequestMapping("/url")用来指定请求的uri。
@ResponseBody注解之后，直接返回该函数的返回值对象。
若没有@ResponseBody注解，则将会以返回的String类型值为名称，去src/main/resources/templates中，找相应名称的html文件。

若没有跳转到指定的html页，可以检查下，pom.xml是否引入了下边的依赖
```
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-thymeleaf</artifactId>
</dependency>

```



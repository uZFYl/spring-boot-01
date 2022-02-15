package cn.tedu.springboot01;

import cn.tedu.springboot01.beans.TestBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * SpringBoot 的启动类就是Spring的配置类
 * 1. 必须标注@SpringBootApplication注解
 * 2. 提供组件扫描，自动扫描当前包和子包
 * 3. 启动类，就是配置类，可以使用@Bean声明JavaBean对象
 */
@SpringBootApplication
public class SpringBoot01Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot01Application.class, args);
    }

    @Bean
    public TestBean testBean(){
        return new TestBean();
    }
}

package cn.tedu.springboot01.beans;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class DemoBean implements Serializable {
    @Override
    public String toString() {
        return "Hello World！";
    }
}

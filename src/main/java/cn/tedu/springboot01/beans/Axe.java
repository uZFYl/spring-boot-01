package cn.tedu.springboot01.beans;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class Axe implements Tool, Serializable {
    private String name = "斧子";

    @Override
    public String toString() {
        return name;
    }
}

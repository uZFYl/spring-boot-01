package cn.tedu.springboot01.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class Worker implements Serializable {
    private String name = "光头强";
    @Autowired
    private Tool tool;

    public void work(){
        System.out.println(name+"使用"+tool+"砍树");
    }

    public Tool getTool() {
        return tool;
    }

    public void setTool(Tool tool) {
        this.tool = tool;
    }
}

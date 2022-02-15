package cn.tedu.springboot01.beans;

import java.io.Serializable;

public class TestBean implements Serializable {
    @Override
    public String toString() {
        return "Hello TestBean";
    }
}

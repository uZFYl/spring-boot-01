package cn.tedu.springboot01;

import cn.tedu.springboot01.beans.DemoBean;
import cn.tedu.springboot01.beans.TestBean;
import cn.tedu.springboot01.beans.Worker;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * SpringBoot 整合了JUnit5
 * 1. 测试类需要和启动类在相同的包
 * 2. 需要标注@SpringBootTest
 * 3. 可以注入Spring中的JavaBean对象
 * 4. 测试类和方法，可以不是 public 的
 */
@SpringBootTest
class SpringBoot01ApplicationTests {

    @Resource
    private DemoBean demoBean;

    @Resource
    private TestBean testBean;

    @Test
    void contextLoads() {
        System.out.println(demoBean);
    }

    @Test
    void testBean(){
        System.out.println(testBean);
    }

    /**
     * 测试依赖注入功能
     */
    @Resource
    private Worker worker;
    @Test
    void worker(){
        worker.work();
    }

}

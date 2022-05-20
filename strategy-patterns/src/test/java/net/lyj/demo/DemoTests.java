package net.lyj.demo;


import net.lyj.demo.message.AbstractJointMessage;
import net.lyj.demo.message.JointStartMessage;
import net.lyj.demo.service.JointService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class DemoTests {
    @Resource
    private JointService jointService;

    @Test
    public void demo() {
        for (int i = 0; i < 1000; i++) {
            new Thread(()->{
                AbstractJointMessage message = new JointStartMessage();
                message.setType(1);
                jointService.jointData(message);
                message.setType(2);
                jointService.jointData(message);
            }).start();
        }
    }
}

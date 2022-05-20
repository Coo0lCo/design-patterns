package net.lyj.demo.handler.impl;

import net.lyj.demo.enums.MessageTypeEnum;
import net.lyj.demo.handler.JointStrategy;
import net.lyj.demo.handler.annotations.Strategy;
import net.lyj.demo.message.AbstractJointMessage;
import org.springframework.stereotype.Component;

/**
 * @author SCBC_LiYongJie
 * {@code @Date} 2022/5/19
 */
@Component
@Strategy(model = MessageTypeEnum.START)
public class JointStartHandler implements JointStrategy {
    @Override
    public void joint(AbstractJointMessage message) {
        System.out.println("Joint Start handle success!");
    }
}

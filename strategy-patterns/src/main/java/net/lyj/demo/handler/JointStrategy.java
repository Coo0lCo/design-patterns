package net.lyj.demo.handler;

import net.lyj.demo.message.AbstractJointMessage;

public interface JointStrategy {
    void joint(AbstractJointMessage message);
}

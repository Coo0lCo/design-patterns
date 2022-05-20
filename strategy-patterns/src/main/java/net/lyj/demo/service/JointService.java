package net.lyj.demo.service;

import net.lyj.demo.handler.JointStrategy;
import net.lyj.demo.handler.JointStrategyContext;
import net.lyj.demo.message.AbstractJointMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * @author SCBC_LiYongJie
 * {@code @Date} 2022/5/19
 */
@Service
public class JointService {
    private final Logger log = LoggerFactory.getLogger(JointService.class);
    public void jointData(AbstractJointMessage message){
        JointStrategy jointStrategy = JointStrategyContext.STRATEGY_MAP.get(message.getType());
        if (Objects.isNull(jointStrategy))
            log.error("joint data error!");
        else jointStrategy.joint(message);
    }
}

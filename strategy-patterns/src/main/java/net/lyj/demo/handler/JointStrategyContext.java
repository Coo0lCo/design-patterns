package net.lyj.demo.handler;

import net.lyj.demo.handler.annotations.Strategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author SCBC_LiYongJie
 * {@code @Date} 2022/5/19
 */
@Component
public class JointStrategyContext {
    private final Logger log = LoggerFactory.getLogger(JointStrategyContext.class);
    @Resource
    private List<JointStrategy> jointStrategyList;
    public static final Map<Integer,JointStrategy> STRATEGY_MAP = new ConcurrentHashMap<>();

    /**
     * @PostConstruct
     *  注解作用的方法，当依赖注入完毕后执行，目的是为了List<JoinStrategy>重的策略注入完毕
     */
    @PostConstruct
    public void init(){
        jointStrategyList.forEach(jointStrategy -> {
            Class<?> clazz = jointStrategy.getClass();
            Strategy strategy = clazz.getAnnotation(Strategy.class);
            if (Objects.isNull(strategy))
                log.error("class [{}] not identity type",clazz.getName());
            else
                STRATEGY_MAP.put(strategy.model().getType(),jointStrategy);
        });
    }
}

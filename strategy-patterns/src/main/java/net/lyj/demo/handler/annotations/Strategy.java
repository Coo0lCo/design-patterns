package net.lyj.demo.handler.annotations;

import net.lyj.demo.enums.MessageTypeEnum;

import java.lang.annotation.*;

/**
 * @author SCBC_LiYongJie
 * {@code @Date} 2022/5/19
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Strategy {
    MessageTypeEnum model();
}

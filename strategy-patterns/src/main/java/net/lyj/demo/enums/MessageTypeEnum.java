package net.lyj.demo.enums;

/**
 * @author SCBC_LiYongJie
 * {@code @Date} 2022/5/19
 */
public enum MessageTypeEnum {
    START(1),PAUSE(2);
    private final Integer type;
    MessageTypeEnum(Integer type) {
        this.type = type;
    }

    public Integer getType() {
        return type;
    }
}

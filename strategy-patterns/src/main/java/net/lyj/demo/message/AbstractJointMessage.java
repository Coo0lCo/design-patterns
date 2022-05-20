package net.lyj.demo.message;

/**
 * @author SCBC_LiYongJie
 * {@code @Date} 2022/5/19
 */
public abstract class AbstractJointMessage {
    protected Integer type;
    public Integer getType() {
        return type;
    }
    public void setType(Integer type) {
        this.type = type;
    }
}

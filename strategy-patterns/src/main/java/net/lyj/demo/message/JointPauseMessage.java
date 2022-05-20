package net.lyj.demo.message;

/**
 * @author SCBC_LiYongJie
 * {@code @Date} 2022/5/19
 */
public class JointPauseMessage extends AbstractJointMessage {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

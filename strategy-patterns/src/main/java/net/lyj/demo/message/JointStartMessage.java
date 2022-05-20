package net.lyj.demo.message;

/**
 * @author SCBC_LiYongJie
 * {@code @Date} 2022/5/19
 */
public class JointStartMessage  extends AbstractJointMessage{
    private String message;
    private String sender;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }
}

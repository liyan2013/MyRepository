package ssh.spring.event;

import org.springframework.context.ApplicationEvent;

/**
 * Created with IntelliJ IDEA.
 * User: liyanwang
 * Date: 6/20/13
 * Time: 4:28 PM
 * To change this template use File | Settings | File Templates.
 */
public class EmailEvent extends ApplicationEvent{

    private String address;
    private String text;

    public EmailEvent(Object source){
        super(source);
    }

    public EmailEvent(Object source, String address, String text){
        this(source);
        this.address = address;
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}


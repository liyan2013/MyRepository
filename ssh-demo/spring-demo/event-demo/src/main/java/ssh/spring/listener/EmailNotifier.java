package ssh.spring.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import ssh.spring.event.EmailEvent;

/**
 * Created with IntelliJ IDEA.
 * User: liyanwang
 * Date: 6/20/13
 * Time: 4:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class EmailNotifier implements ApplicationListener{
    public void onApplicationEvent(ApplicationEvent event){
        if(event instanceof EmailEvent){
            EmailEvent emailEvent = (EmailEvent)event;
            System.out.println(emailEvent.getAddress());
            System.out.println(emailEvent.getText());
        }else {
            System.out.println("Event: " + event);
        }
    }
}

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by wangbin on 2017/5/28.
 */
public class FirstListener implements ServletContextListener {

    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("contextInitialized....");
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.printf("contextDestroyed....");
    }
}

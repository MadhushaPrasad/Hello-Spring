package beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Component;

//@Component("b")
public class SpringBean2 implements DisposableBean {
    public SpringBean2() {
        System.out.println("Spring Bean Two Instanttiated");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Spring Bean 2 Closed");
    }
}

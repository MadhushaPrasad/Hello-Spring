package beans;

import org.springframework.beans.factory.DisposableBean;


public class SpringBean3 implements DisposableBean {
    public SpringBean3() {
        System.out.println("Spirng Bean 3 Instanttiated");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Spring Bean 3 Closed");
    }
}

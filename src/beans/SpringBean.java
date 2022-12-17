package beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Component;

//@Component("a")
public class SpringBean implements DisposableBean {
    public SpringBean() {
        System.out.println("Spring Bean Instanttiated");
    }


    public void testMethod() {
        System.out.println("Test Method Called");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Spring Bean Closed");
    }
}

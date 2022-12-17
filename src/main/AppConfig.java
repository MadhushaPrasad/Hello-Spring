package main;

import beans.SpringBean3;
import beans.SpringBean5;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "lk.ijse.spring.absd.beans")
@ComponentScan(basePackageClasses = SpringBean5.class)
public class AppConfig {

//    @Bean("c")
//    public SpringBean3 setSpringBean3() {
//        return new SpringBean3();
//    }


}

package main;

import beans.SpringBean5;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitilizer {
    public static void main(String[] args) {


//        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("JVM Is Going to Shut Down");
//            }
//        }));


        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        ctx.registerShutdownHook();


        SpringBean5 bean1 = ctx.getBean(SpringBean5.class);
        SpringBean5 bean2 = ctx.getBean(SpringBean5.class);
        System.out.println(bean1);
        System.out.println(bean2);


//        SpringBean bean = ctx.getBean(SpringBean.class);
//
//        //Bean ID
//        SpringBean2 bean2 = (SpringBean2) ctx.getBean("b");
//        SpringBean2 bean3 = (SpringBean2) ctx.getBean("b");
//        System.out.println(bean2);
//        System.out.println(bean3);


//        SpringBean3 bean = ctx.getBean(SpringBean3.class);
//        SpringBean3 bean2 = ctx.getBean(SpringBean3.class);
//        System.out.println(bean);
//        System.out.println(bean2);


//        SpringBean3 bean = (SpringBean3) ctx.getBean("setSpringBean3");
//        System.out.println(bean);


//        SpringBean3 bean = (SpringBean3) ctx.getBean("c");
//        System.out.println(bean);


//        System.out.println(bean);


//        ctx.registerShutdownHook();
//        ctx.close();
//
//        SpringBean bean = ctx.getBean(SpringBean.class);
//        System.out.println(bean);
//
//
//        System.out.println("After Close " + bean);
//
//        SpringBean bean2 = ctx.getBean(SpringBean.class);
//        System.out.println(bean2);
//
//
//        System.out.println("Code Ended");


//        SpringBean2 bean1 = ctx.getBean(SpringBean2.class);
//        System.out.println(bean1);


//        SpringBean bean1 = ctx.getBean(SpringBean.class);
//        SpringBean bean2 = ctx.getBean(SpringBean.class);
//        System.out.println(bean1);
//        System.out.println(bean2);
//        bean1.testMethod();
//
//        SpringBean2 b1 = ctx.getBean(SpringBean2.class);
//        SpringBean2 b2 = ctx.getBean(SpringBean2.class);
//        System.out.println(b1);
//        System.out.println(b2);


    }
}

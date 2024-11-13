package kr.or.ddit.lab08;

import kr.or.ddit.lab02.objs.Foo;
import kr.or.ddit.lab08.conf.Lab02JavaConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Playground_Lab02_JavaConfig {
    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                new AnnotationConfigApplicationContext(Lab02JavaConfiguration.class);
        Foo foo = context.getBean(Foo.class);
    }
}

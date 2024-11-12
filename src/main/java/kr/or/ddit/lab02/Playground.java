package kr.or.ddit.lab02;

import kr.or.ddit.lab01.controller.DummyController;
import kr.or.ddit.lab02.objs.Bar;
import kr.or.ddit.lab02.objs.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

@Slf4j
public class Playground {
    public static void main(String[] args) {

        ConfigurableApplicationContext context =
                new GenericXmlApplicationContext("classpath:kr/or/ddit/lab02/conf/lab02-context.xml");

        context.registerShutdownHook();


//        Foo foo1 = context.getBean("foo1", Foo.class);
//        Foo foo2 = context.getBean("foo2", Foo.class);
//        log.info("foo1 == foo2 - {} ", foo1==foo2);
//
//        Bar bar1 = context.getBean(Bar.class);
//        Bar bar2 = context.getBean(Bar.class);
//        log.info("bar1 == bar2 - {} ", bar1==bar2);
    }
}
package kr.or.ddit.lab03;

import kr.or.ddit.lab03.objs.Hunter;
import kr.or.ddit.lab03.objs.HuntingDog;
import kr.or.ddit.lab03.objs.HuntingGround;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

@Slf4j
public class Playground {
    public static void main(String[] args) {

        ConfigurableApplicationContext context
                = new GenericXmlApplicationContext("classpath:kr/or/ddit/lab03/conf/lab03-context.xml");

        context.registerShutdownHook();


        Hunter hunter1 = context.getBean(Hunter.class);
        log.info("주입된 객체 {}", hunter1);
        Hunter hunter2 = context.getBean(Hunter.class);
        log.info("주입된 객체 {}", hunter2);
        Hunter hunter3 = context.getBean(Hunter.class);

        HuntingGround huntingGround = context.getBean("huntingGround", HuntingGround.class);
        log.info("주입된 객체 {}", huntingGround);

        HuntingDog huntingDog = context.getBean("huntingDog", HuntingDog.class);



    }
}

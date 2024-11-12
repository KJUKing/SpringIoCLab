package kr.or.ddit.lab03;

import kr.or.ddit.lab03.objs.HuntingGround;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Properties;

@Slf4j
public class Playground_Collection {
    public static void main(String[] args) {
        ConfigurableApplicationContext context
                = new ClassPathXmlApplicationContext("kr/or/ddit/lab03/conf/lab03-collection-context.xml");
        context.registerShutdownHook();

        HuntingGround huntingGround = context.getBean(HuntingGround.class);

        log.info("주입된 객체는 : {}", huntingGround );

        Properties dbInfo = context.getBean("dbInfo", Properties.class);
        dbInfo.forEach((k, v) -> log.info("{}={}", k, v));
    }
}

package kr.or.ddit.lab03;


import kr.or.ddit.lab03.objs.HuntingGround;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

@Slf4j
public class Playground_Mission {
    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext("kr/or/ddit/lab03/conf/mission-context.xml");

        context.registerShutdownHook();
        int beanDefinitionCount = context.getBeanDefinitionCount();
        log.info("bean definition count: {}", beanDefinitionCount);

        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        log.info("bean definition names: {}", beanDefinitionNames);

        Arrays.stream(beanDefinitionNames)
                .forEach(beanName -> {
                    log.info("bean name: {}", beanName);
                });

        context.getBean("hunterList", List.class)
                .forEach(h -> log.info("hunter: {}", h));
        context.getBean("gunSet", Set.class)
                .forEach(g -> log.info("single gun : {}", g));
    }
}

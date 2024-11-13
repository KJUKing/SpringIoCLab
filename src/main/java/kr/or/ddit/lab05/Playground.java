package kr.or.ddit.lab05;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.Properties;

@Slf4j
public class Playground {
    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                new GenericXmlApplicationContext("classpath:kr/or/ddit/lab05/properties-context.xml");
        context.registerShutdownHook();

        Properties dbInfo = context.getBean("dbInfo", Properties.class);

        log.info("properties size: {}", dbInfo.size());
        int num1 = 23;
        int num2 = num1;

//        Properties copyProps = new Properties();
//        for (Object key : copyProps.keySet()) {
//            String value = dbInfo.getProperty(key.toString());
//            copyProps.setProperty(key.toString(), value);
//        }
        context.getBean("copyProps", Properties.class)
                .forEach((k, v) -> log.info("{} : {} ", k, v));


    }
}

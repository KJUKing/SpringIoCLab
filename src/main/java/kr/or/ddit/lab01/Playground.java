package kr.or.ddit.lab01;

import kr.or.ddit.lab01.controller.DummyController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.*;

@Slf4j
public class Playground {
    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("/kr/or/ddit/lab01/conf/dummy-context.xml");

        DummyController cont = context.getBean(DummyController.class);

        int pk = 11;
        cont.receiveCommand(pk);

    }
}

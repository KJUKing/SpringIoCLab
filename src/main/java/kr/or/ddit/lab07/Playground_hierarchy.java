package kr.or.ddit.lab07;

import kr.or.ddit.lab01.controller.DummyController;
import kr.or.ddit.lab01.service.DummyService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Playground_hierarchy {
    public static void main(String[] args) {
        ConfigurableApplicationContext root
                = new ClassPathXmlApplicationContext("kr/or/ddit/lab07/conf/parent/lab01-root-context.xml");

        ConfigurableApplicationContext child
                = new ClassPathXmlApplicationContext(
                        new String[] {"kr/or/ddit/lab07/conf/child/lab01-child-context.xml"}, root);

        DummyController controller = child.getBean("dummyController", DummyController.class);
        controller.receiveCommand(42);

        DummyService service = child.getBean(DummyService.class);
    }
}

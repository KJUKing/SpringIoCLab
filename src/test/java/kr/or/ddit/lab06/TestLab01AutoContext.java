package kr.or.ddit.lab06;


import kr.or.ddit.lab01.controller.DummyController;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@Slf4j
@SpringJUnitConfig(locations = "file:src/main/resources/kr/or/ddit/lab06/conf/lab01-auto-context.xml")
public class TestLab01AutoContext {
//
//    @Autowired
//    DummyController controller1;
//    @Autowired
//    DummyController controller2;

    @Test
    void test() {
//        controller1.receiveCommand(23);
//        controller2.receiveCommand(45);

//        log.info("controller1 == controller2 = {} ", controller1==controller2);
    }
}

package kr.or.ddit.lab08;

import kr.or.ddit.lab01.controller.DummyController;
import kr.or.ddit.lab08.conf.Lab01ChildContextJavaConfiguration;
import kr.or.ddit.lab08.conf.Lab01RootContextJavaConfiguration;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith({SpringExtension.class})
@ContextHierarchy({@ContextConfiguration(classes = Lab01RootContextJavaConfiguration.class) ,
//        @ContextConfiguration(classes = Lab01ChildContextJavaConfiguration.class)
        @ContextConfiguration(locations = "file:src/main/resources/kr/or/ddit/lab07/conf/child/lab01-child-context.xml")
})


public class TestLab01JavaConfigHierarchy {

    @Autowired
    DummyController controller;

    @Test
    void test() {
        controller.receiveCommand(43);
    }
}

package kr.or.ddit.lab06;


import kr.or.ddit.lab02.objs.Foo;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@Slf4j
@ExtendWith({SpringExtension.class})
@ContextConfiguration(locations = "file:src/main/resources/kr/or/ddit/lab06/conf/lab02-auto-context.xml")
public class TestLab02AutoContext {
    @Test
    void test() {
    }
}

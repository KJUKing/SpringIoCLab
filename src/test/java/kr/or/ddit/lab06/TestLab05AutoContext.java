package kr.or.ddit.lab06;


import kr.or.ddit.lab05.objs.DBInfoVO;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import javax.inject.Inject;

@SpringJUnitConfig(locations = "file:src/main/resources/kr/or/ddit/lab06/conf/lab05-auto-context.xml")
public class TestLab05AutoContext {


    @Inject
    DBInfoVO vo;

    @Test
    void test() {
    }
}

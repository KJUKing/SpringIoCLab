package kr.or.ddit.lab08;

import kr.or.ddit.lab03.objs.Hunter;
import kr.or.ddit.lab03.objs.HuntingGroundMission;
import kr.or.ddit.lab03.objs.Shotgun;
import kr.or.ddit.lab08.conf.Lab03JavaConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;
import java.util.Set;

@Slf4j
@SpringJUnitConfig(classes = Lab03JavaConfiguration.class)
public class TestLab03JavaConfigContext {

    @Inject
    @Named("hunterList")
//    @Autowired
    List<Hunter> hunterList;

    @Inject
    @Named("gunSet")
    Set<Shotgun> gunSet;

    @Test
    public void test() {
        log.info("주입결과 : {}", hunterList.size());
        log.info("주입결과 : {}", gunSet);

    }

}

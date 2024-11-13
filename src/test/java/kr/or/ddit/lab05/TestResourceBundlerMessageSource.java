package kr.or.ddit.lab05;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@Slf4j
@SpringJUnitConfig(locations = "file:src/main/resources/kr/or/ddit/lab05/conf/resourcebundle-context.xml")
public class TestResourceBundlerMessageSource {

    @Autowired
    ResourceBundleMessageSource messageSource;

    @Test
    void test() {
        log.info("주입된 객체 : {}", messageSource);

    }
}

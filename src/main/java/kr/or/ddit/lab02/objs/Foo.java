package kr.or.ddit.lab02.objs;



import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;


@Component
@Slf4j
@ToString
public class Foo {
    private Bar bar; // 부가전략
    private final Baz baz; // 필수전략



    public Foo(Baz baz) {
        this.baz = baz;
        log.info("생성자로 {}를 주입받고 {}가 생성됨",baz.getClass().getSimpleName(), getClass().getSimpleName());
    }

    @Inject
    public void setBar(Bar bar) {
        this.bar = bar;
        log.info("{}를 세터인젝션으로받음",bar.getClass().getSimpleName());
    }

    @PostConstruct
    public void inita() {
        log.info("{}가 초기화되었음", getClass().getSimpleName());
    }

    @PreDestroy
    public void destroy() {
        log.info("{}가 소멸되었음", getClass().getSimpleName());
    }
}

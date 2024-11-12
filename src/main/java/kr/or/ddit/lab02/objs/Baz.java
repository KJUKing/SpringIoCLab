package kr.or.ddit.lab02.objs;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Baz {

    public Baz() {
        log.info("{}기본생성자 가 생성됨", getClass().getSimpleName());
    }
}

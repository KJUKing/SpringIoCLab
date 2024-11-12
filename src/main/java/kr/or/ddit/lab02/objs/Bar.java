package kr.or.ddit.lab02.objs;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Bar {

    public Bar() {
        log.info("{}기본생성자 가 생성됨", getClass().getSimpleName());

    }

    public void inita() {
        log.info("{}가 초기화되었음", getClass().getSimpleName());
    }


    public void destroy() {
        log.info("{}가 소멸되었음", getClass().getSimpleName());
    }
}

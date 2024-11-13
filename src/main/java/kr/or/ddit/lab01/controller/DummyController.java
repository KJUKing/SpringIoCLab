package kr.or.ddit.lab01.controller;
import kr.or.ddit.lab01.service.DummyService;

import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

@Controller
@Scope("prototype")
@Lazy
//@AllArgsConstructor
@RequiredArgsConstructor
@Setter
@Slf4j
public class DummyController {
    private DummyService service;

    @PostConstruct
    public void init() {
        log.info("주입된 service : {} ", service);
    }
//    @Autowired
    @Inject
    public DummyController(DummyService service) {
        this.service = service;
    }




//    public void setService(DummyService service) {
//        this.service = service;
//    }

    public void receiveCommand(int pk) {
        StringBuffer model = service.readOne(pk);
        log.info("조회된 모델 : {} ", model);
    }
}

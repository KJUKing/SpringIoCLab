package kr.or.ddit.lab01.controller;

import kr.or.ddit.lab01.dao.DummyDAO;
import kr.or.ddit.lab01.dao.DummyDaoImpl_MariaDB;
import kr.or.ddit.lab01.dao.DummyDaoImpl_Oracle;
import kr.or.ddit.lab01.service.DummyService;
import kr.or.ddit.lab01.service.DummyServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Slf4j
public class DummyController {
    private final DummyService service;


//    public void setService(DummyService service) {
//        this.service = service;
//    }

    public void receiveCommand(int pk) {
        StringBuffer model = service.readOne(pk);
        log.info("조회된 모델 : {} ", model);
    }
}

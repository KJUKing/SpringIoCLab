package kr.or.ddit.lab01.dao;


import kr.or.ddit.lab01.controller.DummyController;
import org.springframework.stereotype.Repository;



@Repository("daoOracle")
public class DummyDaoImpl_Oracle implements DummyDAO{

    @Override
    public String selectOne(int pk) {
        return String.format("%d로 조회한 raw data == ORACLE", pk);
    }
}

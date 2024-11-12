package kr.or.ddit.lab01.dao;

public class DummyDaoImpl_Oracle implements DummyDAO{
    @Override
    public String selectOne(int pk) {
        return String.format("%d로 조회한 raw data == ORACLE", pk);
    }
}

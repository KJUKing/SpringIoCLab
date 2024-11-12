package kr.or.ddit.lab01.dao;

public class DummyDAOFactory {
    public DummyDAO getDummyDAO() {
//        return new DummyDaoImpl_Oracle();
        return new DummyDaoImpl_MariaDB();
    }
}

package kr.or.ddit.lab01.service;

import kr.or.ddit.lab01.dao.DummyDAO;
import kr.or.ddit.lab01.dao.DummyDAOFactory;
import kr.or.ddit.lab01.dao.DummyDaoImpl_MariaDB;
import kr.or.ddit.lab01.dao.DummyDaoImpl_Oracle;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;
import java.beans.ConstructorProperties;

@Service
@NoArgsConstructor
//@RequiredArgsConstructor
@AllArgsConstructor
//@Setter
public class DummyServiceImpl implements DummyService {
    //    1. 의존 객체 직접 생성 (non-DI) - 결합력 최상
//    DummyDAO dao = new DummyDaoImpl_Oracle();
//    DummyDAO dao = new DummyDaoImpl_MariaDB();
//    2. Factory Object[Method] Pattern -  결합력 잔존
//    DummyDAO dao = new DummyDAOFactory().getDummyDAO();
//    3. Strategy Pattern : 전략 주입자가 필요하고, 결합력이 주입자에게 전달됨. ==> DI container 필요

    private DummyDAO dao;
//    @Autowired
//    @Resource(name="dummyDaoImpl_MariaDB")
    @Inject
    @Named("dummyDaoImpl_MariaDB")
    public void setDao(DummyDAO dao) {
        this.dao = dao;
    }

    @Override
    public StringBuffer readOne(int pk) {
        String rawData = dao.selectOne(pk);
        StringBuffer info = new StringBuffer(rawData);
        info.append("를 가공해서 만든 모델");
        return info;

    }
}

package com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;


import com.codeclan.example.WhiskyTracker.models.Whisky;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class WhiskyRepositoryImpl implements WhiskyRepositoryCustom {

//    @Autowired
//    EntityManager entityManager;
//
//    @Override
//    @Transactional
//    public List<Whisky> findAllWhiskysByYear(Integer year) {
//        List<Whisky> result = null;
//
//        Session session = entityManager.unwrap(Session.class);
//        Criteria criteria = session.createCriteria(Whisky.class);
//        criteria.createAlias("whiskies", "whisky");
//        criteria.add(Restrictions.eq("whisky.year", year));
//        result = criteria.list();
//
//        return result;
//    }
}

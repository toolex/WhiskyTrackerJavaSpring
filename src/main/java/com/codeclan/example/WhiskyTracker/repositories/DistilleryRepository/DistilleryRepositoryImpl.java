package com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class DistilleryRepositoryImpl implements DistilleryRepositoryCustom {
//    @Autowired
//    EntityManager entityManager;
//
//
//    @Override
//    @Transactional
//    public List<Distillery> findAllDistilleriesByRegion(String region) {
//        List<Distillery> result = null;
//
//        Session session = entityManager.unwrap(Session.class);
//        Criteria criteria = session.createCriteria(Distillery.class);
//
//        criteria.createAlias("distilleries", "distillery");
//        criteria.add(Restrictions.eq("distillery.region", region));
//
//        result = criteria.list();
//
//        return result;
//    }
}

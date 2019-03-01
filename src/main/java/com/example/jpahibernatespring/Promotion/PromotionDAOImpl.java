package com.example.jpahibernatespring.Promotion;

import org.hibernate.Session;
import org.hibernate.query.Query;

import javax.persistence.EntityManager;
import java.util.List;

public class PromotionDAOImpl implements PromotionDAO {
    private EntityManager entityManager;
    public PromotionDAOImpl(EntityManager entityManager1)
    {
        entityManager=entityManager1;
    }

    @Override
    public List<PromotionEntity> findAll() {
        Session currentsession=entityManager.unwrap(Session.class);
        Query<PromotionEntity> query=
                currentsession.createQuery("from PromotionEntity",PromotionEntity.class);
        List<PromotionEntity> Et=query.getResultList();
        return Et;
    }

    @Override
    public void Add(PromotionEntity promotion) {
        Session currentSession = entityManager.unwrap(Session.class);

        // Enregistrement du formation

        currentSession.save(promotion);
    }

    @Override
    public void Deletebyannee(String annee) {
        Session currentsession=entityManager.unwrap(Session.class);

        Query<PromotionEntity> query=currentsession.createQuery("delete from PromotionEntity where anneeUniversitaire=:annee");
        query.setParameter("annee", annee);
        query.executeUpdate();
    }
}

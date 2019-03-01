package com.example.jpahibernatespring.Enseignant;

import org.hibernate.Session;
import org.hibernate.query.Query;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class EnseignantDAOImpl implements EnseignantDAO {
    private EntityManager entityManager;

    public EnseignantDAOImpl(EntityManager entityManager1)
    {
        entityManager=entityManager1;
    }
    @Override
    public List<EnseignantEntity> findAll() {
        Session currentsession=entityManager.unwrap(Session.class);
        Query<EnseignantEntity> query=
                currentsession.createQuery(" from EnseignantEntity",EnseignantEntity.class);

        List<EnseignantEntity> Et=query.getResultList();

        return Et;
    }

    @Override
    public void Add(EnseignantEntity enseignant) {
        Session currentSession = entityManager.unwrap(Session.class);



        currentSession.save(enseignant);
    }

    @Override
    @Transactional
    public void DeletebyId(String IDenseignant) {
        Session currentsession=entityManager.unwrap(Session.class);

        Query<EnseignantEntity> query=currentsession.createQuery("delete from EnseignantEntity where noEnseignant=:IDenseignant");
        query.setParameter("IDenseignant", IDenseignant);
        query.executeUpdate();
    }

    @Override
    public EnseignantEntity findById(String id) {
        Session currentsession=entityManager.unwrap(Session.class);
        EnseignantEntity enseignantEntity=currentsession.get(EnseignantEntity.class,id);
        return enseignantEntity;

    }

    @Override
    public EnseignantEntity findByName(String name) {
        Session currentsession=entityManager.unwrap(Session.class);
        Query<EnseignantEntity> query=
                currentsession.createQuery("from EnseignantEntity",EnseignantEntity.class);

        List<EnseignantEntity> ens=query.getResultList();

        for (EnseignantEntity c:ens){
            if(c.getNom().equalsIgnoreCase(name)) return c;
        }
        return null;
    }
}

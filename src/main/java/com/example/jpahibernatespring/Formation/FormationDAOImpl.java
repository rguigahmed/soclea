package com.example.jpahibernatespring.Formation;

import org.hibernate.Session;
import org.hibernate.query.Query;

import javax.persistence.EntityManager;
import java.util.List;

public class FormationDAOImpl implements FormationDAO {
    private EntityManager entityManager;
    public FormationDAOImpl(EntityManager entityManager1)
    {
        entityManager=entityManager1;
    }
    @Override
    public List<FormationEntity> findAll() {
        Session currentsession=entityManager.unwrap(Session.class);



        Query<FormationEntity> query=
                currentsession.createQuery(" from FormationEntity",FormationEntity.class);

        List<FormationEntity> Et=query.getResultList();

        return Et;
    }
    @Override
    public void Add(FormationEntity formation) {
        Session currentSession = entityManager.unwrap(Session.class);

        // Enregistrement du formation

        currentSession.save(formation);
    }
    @Override
    public void DeletebyId(String Codeformation) {
        Session currentsession=entityManager.unwrap(Session.class);

        Query<FormationEntity> query=currentsession.createQuery("delete from FormationEntity where codeFormation=:Codeformation");
        query.setParameter("Codeformation", Codeformation);
        query.executeUpdate();
    }

    @Override
    public FormationEntity findBycode(String code) {
        Session currentsession=entityManager.unwrap(Session.class);
        Query<FormationEntity> query=
                currentsession.createQuery("from FormationEntity",FormationEntity.class);

        List<FormationEntity> formation=query.getResultList();

        for (FormationEntity c:formation){
            if(c.getCodeFormation().equalsIgnoreCase(code)) return c;
        }
        return null;
    }
}

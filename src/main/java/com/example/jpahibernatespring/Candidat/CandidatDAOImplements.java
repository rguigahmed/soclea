

package com.example.jpahibernatespring.Candidat;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.hibernate.query.Query;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class CandidatDAOImplements implements CandidatDAO {

    private EntityManager entityManager;


    @Autowired
    public CandidatDAOImplements(EntityManager theentityManager){

        entityManager=theentityManager;
    }

    @Override
    @Transactional
    public void deleteById(String Id) {
        Session currentsession=entityManager.unwrap(Session.class);

        Query<CandidatEntity> query=currentsession.createQuery("delete from CandidatEntity where noCandidat=:Id");
        query.setParameter("Id", Id);
         query.executeUpdate();

    }

    @Override
    public List<CandidatEntity> findAll() {

        Session currentsession=entityManager.unwrap(Session.class);



        Query<CandidatEntity> query=
                currentsession.createQuery("from CandidatEntity",CandidatEntity.class);

        List<CandidatEntity> candidatEntities=query.getResultList();

        return candidatEntities;
    }

    @Override

    public void add(CandidatEntity candidat) {
        // Recupération de la session de candidat
        Session currentSession = entityManager.unwrap(Session.class);

        // Enregistrement du candidat

        currentSession.save(candidat);
    }

    @Override
    public CandidatEntity findById(String theId) {
        Session currentsession=entityManager.unwrap(Session.class);
        CandidatEntity candidat=currentsession.get(CandidatEntity.class,theId);
        return candidat;

        /*
        Query<Candidat> query=
                currentsession.createQuery("from Candidat",Candidat.class);

        List<Candidat> candidatEntities=query.getResultList();

        for (Candidat c:candidatEntities){
            if(c.getNoCandidat().equalsIgnoreCase(theId)) return c;
        }
        return null;
         */
    }

    @Override
    public CandidatEntity findByName(String name) {
       /*   Session currentsession=entityManager.unwrap(Session.class);
        Candidat candidat=currentsession.get(Candidat.class,name);
        return candidat;*/
        Session currentsession=entityManager.unwrap(Session.class);
        Query<CandidatEntity> query=
                currentsession.createQuery("from CandidatEntity",CandidatEntity.class);

        List<CandidatEntity> candidatEntities=query.getResultList();

        for (CandidatEntity c:candidatEntities){
            if(c.getNom().equalsIgnoreCase(name)) return c;
        }
        return null;
    }
}
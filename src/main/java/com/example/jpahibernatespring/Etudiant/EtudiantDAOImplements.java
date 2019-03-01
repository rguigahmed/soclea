package com.example.jpahibernatespring.Etudiant;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.hibernate.query.Query;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class EtudiantDAOImplements implements EtudiantDAO{
    private EntityManager entityManager;
    public EtudiantDAOImplements(EntityManager entityManager1)
    {
        entityManager=entityManager1;
    }

    @Override
    @Transactional
    public void DeletebyId(String Id) {
        Session currentsession=entityManager.unwrap(Session.class);

        Query<EtudiantEntity> query=currentsession.createQuery("delete from EtudiantEntity where noEtudiant=:Id");
        query.setParameter("Id", Id);
        query.executeUpdate();

    }
    @Override
    public List<EtudiantEntity> findAll() {

        Session currentsession=entityManager.unwrap(Session.class);



        Query<EtudiantEntity> query=
                currentsession.createQuery("from EtudiantEntity",EtudiantEntity.class);

        List<EtudiantEntity> Et=query.getResultList();

        return Et;
    }

    @Override
    public void Add(EtudiantEntity etudiantEntity) {

        Session currentSession = entityManager.unwrap(Session.class);

        // Enregistrement du candidat

        currentSession.save(etudiantEntity);
    }

    @Override
    public EtudiantEntity findById(String theId) {
        Session currentsession=entityManager.unwrap(Session.class);
        EtudiantEntity etudiant=currentsession.get(EtudiantEntity.class,theId);
        return etudiant;


    }

    @Override
    public EtudiantEntity findByName(String name) {

        Session currentsession=entityManager.unwrap(Session.class);
        Query<EtudiantEntity> query=
                currentsession.createQuery("from EtudiantEntity",EtudiantEntity.class);

        List<EtudiantEntity> etudiant=query.getResultList();

        for (EtudiantEntity c:etudiant){
            if(c.getNom().equalsIgnoreCase(name)) return c;
        }
        return null;
    }
}

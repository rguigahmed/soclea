package com.example.jpahibernatespring.Etudiant;
import java.util.List;
@org.springframework.stereotype.Repository
public interface EtudiantDAO {
    public List<EtudiantEntity> findAll();
    public void Add(EtudiantEntity etudiant);
    public void DeletebyId(String etudiant);
    public EtudiantEntity findById(String id);
    public EtudiantEntity findByName(String name);
}

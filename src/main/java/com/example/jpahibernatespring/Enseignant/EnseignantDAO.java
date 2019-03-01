package com.example.jpahibernatespring.Enseignant;

import java.util.List;
@org.springframework.stereotype.Repository
public interface EnseignantDAO {
    public List<EnseignantEntity> findAll();
    public void Add(EnseignantEntity enseignant);
    public void DeletebyId(String enseignant);
    public EnseignantEntity findById(String id);
    public EnseignantEntity findByName(String name);
}

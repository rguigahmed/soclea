package com.example.jpahibernatespring.Candidat;


import java.util.List;

public interface CandidatDAO {
    public List<CandidatEntity> findAll();
    public void add(CandidatEntity candidat);
    public  CandidatEntity findById(String theId);
    public CandidatEntity findByName(String name);
    public void deleteById(String Id);
}
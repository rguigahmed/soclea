package com.example.jpahibernatespring.Formation;

import java.util.List;

public interface FormationDAO {
    public List<FormationEntity> findAll();
    public void Add(FormationEntity formation);
    public void DeletebyId(String formation);
    public FormationEntity findBycode(String code);

}

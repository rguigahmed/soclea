package com.example.jpahibernatespring.Promotion;

import java.util.List;

public interface PromotionDAO {
    public List<PromotionEntity> findAll();
    public void Add(PromotionEntity promotion);
    public void Deletebyannee(String promotion);
    ;

}

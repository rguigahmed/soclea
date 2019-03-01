package com.example.jpahibernatespring.Promotion;

import com.example.jpahibernatespring.Promotion.PromotionEntity;
import com.example.jpahibernatespring.Etudiant.EtudiantEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class PromotionController {
    @Autowired
    private PromotionDAO promotionDAO;
    @PostMapping("/creerpromotion")
    public PromotionEntity CreerPromotion(@RequestBody PromotionEntity promotionEntity) {
        promotionDAO.Add(promotionEntity);
        return promotionEntity;
    }

    @RequestMapping("/promotion")
    public List<PromotionEntity> findAll(){
        return promotionDAO.findAll();
    }


}

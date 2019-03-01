package com.example.jpahibernatespring.Candidat;


import com.example.jpahibernatespring.Candidat.CandidatDAO;
import com.example.jpahibernatespring.Candidat.CandidatEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.HttpSessionRequiredException;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
@Configuration
@ComponentScan(value = "com.example.jpahibernatespring.Candidat")

public class CandidatController  {


    @Autowired
    private CandidatDAO candidatDAO;
    @PostMapping("/creercandidats")
    public CandidatEntity CreerCandidat(@RequestBody CandidatEntity candidat) {
        candidatDAO.add(candidat);
        return candidat;
    }

    @RequestMapping("/candidat")
    public List<CandidatEntity> findAll(){
        return candidatDAO.findAll();
    }
    @RequestMapping("/{candidat}")
    public CandidatEntity getCandidat(@PathVariable("id") String id){
        CandidatEntity candidat=candidatDAO.findById(id);

        if(candidat==null){
            throw new RuntimeException("Candidat n'existe pas :"+candidat);

        }
        return candidat;
    }
    @RequestMapping("/candidats/names/{name}")
    public CandidatEntity getCandidatName(@PathVariable("name")String name){
        CandidatEntity candidat=candidatDAO.findByName(name);
        if(candidat==null){
            throw new RuntimeException("Candidat n'existe pas :"+candidat);

        }
        return candidat;
    }
    @RequestMapping("/candidats/Ids/{id}")
    public CandidatEntity getCandidatId(@PathVariable("id")String id){
        CandidatEntity candidat=candidatDAO.findById(id);
        if(candidat==null){
            throw new RuntimeException("Candidat n'existe pas :"+candidat);

        }
        return candidat;
    }
    @DeleteMapping("/supprimer/ids/{id}")
    public String deleteCandidatId(@PathVariable("id")String id){
        CandidatEntity candidat=candidatDAO.findById(id);
        String mes1="Candidat non existant";
        String mes2="Candidat supprimé ! ";
        if (candidat == null) {
            throw new RuntimeException("Employee id not found - " + id);
        }
        candidatDAO.deleteById(id);
        return "Deleted employee id - " + id;
    }
        }


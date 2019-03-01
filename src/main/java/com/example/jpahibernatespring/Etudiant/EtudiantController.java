package com.example.jpahibernatespring.Etudiant;
import com.example.jpahibernatespring.Etudiant.EtudiantDAO;
import com.example.jpahibernatespring.Etudiant.EtudiantEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.HttpSessionRequiredException;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/apietudiant")
@Configuration
@ComponentScan(value = "com.example.jpahibernatespring.Etudiant")
public class EtudiantController  {


    @Autowired
    private EtudiantDAO etudiantDAO;
    @PostMapping("/creeretudiants")
    public EtudiantEntity CreerEtudiant(@RequestBody EtudiantEntity etudiant) {
        etudiantDAO.Add(etudiant);
        return etudiant;
    }

    @RequestMapping("/etudiant")
    public List<EtudiantEntity> findAll(){
        return etudiantDAO.findAll();
    }
    @RequestMapping("/{etudiant}")
    public EtudiantEntity getEtudiat(@PathVariable("id") String id){
        EtudiantEntity etudiant=etudiantDAO.findById(id);

        if(etudiant==null){
            throw new RuntimeException("Etudiant n'existe pas :"+etudiant);

        }
        return etudiant;
    }
    @RequestMapping("/etudiants/names/{name}")
    public EtudiantEntity getCandidatName(@PathVariable("name")String name){
        EtudiantEntity etudiant=etudiantDAO.findByName(name);
        if(etudiant==null){
            throw new RuntimeException("Etudiant n'existe pas :"+etudiant);

        }
        return etudiant;
    }
    @RequestMapping("/etudiants/Ids/{id}")
    public EtudiantEntity getEtudiantbyId(@PathVariable("id")String id){
        EtudiantEntity etudiant=etudiantDAO.findById(id);
        if(etudiant==null){
            throw new RuntimeException("Etudiant n'existe pas :"+etudiant);

        }
        return etudiant;
    }
    @DeleteMapping("/supprimer/ids/{id}")
    public String deleteEtudiantId(@PathVariable("id")String id){
        EtudiantEntity etudiant=etudiantDAO.findById(id);

        if (etudiant == null) {
            throw new RuntimeException("etudiant id not found - " + id);
        }
        etudiantDAO.DeletebyId(id);
        return "Deleted etudiant id - " + id;
    }
}


package com.example.jpahibernatespring.Enseignant;

import com.example.jpahibernatespring.Candidat.CandidatDAO;
import com.example.jpahibernatespring.Candidat.CandidatEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/apiens")
@Configuration
@ComponentScan(value = "com.example.jpahibernatespring.Enseignant")
public class EnseignantController {

        @Autowired
        private EnseignantDAO enseignantDAO;
        @PostMapping("/creerenseignant")
        public EnseignantEntity CreerCandidat(@RequestBody EnseignantEntity enseignantEntity) {
            enseignantDAO.Add(enseignantEntity);
            return enseignantEntity;
        }

        @RequestMapping("/enseignant")
        public List<EnseignantEntity> findAll(){
            return enseignantDAO.findAll();
        }
        @RequestMapping("/{enseignant}")
        public EnseignantEntity getCandidat(@PathVariable("id") String id){
            EnseignantEntity enseignantEntity=enseignantDAO.findById(id);

            if(enseignantEntity==null){
                throw new RuntimeException("Candidat n'existe pas :"+enseignantEntity);

            }
            return enseignantEntity;
        }
        @RequestMapping("/enseignants/names/{name}")
        public EnseignantEntity getCandidatName(@PathVariable("name")String name){
            EnseignantEntity enseignantEntity=enseignantDAO.findByName(name);
            if(enseignantEntity==null){
                throw new RuntimeException("Enseignant n'existe pas :"+enseignantEntity);

            }
            return enseignantEntity;
        }
        @RequestMapping("/enseignants/Ids/{id}")
        public EnseignantEntity getCandidatId(@PathVariable("id")String id){
            EnseignantEntity enseignantEntity=enseignantDAO.findById(id);
            if(enseignantEntity==null){
                throw new RuntimeException("Candidat n'existe pas :"+enseignantEntity);

            }
            return enseignantEntity;
        }
        @DeleteMapping("/supprimer/ids/{id}")
        public String deleteCandidatId(@PathVariable("id")String id){
            EnseignantEntity enseignantEntity=enseignantDAO.findById(id);

            if (enseignantEntity == null) {
                throw new RuntimeException("Enseignant id not found - " + id);
            }
            enseignantDAO.DeletebyId(id);
            return "Deleted enseignant id - " + id;
        }
    }




package com.example.jpahibernatespring.Promotion;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "PROMOTION", schema = "bvnzmzeguiw04km5iyu2", catalog = "")
public class PromotionEntity {
    private String anneeUniversitaire;
    private String siglePromotion;
    private Short nbMaxEtudiant;
    private Timestamp dateReponseLp;
    private Timestamp dateReponseLalp;
    private Timestamp dateRentree;
    private String lieuRentree;
    private String processusStage;
    private String commentaire;

    @Basic
    @Column(name = "ANNEE_UNIVERSITAIRE")
    public String getAnneeUniversitaire() {
        return anneeUniversitaire;
    }

    public void setAnneeUniversitaire(String anneeUniversitaire) {
        this.anneeUniversitaire = anneeUniversitaire;
    }

    @Basic
    @Column(name = "SIGLE_PROMOTION")
    public String getSiglePromotion() {
        return siglePromotion;
    }

    public void setSiglePromotion(String siglePromotion) {
        this.siglePromotion = siglePromotion;
    }

    @Basic
    @Column(name = "NB_MAX_ETUDIANT")
    public Short getNbMaxEtudiant() {
        return nbMaxEtudiant;
    }

    public void setNbMaxEtudiant(Short nbMaxEtudiant) {
        this.nbMaxEtudiant = nbMaxEtudiant;
    }

    @Basic
    @Column(name = "DATE_REPONSE_LP")
    public Timestamp getDateReponseLp() {
        return dateReponseLp;
    }

    public void setDateReponseLp(Timestamp dateReponseLp) {
        this.dateReponseLp = dateReponseLp;
    }

    @Basic
    @Column(name = "DATE_REPONSE_LALP")
    public Timestamp getDateReponseLalp() {
        return dateReponseLalp;
    }

    public void setDateReponseLalp(Timestamp dateReponseLalp) {
        this.dateReponseLalp = dateReponseLalp;
    }

    @Basic
    @Column(name = "DATE_RENTREE")
    public Timestamp getDateRentree() {
        return dateRentree;
    }

    public void setDateRentree(Timestamp dateRentree) {
        this.dateRentree = dateRentree;
    }

    @Basic
    @Column(name = "LIEU_RENTREE")
    public String getLieuRentree() {
        return lieuRentree;
    }

    public void setLieuRentree(String lieuRentree) {
        this.lieuRentree = lieuRentree;
    }

    @Basic
    @Column(name = "PROCESSUS_STAGE")
    public String getProcessusStage() {
        return processusStage;
    }

    public void setProcessusStage(String processusStage) {
        this.processusStage = processusStage;
    }

    @Basic
    @Column(name = "COMMENTAIRE")
    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PromotionEntity that = (PromotionEntity) o;
        return Objects.equals(anneeUniversitaire, that.anneeUniversitaire) &&
                Objects.equals(siglePromotion, that.siglePromotion) &&
                Objects.equals(nbMaxEtudiant, that.nbMaxEtudiant) &&
                Objects.equals(dateReponseLp, that.dateReponseLp) &&
                Objects.equals(dateReponseLalp, that.dateReponseLalp) &&
                Objects.equals(dateRentree, that.dateRentree) &&
                Objects.equals(lieuRentree, that.lieuRentree) &&
                Objects.equals(processusStage, that.processusStage) &&
                Objects.equals(commentaire, that.commentaire);
    }

    @Override
    public int hashCode() {
        return Objects.hash(anneeUniversitaire, siglePromotion, nbMaxEtudiant, dateReponseLp, dateReponseLalp, dateRentree, lieuRentree, processusStage, commentaire);
    }
}

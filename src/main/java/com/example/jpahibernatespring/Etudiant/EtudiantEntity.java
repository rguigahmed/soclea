package com.example.jpahibernatespring.Etudiant;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "ETUDIANT", schema = "bvnzmzeguiw04km5iyu2", catalog = "")
public class EtudiantEntity {
    private String noEtudiant;
    private String nom;
    private String prenom;
    private String sexe;
    private Timestamp dateNaissance;
    private String lieuNaissance;
    private String nationalite;
    private String telephone;
    private String mobile;
    private String email;
    private String emailUbo;
    private String adresse;
    private String codePostal;
    private String ville;
    private String paysOrigine;
    private String universiteOrigine;
    private Double groupeTp;
    private Double groupeAnglais;

    @Id
    @Column(name = "NO_ETUDIANT")
    public String getNoEtudiant() {
        return noEtudiant;
    }

    public void setNoEtudiant(String noEtudiant) {
        this.noEtudiant = noEtudiant;
    }

    @Basic
    @Column(name = "NOM")
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Basic
    @Column(name = "PRENOM")
    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Basic
    @Column(name = "SEXE")
    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    @Basic
    @Column(name = "DATE_NAISSANCE")
    public Timestamp getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Timestamp dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    @Basic
    @Column(name = "LIEU_NAISSANCE")
    public String getLieuNaissance() {
        return lieuNaissance;
    }

    public void setLieuNaissance(String lieuNaissance) {
        this.lieuNaissance = lieuNaissance;
    }

    @Basic
    @Column(name = "NATIONALITE")
    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    @Basic
    @Column(name = "TELEPHONE")
    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Basic
    @Column(name = "MOBILE")
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Basic
    @Column(name = "EMAIL")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "EMAIL_UBO")
    public String getEmailUbo() {
        return emailUbo;
    }

    public void setEmailUbo(String emailUbo) {
        this.emailUbo = emailUbo;
    }

    @Basic
    @Column(name = "ADRESSE")
    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Basic
    @Column(name = "CODE_POSTAL")
    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    @Basic
    @Column(name = "VILLE")
    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    @Basic
    @Column(name = "PAYS_ORIGINE")
    public String getPaysOrigine() {
        return paysOrigine;
    }

    public void setPaysOrigine(String paysOrigine) {
        this.paysOrigine = paysOrigine;
    }

    @Basic
    @Column(name = "UNIVERSITE_ORIGINE")
    public String getUniversiteOrigine() {
        return universiteOrigine;
    }

    public void setUniversiteOrigine(String universiteOrigine) {
        this.universiteOrigine = universiteOrigine;
    }

    @Basic
    @Column(name = "GROUPE_TP")
    public Double getGroupeTp() {
        return groupeTp;
    }

    public void setGroupeTp(Double groupeTp) {
        this.groupeTp = groupeTp;
    }

    @Basic
    @Column(name = "GROUPE_ANGLAIS")
    public Double getGroupeAnglais() {
        return groupeAnglais;
    }

    public void setGroupeAnglais(Double groupeAnglais) {
        this.groupeAnglais = groupeAnglais;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EtudiantEntity that = (EtudiantEntity) o;
        return Objects.equals(noEtudiant, that.noEtudiant) &&
                Objects.equals(nom, that.nom) &&
                Objects.equals(prenom, that.prenom) &&
                Objects.equals(sexe, that.sexe) &&
                Objects.equals(dateNaissance, that.dateNaissance) &&
                Objects.equals(lieuNaissance, that.lieuNaissance) &&
                Objects.equals(nationalite, that.nationalite) &&
                Objects.equals(telephone, that.telephone) &&
                Objects.equals(mobile, that.mobile) &&
                Objects.equals(email, that.email) &&
                Objects.equals(emailUbo, that.emailUbo) &&
                Objects.equals(adresse, that.adresse) &&
                Objects.equals(codePostal, that.codePostal) &&
                Objects.equals(ville, that.ville) &&
                Objects.equals(paysOrigine, that.paysOrigine) &&
                Objects.equals(universiteOrigine, that.universiteOrigine) &&
                Objects.equals(groupeTp, that.groupeTp) &&
                Objects.equals(groupeAnglais, that.groupeAnglais);
    }

    @Override
    public int hashCode() {
        return Objects.hash(noEtudiant, nom, prenom, sexe, dateNaissance, lieuNaissance, nationalite, telephone, mobile, email, emailUbo, adresse, codePostal, ville, paysOrigine, universiteOrigine, groupeTp, groupeAnglais);
    }
}

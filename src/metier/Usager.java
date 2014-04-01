/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package metier;

/**
 *
 * @author Mehdi
 */
public class Usager {
 int id;
 String nom;
 String prenom;
 String dateDeNaissance;
 String lieuDeNaissance;
 String adresse;
 int code_postal;
 String ville;
 String email;
 String nationalite;

    public Usager() {
    }

    public Usager(String nom, String prenom, String dateDeNaissance, String lieuDeNaissance, String adresse, int code_postal, String ville, String email, String nationalite) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissance = dateDeNaissance;
        this.lieuDeNaissance = lieuDeNaissance;
        this.adresse = adresse;
        this.code_postal = code_postal;
        this.ville = ville;
        this.email = email;
        this.nationalite = nationalite;
    }

    public Usager(int id, String nom, String prenom, String dateDeNaissance, String lieuDeNaissance,
            String adresse, int code_postal, String ville, String email, String nationalite) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissance = dateDeNaissance;
        this.lieuDeNaissance = lieuDeNaissance;
        this.adresse = adresse;
        this.code_postal = code_postal;
        this.ville = ville;
        this.email = email;
        this.nationalite = nationalite;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(String dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    public String getLieuDeNaissance() {
        return lieuDeNaissance;
    }

    public void setLieuDeNaissance(String lieuDeNaissance) {
        this.lieuDeNaissance = lieuDeNaissance;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getCode_postal() {
        return code_postal;
    }

    public void setCode_postal(int code_postal) {
        this.code_postal = code_postal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }
 
}

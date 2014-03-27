/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package metier;

/**
 *
 * @author nebelmahi
 */
public class Personnel {
     private int id;
    private String nom;
    private String prenom;
    private String dateNais;
    private String  email;
    private String password;
    private String codePostale;
    private String adresse;
    private String ville;
    private String statut;
    private int idService;
    
    
      public Personnel(int id) {
        this.id = id;
    }

    public Personnel(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public Personnel(int id,String nom, String prenom, String dateNais, String email, String codePostale, String adresse, String ville, String statut) {
        this.id=id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNais = dateNais;
        this.email = email;
        this.codePostale = codePostale;
        this.adresse = adresse;
        this.ville = ville;
        this.statut = statut;
    }

    public Personnel(String nom, String prenom, String dateNais, String email, String password, String codePostale, String adresse, String ville, String statut, int idService) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNais = dateNais;
        this.email = email;
        this.password = password;
        this.codePostale = codePostale;
        this.adresse = adresse;
        this.ville = ville;
        this.statut = statut;
        this.idService = idService;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getDateNais() {
        return dateNais;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getCodePostale() {
        return codePostale;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getVille() {
        return ville;
    }

    public String getStatut() {
        return statut;
    }

    public int getIdService() {
        return idService;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setDateNais(String dateNais) {
        this.dateNais = dateNais;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCodePostale(String codePostale) {
        this.codePostale = codePostale;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public void setIdService(int idService) {
        this.idService = idService;
    }

    @Override
    public String toString() {
        return  nom + " " + prenom + "";
    }
      
    
}

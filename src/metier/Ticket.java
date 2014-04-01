package metier;

/***********************************************************************
 * Module:  Ticket.java
 * Author:  Mehdi
 * Purpose: Defines the Class Ticket
 ***********************************************************************/


public class Ticket {
   private int id;
   private SousService sousService;
   private Usager usager;
   private String dateCreation;
   private String etatDemande;
   private String descriptionDemande;
   private String titreDemande;
   private String dateDebutTraitement;
   private String dateEstimee;
   private String priorite;
   private Personnel personnel;

    public Ticket(int id, SousService sousService, Usager usager,Personnel personnel, String dateCreation, String etatDemande, String descriptionDemande, String titreDemande, String dateDebutTraitement, String dateEstimee, String priorite) {
        this.id = id;
        this.sousService = sousService;
        this.usager = usager;
        this.personnel=personnel;
        this.dateCreation = dateCreation;
        this.etatDemande = etatDemande;
        this.descriptionDemande = descriptionDemande;
        this.titreDemande = titreDemande;
        this.dateDebutTraitement = dateDebutTraitement;
        this.dateEstimee = dateEstimee;
        this.priorite = priorite;
    }

    public Ticket(SousService sousService, Usager usager,Personnel personnel, String dateCreation, String etatDemande, String descriptionDemande, String titreDemande, String dateDebutTraitement, String dateEstimee, String priorite) {
        this.sousService = sousService;
        this.usager = usager;
        this.personnel = personnel;
        this.dateCreation = dateCreation;
        this.etatDemande = etatDemande;
        this.descriptionDemande = descriptionDemande;
        this.titreDemande = titreDemande;
        this.dateDebutTraitement = dateDebutTraitement;
        this.dateEstimee = dateEstimee;
        this.priorite = priorite;
    }

    public Personnel getPersonnel() {
        return personnel;
    }

    public void setPersonnel(Personnel personnel) {
        this.personnel = personnel;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public SousService getSousService() {
        return sousService;
    }

    public void setSousService(SousService sousService) {
        this.sousService = sousService;
    }

    public Usager getUsager() {
        return usager;
    }

    public void setUsager(Usager usager) {
        this.usager = usager;
    }

    public String getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(String dateCreation) {
        this.dateCreation = dateCreation;
    }

    public String getEtatDemande() {
        return etatDemande;
    }

    public void setEtatDemande(String etatDemande) {
        this.etatDemande = etatDemande;
    }

    public String getDescriptionDemande() {
        return descriptionDemande;
    }

    public void setDescriptionDemande(String descriptionDemande) {
        this.descriptionDemande = descriptionDemande;
    }

    public String getTitreDemande() {
        return titreDemande;
    }

    public void setTitreDemande(String titreDemande) {
        this.titreDemande = titreDemande;
    }

    public String getDateDebutTraitement() {
        return dateDebutTraitement;
    }

    public void setDateDebutTraitement(String dateDebutTraitement) {
        this.dateDebutTraitement = dateDebutTraitement;
    }

    public String getDateEstimee() {
        return dateEstimee;
    }

    public void setDateEstimee(String dateEstimee) {
        this.dateEstimee = dateEstimee;
    }

    public String getPriorite() {
        return priorite;
    }

    public void setPriorite(String priorite) {
        this.priorite = priorite;
    }

    

   
   
}
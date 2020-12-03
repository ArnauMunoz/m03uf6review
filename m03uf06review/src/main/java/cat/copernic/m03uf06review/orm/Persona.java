/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03uf06review.orm;

import java.sql.Date;

/**
 *
 * @author Arnau
 */
public class Persona {

    private Integer persona_id;
    private String persona_nom;
    private String persona_direccio;
    private Double persona_altura;
    private Boolean persona_viva;
    private Date persona_naixement;

    private String viva;

    //Constructor
    public Persona(Integer persona_id, String persona_nom, String persona_direccio, Double persona_altura, Boolean persona_viva, Date persona_naixement) {
        this.persona_id = persona_id;
        this.persona_nom = persona_nom;
        this.persona_direccio = persona_direccio;
        this.persona_altura = persona_altura;
        this.persona_viva = persona_viva;
        this.persona_naixement = persona_naixement;
    }

    //Getters & Setters
    public Integer getPersona_id() {
        return persona_id;
    }

    public void setPersona_id(Integer persona_id) {
        this.persona_id = persona_id;
    }

    public String getPersona_nom() {
        return persona_nom;
    }

    public void setPersona_nom(String persona_nom) {
        this.persona_nom = persona_nom;
    }

    public String getPersona_direccio() {
        return persona_direccio;
    }

    public void setPersona_direccio(String persona_direccio) {
        this.persona_direccio = persona_direccio;
    }

    public Double getPersona_altura() {
        return persona_altura;
    }

    public void setPersona_altura(Double persona_altura) {
        this.persona_altura = persona_altura;
    }

    public Boolean getPersona_viva() {
        return persona_viva;
    }

    public void setPersona_viva(Boolean persona_viva) {
        this.persona_viva = persona_viva;
    }

    public Date getPersona_naixement() {
        return persona_naixement;
    }

    public void setPersona_naixement(Date persona_naixement) {
        this.persona_naixement = persona_naixement;
    }

    //To Stringgggggg
    @Override
    public String toString() {

        if (persona_viva = true) {
            viva = "Si.";
        } else {
            viva = "No.";
        }

        return "Persona ID --> " + persona_id + "   -Nom: " + persona_nom + " "
                + "-Direcció: " + persona_direccio + " -Altura: "
                + persona_altura + " -Esta viva? " + viva + " -Dia de "
                + "naixement: " + persona_naixement + "\n";
    }

}

package service;

package com.example.demo.data.service;

public class Echantillon {

    int nombreDeVoitures;

    int PrixMoyen;

    public Echantillon(){}
    public Echantillon(int nombreDeVoitures,int PrixMoyen) {
        this.nombreDeVoitures = nombreDeVoitures;
        this.PrixMoyen = PrixMoyen;
    }

    public int getNombreDeVoitures() {
        return nombreDeVoitures;
    }

    public void setNombreDeVoitures(int nombreDeVoitures) {
        this.nombreDeVoitures = nombreDeVoitures;
    }

    public int getPrixMoyen() {
        return PrixMoyen;
    }

    public void setPrixMoyen(int prixMoyen) {
        PrixMoyen = prixMoyen;
    }
}

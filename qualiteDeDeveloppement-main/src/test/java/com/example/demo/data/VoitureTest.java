package com.example.demo.data;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
public class VoitureTest {


    @Test
    void creerVoiture(){
        Voiture voiture = new Voiture("Mercedes",0);
        Assert.isNull(voiture.getMarque(), "Marqué non donnée");
        Assert.notNull(voiture.getMarque(), "C'est une"+voiture.getMarque());
        Assert.isTrue(voiture.getPrix()==0, "La voiture est gratuite, felicitations !!!");
    }

    @Test
    void testVoitureNull(){
        Voiture voiture = new Voiture("Mercedes", 50000);
        Assert.isInstanceOf(Voiture.class, voiture, "Non voiture");

    }

    @Test
    void testValeursVoitureNull(){
        Voiture voiture = new Voiture();

        Assert.isNull(voiture.getMarque(), "La voiture n'a pas de marque");
        Assert.isTrue(voiture.getPrix()==0, " zero pointé ");
        Assert.isTrue(voiture.getId()==0, " zero pointé ");

    }


    @Test
    void test2voitures(){
        Voiture voiture1 = new Voiture("Mercedes", 50000);
        Voiture voiture2 = new Voiture("Mercedes", 50000);
        Assert.isTrue(voiture1.getPrix()==voiture2.getPrix(), " meme prix ");
        Assert.isTrue(voiture1.getMarque()==voiture2.getMarque(), " meme nom ");
        Assert.isTrue(voiture1.getId()==voiture2.getId(), " Impossible ! ");
    }

    @Test
    void testSynthaxeVoiture(){

        Voiture voiture1 = new Voiture("Mercedes", 50000);
        Assert.isTrue(voiture1.getMarque().startsWith("M"), " ça commence par M ");

    }

    @Test
    void testPrixVoiture(){

        Voiture voiture1 = new Voiture("Mercedes", 50000);
        Assert.isTrue(voiture1.getPrix() >= 100000," C'est cher ");

    }




}

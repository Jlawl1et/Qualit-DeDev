package com.example.demo.data;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@DataJpaTest
public class StatistiqueTest {

    Test
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



}

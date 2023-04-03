package com.example.demo.data;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.stubbing.Answer;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.util.Assert;


import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Arrays;
import java.util.Optional;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@SpringBootTest
public class BaseDeDonneesTests {

    @MockBean
    private VoitureRepository voitureRepository;

    @Test
    void uneVoiture(){
        Voiture voiture = new Voiture("Renault", 2500);
        when(voitureRepository.save(voiture)).thenReturn(voiture);
    }

    @Test
    void testCount(){
        Voiture renault = new Voiture("Renault", 2500);
        Voiture fiat = new Voiture("Fiat", 2000);
        Voiture mercedes = new Voiture("Renault", 5000);
        Voiture audi = new Voiture("Fiat", 40000);
        Voiture ford = new Voiture("Renault", 5000);
        Voiture ferrari = new Voiture("Fiat", 500000);
        when(voitureRepository.count());

    }

    @Test
    void testSuppVoiture(){

        Voiture v = new Voiture("Big Bill",777);

        voitureRepository.delete(v);

        verify(voitureRepository).delete(v);
    }
    


}

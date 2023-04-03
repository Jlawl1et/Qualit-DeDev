package com.example.demo;

import com.example.demo.data.Voiture;
import com.example.demo.data.VoitureRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private VoitureRepository voitureRepository;

	private static final Logger logger = LoggerFactory.getLogger(VoitureRepository.class);

	public static void main(String[] args) { SpringApplication.run(DemoApplication.class, args);}

	@Override
	public void run(String... args) throws Exception {


//		Implémentation de l'interface CommandLineRunner
//
//			Permet d'éxécuter des instructions avant le lancement'

		voitureRepository.save(new Voiture("Toyota",45000));
		voitureRepository.save(new Voiture("Renault espace",1995));
		voitureRepository.save(new Voiture("Ferrari",100000));
		voitureRepository.save(new Voiture("Mercedes",50000));


		for (Voiture v : voitureRepository.findAll()){
			logger.info(v.getMarque() + " : " + v.getPrix());
		}
	}
}

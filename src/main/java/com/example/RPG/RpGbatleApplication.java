package com.example.RPG;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import classes.mago;

@SpringBootApplication
public class RpGbatleApplication {

	public static void main(String[] args) {
		SpringApplication.run(RpGbatleApplication.class, args);
		
	mago humano = new mago();
	humano.setNome("elson");
	humano.setNivel(1);
	humano.setExp(00.00);
	humano.setInteligencia(50.00);
	humano.setMana(100.00);
	humano.setArma("cajado");
	
	
		System.out.print
		("nome do mago " + humano.getNome() +" nivel " + humano.getNivel() +" experiencia " +  humano.getExp() + 
		 " inteligencia " + humano.getInteligencia()+ " mana " + humano.getMana() + 
						 " arma " + humano.getArma());
		
	}

}


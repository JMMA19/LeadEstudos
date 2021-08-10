package com.example.RPG;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ClassesDeMonstros.Cerbero;
import ClassesDeMonstros.Engia;
import classes.Ladino;
import classes.Mago;

@SpringBootApplication
public class RpGbatleApplication {

	public static void main(String[] args) {
		SpringApplication.run(RpGbatleApplication.class, args);
		
	Mago humano = new Mago();
	humano.setNome("elson");
	humano.setNivel(1);
	humano.setExp(00.00);
	humano.setInteligencia(50.00);
	humano.setMana(100.00);
	humano.setArma("cajado");
	 
    Ladino humano2 = new Ladino();
    humano2.setNome("jaguar");
	humano2.setNivel(4);
	humano2.setExp(00.01);
	humano2.setInteligencia(10.00);
	humano2.setMana(00.00);
	humano2.setArma("Sspada");
	
	Cerbero monstro = new Cerbero();
	monstro.setPontoDeVida(100.00);
	monstro.setTipoDeDano("Mordida");
	monstro.setEXP(1000.00);
	monstro.setNivel(100);
	monstro.setForca(500);
	
	Engia monstro2 = new Engia();
	monstro2.setPontoDeVida(100.00);
	monstro2.setTipoDeDano("Eletricidade e poison");
	monstro2.setEXP(300.00);
	monstro2.setNivel(99);
	monstro2.setForca(500);
	
	
	
	
		System.out.println("nome do mago: " + humano.getNome() +" nivel: " + humano.getNivel() +" experiencia: " +  humano.getExp() + 
		 " inteligencia: " + humano.getInteligencia()+ " mana: " + humano.getMana() + 
		 " arma: " + humano.getArma());
		
		System.out.println("nome do Ladino è: " + humano2.getNome() +" nivel: " + humano2.getNivel() +" experiencia: " +  humano2.getExp() + 
		 " inteligencia: " + humano2.getInteligencia()+ " mana: " + humano2.getMana() + 
		 " arma " + humano2.getArma());
		
			System.out.println(" Os monstros do campo de batalha são:");
			
		System.out.println("nome do Monstro é: " + monstro.getNome() +" nivel :" + monstro.getNivel() +" experiencia: " +  monstro.getEXP() + 
				 " o tipo de dano dele é: " + monstro.getTipoDeDano()+ " força: " + monstro.getForca() + 
				 " Vida Maxima: " + monstro.getPontoDeVida());
		
		System.out.println("nome do Monstro é: " + monstro2.getNome() +" nivel :" + monstro2.getNivel() +" experiencia: " +  monstro2.getEXP() + 
				 " o tipo de dano dele é: " + monstro2.getTipoDeDano()+ " força: " + monstro2.getForca() + 
				 " Vida Maxima: " + monstro2.getPontoDeVida());
	}

}


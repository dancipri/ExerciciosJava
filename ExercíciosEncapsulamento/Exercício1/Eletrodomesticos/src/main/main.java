package main;

import model.Eletrodomesticos;

public class main {

	public static void main(String[] args) {
		Eletrodomesticos eletrodomestico = new Eletrodomesticos();
		
		eletrodomestico.setLigado(true);
		eletrodomestico.setNomeDoEletro("Microondas");
		eletrodomestico.setCor("Cinza");
		eletrodomestico.setFormato("Retangular");
		
		eletrodomestico.ligarEletro();
		eletrodomestico.desligarEletro();

	}

}

package main;

import model.Veiculo;

public class main {

	public static void main(String[] args) {

		Veiculo carro = new Veiculo();
		
		carro.setMarca("Relampago Mcqueen");
		carro.setAno("2020");
		carro.setVelocidade(50);

		carro.acelerador();
		carro.curva();
		carro.freio();
	}

}

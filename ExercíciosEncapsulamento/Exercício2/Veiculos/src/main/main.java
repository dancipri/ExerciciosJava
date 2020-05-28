package main;

import veiculo.Carro;
import veiculo.Moto;

public class main {

	public static void main(String[] args) {
		
		Carro carro = new Carro();
		
		carro.setMarca("Mitsubishi Lancer");
		carro.setCor("Azul");
		carro.setNumeroBancos("4");
		carro.setNumeroPortas("4");
		carro.setTemArCondicionado(true);
		carro.setTemCameraTraseira(true);
		carro.setTemDirecaohidraulica(true);
		carro.setTemVidroEletrico(true);
		carro.setAnoFabricação("2019");
		
		carro.ligarVeiculo();
		carro.corVeiculo();
		carro.desligarVeiculo();
		carro.mostraNumeroPortas();
		carro.mostraNumeroBancos();
		
		System.out.println("\n--------------------------------------------------------------------\n");
		
		Moto moto = new Moto();
		
		moto.setAnoFabricação("2020");
		moto.setCor("Preta");
		moto.setCilindrada("150");
		moto.setMarca("Kawasaki");
		
		moto.ligarVeiculo();
		moto.mostracilindrada();
		moto.mostraPezinho();
		moto.desligarVeiculo();

	}

}

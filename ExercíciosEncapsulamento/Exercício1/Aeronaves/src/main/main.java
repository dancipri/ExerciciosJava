package main;

import model.Aeronaves;

public class main {

	public static void main(String[] args) {
		
		Aeronaves ultraleve = new Aeronaves();
		
		ultraleve.setNomeAeronave("Plane Mcfly");
		ultraleve.setAsas(true);
		ultraleve.setCalda(true);
		ultraleve.setTurbinas(true);
		ultraleve.setPorte("Pequeno");
		ultraleve.setTipo("Particular");
		
		ultraleve.ligarAviao();
		ultraleve.iniciandoVoo();
		ultraleve.estabilizandoVoo();
		ultraleve.preparandoParaPousar();
		ultraleve.pouso();

	}

}

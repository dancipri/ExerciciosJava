package veiculo;

public class Veiculo {
	
	private String marca;
	private String fabricação;
	private boolean on;
	private boolean rodas;
	private String cor;
	private boolean retrovisor;
	
	
	
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getFabricação() {
		return fabricação;
	}

	public void setFabricação(String fabricação) {
		this.fabricação = fabricação;
	}

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	public boolean isRodas() {
		return rodas;
	}

	public void setRodas(boolean rodas) {
		this.rodas = rodas;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public boolean isRetrovisor() {
		return retrovisor;
	}

	public void setRetrovisor(boolean retrovisor) {
		this.retrovisor = retrovisor;
	}
	
	
	

	public void lingandoVeiculo() {
		System.out.println("Este veículo "+ this.getMarca()+" ligou");
	}
	
	public void corVeiculo() {
		System.out.println("Este veículo "+ this.getMarca()+" tem a cor "+ this.getCor());
	}
	
	public void desligaVeiculo() {
		System.out.println("Este veículo "+ this.getMarca()+" desligou");
	}
	
	
	
}

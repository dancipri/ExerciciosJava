package veiculo;

public class Moto extends Veiculo {
	private String cilindrada;
	private boolean apoio;
	private boolean bau;
	
	
	public String getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(String cilindrada) {
		this.cilindrada = cilindrada;
	}
	public boolean isApoio() {
		return apoio;
	}
	public void setApoio(boolean apoio) {
		this.apoio = apoio;
	}
	public boolean isBau() {
		return bau;
	}
	public void setBau(boolean bau) {
		this.bau = bau;
	}
	
	
	public void mostrarcilindrada() {
		System.out.println("A "+this.getMarca()+" possui "+ this.getCilindrada()+" cilindradas");
	}
	
	public void mostrarapoio() {
		System.out.println("A "+this.getMarca()+" tem apoio");
	}
	
	
}

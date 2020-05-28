 package model;

public class Aeronave {
	
	private String nomeAero;
	private boolean asa;
	private boolean calda;
	private boolean turbina;
	private String porte;
	private String tipo;
	


	public String getNomeAero() {
		return nomeAero;
	}

	public void setNomeAero(String nomeAero) {
		this.nomeAero = nomeAero;
	}

	public boolean isAsa() {
		return asa;
	}

	public void setAsa(boolean asa) {
		this.asa = asa;
	}

	public boolean isCalda() {
		return calda;
	}

	public void setCalda(boolean calda) {
		this.calda = calda;
	}

	public boolean isTurbina() {
		return turbina;
	}

	public void setTurbina(boolean turbina) {
		this.turbina = turbina;
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
	

	public void ligarAviao() {
		System.out.println("Aeronave :" + this.nomeAero +" ligada");
	}
	
	public void iniciarVoo() {
		System.out.println("Aeronave :" + this.nomeAero + " decolou");
	}
	
	public void estabilizarVoo() {
		System.out.println("Aeronave :" + this.nomeAero +" esta voando");
	}
	
	public void prepararParaPousar() {
		System.out.println("Aeronave :" + this.nomeAero +" pousando");
	}
	
	public void pousar() {
		System.out.println("Aeronave :" + this.nomeAero + " pousou");
	}
	
	
	
	
}

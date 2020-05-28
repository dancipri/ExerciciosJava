package veiculo;

public class Carro extends Veiculo{
	private String numberPorta;
	private String numberBanco;
	private boolean arCondicionado;
	private boolean direcaoHidraulica;
	private boolean vidroEletrico;
	private boolean cameraTraseira;
	
	
	public String getNumberPorta() {
		return numberPorta;
	}
	public void setNumberPorta(String numberPorta) {
		this.numberPorta = numberPorta;
	}
	public String getNumberBanco() {
		return numberBanco;
	}
	public void setNumberBanco(String numberBanco) {
		this.numberBanco = numberBanco;
	}
	public boolean isArCondicionado() {
		return arCondicionado;
	}
	public void setArCondicionado(boolean arCondicionado) {
		this.arCondicionado = arCondicionado;
	}
	public boolean isDirecaoHidraulica() {
		return direcaoHidraulica;
	}
	public void setDirecaoHidraulica(boolean direcaoHidraulica) {
		this.direcaoHidraulica = direcaoHidraulica;
	}
	public boolean isVidroEletrico() {
		return vidroEletrico;
	}
	public void setVidroEletrico(boolean vidroEletrico) {
		this.vidroEletrico = vidroEletrico;
	}
	public boolean isCameraTraseira() {
		return cameraTraseira;
	}
	public void setCameraTraseira(boolean cameraTraseira) {
		this.cameraTraseira = cameraTraseira;
	}
	
	
	
	public void mostraNumberPorta() {
		System.out.println("O "+this.getMarca()+" possui "+ this.getNumberPorta()+" portas");
	}
	
	public void mostraNumberBanco() {
		System.out.println("O "+this.getMarca()+" possui "+ this.getNumberBanco()+" banco");
	}
	
	
	
}

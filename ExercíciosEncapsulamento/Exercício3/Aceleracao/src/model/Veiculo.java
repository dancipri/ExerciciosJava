package model;

public class Veiculo {
	private String marca;
	private String ano;
	private int speed;
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	
	
	public void acelerador() {
		this.speed++;
		System.out.println("O "+this.marca+" esta correndo a "+this.speed+"km por hora.");
	}
	
	public void freio() {
		if (this.speed == 70) {
			System.out.println("Capotou");
		}else {
			this.speed--;
			System.out.println("O "+this.marca+" esta correndo a "+this.velocidade+"km por hora.");
		}
	}
		
		
	
	
	public void fazerCurva() {
		if (this.velocidade == 70) {
			System.out.println("Capotou");
		}else {
			System.out.println("fez a curva");
		}
	}
	
	
}

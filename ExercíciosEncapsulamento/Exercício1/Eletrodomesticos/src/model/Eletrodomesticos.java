package model;

public class Eletrodomesticos {
	
	private String nomeEletrodomestico;
	private boolean on;
	private String cor;
	private String formato;
	
	
	public String getNomeEletrodomestico() {
		return nomeEletrodomestico;
	}
	public void setNomeEletrodomestico(String nomeEletrodomestico) {
		this.nomeEletrodomestico = nomeEletrodomestico;
	}
	public boolean isOn() {
		return On;
	}
	public void setOn(boolean on) {
		this.on = on;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getFormato() {
		return formato;
	}
	public void setFormato(String formato) {
		this.formato = formato;
	}
	
	
	
	
	public void ligarEletro() {
		System.out.println(this.getNomeEletrodomestico() +" Ligou");
	}
	
	public void desligarEletro() {
		System.out.println(this.getNomeEletrodomestico() +" Deslgou");
	}
	
	
}

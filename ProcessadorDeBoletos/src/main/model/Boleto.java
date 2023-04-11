package main.model;

public class Boleto {
	
	private String data;
	private int valor;
	private String codigo;
	
	public Boleto(String codigo, String data, int valor) {
		this.data = data;
		this.valor = valor;
		this.codigo = codigo;		
	}
	
	public String get_data() {
		return this.data;
	}
	
	public int get_valor() {
		return this.valor;
	}
	
	public String get_codigo() {
		return this.codigo;
	}	

}

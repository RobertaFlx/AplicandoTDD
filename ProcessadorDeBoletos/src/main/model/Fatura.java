package main.model;

public class Fatura {
	
	private String data;
	private int valor_total;
	private String cliente;
	private String pagamento = "AGUARDANDO PAGAMENTO";
	
	public Fatura(String data, int valor_total, String cliente) {
		this.data = data;
		this.valor_total = valor_total;
		this.cliente = cliente;		
	}
	
	public String get_Data() {
		return this.data;
	}
	
	public int get_valor_total() {
		return this.valor_total;
	}
	
	public String get_cliente() {
		return this.cliente;
	}	
	
	public String get_pagamento() {
		return this.pagamento;
	}	
	
	public void set_pagamento(boolean paga) {
		if (paga) {
			this.pagamento = "PAGA";
		}		
	}	

}

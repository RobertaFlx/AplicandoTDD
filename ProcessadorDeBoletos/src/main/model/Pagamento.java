package main.model;

public class Pagamento {
	
	private String data;
	private int valor_pago;
	private String tipo_de_pagamento;
	
	public Pagamento(int valor_pago, String data, String tipo_de_pagamento) {
		this.data = data;
		this.valor_pago = valor_pago;
		this.tipo_de_pagamento = tipo_de_pagamento;		
	}
	
	public String get_data() {
		return this.data;
	}
	
	public int get_valor_pago() {
		return this.valor_pago;
	}
	
	public String get_tipo_de_pagamento() {
		return this.tipo_de_pagamento;
	}	


}

package main.ProcessadorDeBoleto;
import main.model.Boleto;
import main.model.Fatura;
import main.model.Pagamento;

import java.util.List;
import java.util.ArrayList;

public class Processador {
	
	Fatura fatura;
	List<Pagamento> pagamentos = new ArrayList<Pagamento>();
	private int valor_recebido;
	

	public Processador(String data, int valor, String cliente) {
		this.fatura = new Fatura(data, valor, cliente);
	}
	
	public List<Pagamento> processar_boleto(List<Boleto> boletos) {
		for (int x = 0; x < boletos.size(); x++) {
			Pagamento pagamento = new Pagamento(boletos.get(x).get_valor(), boletos.get(x).get_data(), "BOLETO");
			this.pagamentos.add(pagamento);
			this.valor_recebido += boletos.get(x).get_valor();			
		}
		
		return pagamentos;
	}
	
	public String somar_pagamento_boletos() {			
		
		if (this.valor_recebido >= this.fatura.get_valor_total()) {
			this.fatura.set_pagamento(true);
		}				
		return this.fatura.get_pagamento();
	}	
	
}

package tests;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.Test;
import java.util.ArrayList;
import main.model.*;
import main.ProcessadorDeBoleto.*;

public class TestProcessador {
	
    private Processador main = new Processador("10/04/2023", 1500, "Pedro Pascal");    
		
	@Test
	public void testGerarPagamento() {	
		
		List<Boleto> boletos = new ArrayList<Boleto>();
		
		Boleto boleto = new Boleto("1175487932", "15/04/2023", 500);
        
		boletos.add(boleto);			
		
		assertEquals(500, this.main.processar_boleto(boletos).get(0).get_valor_pago());
		assertEquals("15/04/2023", this.main.processar_boleto(boletos).get(0).get_data());
		assertEquals("BOLETO", this.main.processar_boleto(boletos).get(0).get_tipo_de_pagamento());

	} 
	
	@Test
	public void testPagamentoMenorQueFatura() {
		
		List<Boleto> boletos = new ArrayList<Boleto>();
		
        Boleto boleto1 = new Boleto("1175487932", "15/04/2023", 500);
        Boleto boleto2 = new Boleto("1484845647", "20/04/2023", 400);
        
		boletos.add(boleto1);
		boletos.add(boleto2);   
		
		this.main.processar_boleto(boletos);		
		
		assertEquals("AGUARDANDO PAGAMENTO", this.main.somar_pagamento_boletos());

	} 
	
	@Test
	public void testPagamentoIgualFatura() {
		
		List<Boleto> boletos = new ArrayList<Boleto>();
		
		Boleto boleto1 = new Boleto("1175487932", "15/04/2023", 500);
		Boleto boleto2 = new Boleto("1484845647", "20/04/2023", 400);
		Boleto boleto3 = new Boleto("1398498795", "29/04/2023", 600);

        
		boletos.add(boleto1);
		boletos.add(boleto2);  
		boletos.add(boleto3);   

		
		this.main.processar_boleto(boletos);			
             
        assertEquals("PAGA", main.somar_pagamento_boletos());
	} 
	
	@Test
	public void testPagamentoMaiorQueFatura() {
		
		List<Boleto> boletos = new ArrayList<Boleto>();
		
		Boleto boleto1 = new Boleto("1175487932", "15/04/2023", 500);
		Boleto boleto2 = new Boleto("1484845647", "20/04/2023", 400);
		Boleto boleto3 = new Boleto("1398498795", "29/04/2023", 600);
		Boleto boleto4 = new Boleto("1977329796", "01/05/2023", 500);

        
		boletos.add(boleto1);
		boletos.add(boleto2);  
		boletos.add(boleto3); 
		boletos.add(boleto4); 
		
		this.main.processar_boleto(boletos);	

		assertEquals("PAGA", main.somar_pagamento_boletos());
	} 
	
	@Test
	public void testSemPagamento() {

		assertEquals("AGUARDANDO PAGAMENTO", main.somar_pagamento_boletos());
	} 
}

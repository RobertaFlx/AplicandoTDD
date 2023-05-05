package functionalTests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import main.ProcessadorDeBoleto.Processador;
import main.model.Boleto;

public class TestsTabelasDeDecisao {	
	
	// Técnica: Tabelas de Decisão	
	@Test
	public void testCase1() {

		Processador main = new Processador("10/04/2023", 115, "Pedro Pascal");    

		List<Boleto> boletos = new ArrayList<Boleto>();
		
		Boleto boleto = new Boleto("1175487932", "15/04/2023", 140);
        
		boletos.add(boleto);	
		
		main.processar_boleto(boletos);		
		
		assertEquals("PAGA", main.somar_pagamento_boletos());

	} 
	
	@Test
	public void testCase2() {

		Processador main = new Processador("10/04/2023", 80, "Pedro Pascal");    

		List<Boleto> boletos = new ArrayList<Boleto>();
		
		Boleto boleto = new Boleto("1175487932", "15/04/2023", -1);
        
		boletos.add(boleto);	
		
		main.processar_boleto(boletos);		
		
		assertEquals("ERRO", main.somar_pagamento_boletos());

	} 
	
	@Test
	public void testCase3() {

		Processador main = new Processador("10/04/2023", -1, "Pedro Pascal");    

		List<Boleto> boletos = new ArrayList<Boleto>();
		
		Boleto boleto = new Boleto("1175487932", "15/04/2023", -1);
        
		boletos.add(boleto);	
		
		main.processar_boleto(boletos);		
		
		assertEquals("ERRO", main.somar_pagamento_boletos());

	} 
	
	@Test
	public void testCase4() {

		Processador main = new Processador("10/04/2023", -20, "Pedro Pascal");    

		List<Boleto> boletos = new ArrayList<Boleto>();
		
		Boleto boleto = new Boleto("1175487932", "15/04/2023", -1);
        
		boletos.add(boleto);	
		
		main.processar_boleto(boletos);		
		
		assertEquals("ERRO", main.somar_pagamento_boletos());

	} 
	
	@Test
	public void testCase5() {

		Processador main = new Processador("10/04/2023", -1, "Pedro Pascal");    

		List<Boleto> boletos = new ArrayList<Boleto>();
		
		Boleto boleto = new Boleto("1175487932", "15/04/2023", -30);
        
		boletos.add(boleto);	
		
		main.processar_boleto(boletos);		
		
		assertEquals("ERRO", main.somar_pagamento_boletos());

	} 
	
	@Test
	public void testCase6() {

		Processador main = new Processador("10/04/2023", -1, "Pedro Pascal");    

		List<Boleto> boletos = new ArrayList<Boleto>();
		
		Boleto boleto = new Boleto("1175487932", "15/04/2023", 80);
        
		boletos.add(boleto);	
		
		main.processar_boleto(boletos);		
		
		assertEquals("ERRO", main.somar_pagamento_boletos());

	} 
	
	@Test
	public void testCase7() {

		Processador main = new Processador("10/04/2023", 130, "Pedro Pascal");    

		List<Boleto> boletos = new ArrayList<Boleto>();
		
		Boleto boleto = new Boleto("1175487932", "15/04/2023", 125);
        
		boletos.add(boleto);	
		
		main.processar_boleto(boletos);		
		
		assertEquals("AGUARDANDO PAGAMENTO", main.somar_pagamento_boletos());

	} 
	
	@Test
	public void testCase8() {

		Processador main = new Processador("10/04/2023", 120, "Pedro Pascal");    

		List<Boleto> boletos = new ArrayList<Boleto>();
		
		Boleto boleto = new Boleto("1175487932", "15/04/2023", 120);
        
		boletos.add(boleto);	
		
		main.processar_boleto(boletos);		
		
		assertEquals("PAGA", main.somar_pagamento_boletos());

	} 
}

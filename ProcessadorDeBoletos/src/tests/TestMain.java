package tests;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;


public class TestMain {
	
    private Main main;
    
    private Boleto boleto1;
    private Boleto boleto2;
    private Boleto boleto3;
    private Boleto boleto4;
    
    private Pagamento pagamento1;
    private Pagamento pagamento2;
    private Pagamento pagamento3;
    private Pagamento pagamento4;
    
	public void initClasses() {
		
        main = new Main();

        main.gerarFatura("10/04/2023", 1500, "Pedro Pascal");
        
    	boleto1 = new Boleto("1175487932", "15/04/2023", 500);
    	boleto2 = new Boleto("1484845647", "20/04/2023", 400);
    	boleto3 = new Boleto("1398498795", "29/04/2023", 600);
    	boleto4 = new Boleto("1977329796", "01/05/2023", 500);


    	pagamento1 = new Pagamento(500, "15/04/2023", "BOLETO");
    	pagamento2 = new Pagamento(400, "20/04/2023", "BOLETO");
    	pagamento3 = new Pagamento(600, "29/04/2023", "BOLETO");    
    	pagamento4 = new Pagamento(500, "01/04/2023", "BOLETO");    
         		
    }
	
	@Test
	public void testGerarPagamento() {	
        
		assertEquals(pagamento1, main.ProcessarBoleto(boleto1);
		assertEquals([pagamento2, pagamento3], main.ProcessarBoleto([boleto2, boleto3]);

	} 
	
	@Test
	public void testPagamentoMenorQueFatura() {
		
		assertEquals("AGUARDANDO PAGAMENTO", main.somarPagamentoBoletos([500, 400]);

	} 
	
	@Test
	public void testPagamentoIgualFatura() {
             
        assertEquals("PAGA", main.somarPagamentoBoletos([500, 400, 600]);
	} 
	
	@Test
	public void testPagamentoMaiorQueFatura() {
		
		assertEquals("PAGA", main.somarPagamentoBoletos([500,400,600,500]);
	} 

}

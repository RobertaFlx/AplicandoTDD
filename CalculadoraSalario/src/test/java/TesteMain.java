import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class TesteMain {

    private Service service;

    @BeforeEach
    public void initTestMain() {
        service = new Service();
        service.cadastrarFuncionario("Renato Ferreira", "Renato@gmail.com", 3500, "DESENVOLVEDOR");
        service.cadastrarFuncionario("Rebeca Freire", "Rebeca@gmail.com", 3000, "DESENVOLVEDOR");
        service.cadastrarFuncionario("Robson Ferraz", "Robson@gmail.com", 2500, "DESENVOLVEDOR");

        service.cadastrarFuncionario("Regina Fernandes", "Regina@gmail.com", 2500, "DBA");
        service.cadastrarFuncionario("Renata Falcão", "Renata@gmail.com", 2000, "DBA");
        service.cadastrarFuncionario("Rafaela Fontes", "Rafaela@gmail.com", 1800, "DBA");

        service.cadastrarFuncionario("Roberto Feitosa", "Roberto@gmail.com", 2830.30, "TESTADOR");
        service.cadastrarFuncionario("Rômulo Farias", "Romulo@gmail.com", 2000, "TESTADOR");
        service.cadastrarFuncionario("Raquel Figueiredo", "Raquel@gmail.com", 1990.50, "TESTADOR");

        service.cadastrarFuncionario("Rosângela Fonseca", "Rosangela@gmail.com", 6350.80, "GERENTE");
        service.cadastrarFuncionario("Rubens Franco", "Rubens@gmail.com", 5000, "GERENTE");
        service.cadastrarFuncionario("Ricardo Felício", "Ricardo@gmail.com", 4400.30, "GERENTE");
    }

    @Test
    public void descontoDesenvolvedor20PorCento() {
        assertEquals(2800, service.calcularSalarioLiquido("Renato@gmail.com"));
        assertEquals(2400, service.calcularSalarioLiquido("Rebeca@gmail.com"));
    }

    @Test
    public void descontoDesenvolvedor10PorCento() {
        assertEquals(2250, service.calcularSalarioLiquido("Robson@gmail.com"));
    }

    @Test
    public void descontoDBA25PorCento() {
        assertEquals(1875, service.calcularSalarioLiquido("Regina@gmail.com"));
        assertEquals(1500, service.calcularSalarioLiquido("Renata@gmail.com"));
    }

    @Test
    public void descontoDBA15PorCento() {
        assertEquals(1530, service.calcularSalarioLiquido("Rafaela@gmail.com"));
    }

    @Test
    public void descontoTestador25PorCento() {
        assertEquals(2122.73, service.calcularSalarioLiquido("Roberto@gmail.com"));
        assertEquals(1500, service.calcularSalarioLiquido("Romulo@gmail.com"));
    }

    @Test
    public void descontoTestador15PorCento() {
        assertEquals(1691.93, service.calcularSalarioLiquido("Raquel@gmail.com"));
    }

    @Test
    public void descontoGerente30PorCento() {
        assertEquals(4445.56, service.calcularSalarioLiquido("Rosangela@gmail.com"));
        assertEquals(3500, service.calcularSalarioLiquido("Rubens@gmail.com"));
    }

    @Test
    public void descontoGerente20PorCento() {
        assertEquals(3520.24, service.calcularSalarioLiquido("Ricardo@gmail.com"));
    }

}
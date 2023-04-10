import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TesteMain {

    private Main main;

    @BeforeEach
    public void initTestMain() {
        main = new Main();
        main.cadastrarFuncionario("Renato Ferreira", "Renato@gmail.com", 3500, "DESENVOLVEDOR");
        main.cadastrarFuncionario("Rebeca Freire", "Rebeca@gmail.com", 3000, "DESENVOLVEDOR");
        main.cadastrarFuncionario("Robson Ferraz", "Robson@gmail.com", 2500, "DESENVOLVEDOR");

        main.cadastrarFuncionario("Regina Fernandes", "Regina@gmail.com", 2500, "DBA");
        main.cadastrarFuncionario("Renata Falcão", "Renata@gmail.com", 2000, "DBA");
        main.cadastrarFuncionario("Rafaela Fontes", "Rafaela@gmail.com", 1800, "DBA");

        main.cadastrarFuncionario("Roberto Feitosa", "Roberto@gmail.com", 2800, "TESTADOR");
        main.cadastrarFuncionario("Rômulo Farias", "Romulo@gmail.com", 2000, "TESTADOR");
        main.cadastrarFuncionario("Raquel Figueiredo", "Raquel@gmail.com", 1900, "TESTADOR");

        main.cadastrarFuncionario("Rosângela Fonseca", "Rosangela@gmail.com", 6000, "GERENTE");
        main.cadastrarFuncionario("Rubens Franco", "Rubens@gmail.com", 5000, "GERENTE");
        main.cadastrarFuncionario("Ricardo Felício", "Ricardo@gmail.com", 4500, "GERENTE");
    }

    @Test
    public void descontoDesenvolvedor20PorCento() {
        assertEquals(2800, main.calcularSalarioLiquido("Renato@gmail.com"));
        assertEquals(2400, main.calcularSalarioLiquido("Rebeca@gmail.com"));
    }

    @Test
    public void descontoDesenvolvedor10PorCento() {
        assertEquals(2250, main.calcularSalarioLiquido("Robson@gmail.com"));
    }

    @Test
    public void descontoDBA25PorCento() {
        assertEquals(1875, main.calcularSalarioLiquido("Regina@gmail.com"));
        assertEquals(1500, main.calcularSalarioLiquido("Renata@gmail.com"));
    }

    @Test
    public void descontoDBA15PorCento() {
        assertEquals(1530, main.calcularSalarioLiquido("Rafaela@gmail.com"));
    }

    @Test
    public void descontoTestador25PorCento() {
        assertEquals(2100, main.calcularSalarioLiquido("Roberto@gmail.com"));
        assertEquals(1500, main.calcularSalarioLiquido("Romulo@gmail.com"));
    }

    @Test
    public void descontoTestador15PorCento() {
        assertEquals(1615, main.calcularSalarioLiquido("Raquel@gmail.com"));
    }

    @Test
    public void descontoGerente30PorCento() {
        assertEquals(4200, main.calcularSalarioLiquido("Rosangela@gmail.com"));
        assertEquals(3500, main.calcularSalarioLiquido("Rubens@gmail.com"));
    }

    @Test
    public void descontoGerente20PorCento() {
        assertEquals(3600, main.calcularSalarioLiquido("Ricardo@gmail.com"));
    }

}
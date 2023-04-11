import java.util.HashMap;

public class Service {

    private static HashMap<String, Funcionario> funcionarios = new HashMap<>();

    public String cadastrarFuncionario(String nome, String email, double salarioBase, String cargo) {
        String mensagem = "";
        if (funcionarios.containsKey(email)) {
            mensagem = "EMAIL JÁ CADASTRADO!";
        }
        else {
            Funcionario funcionario = new Funcionario(nome, email, salarioBase, cargo);
            this.funcionarios.put(email, funcionario);
            mensagem = "CADASTRO REALIZADO!";
        }
        return mensagem;
    }

    public double calcularSalarioLiquido(String email) {
        double salarioLiquido = 0;
        Funcionario funcionario = funcionarios.get(email);

        if (funcionario != null) {
            double salarioBase = funcionario.getSalarioBase();
            if((funcionario.getCargo().equals("DESENVOLVEDOR") && salarioBase >= 3000) || (funcionario.getCargo().equals("GERENTE") && salarioBase < 5000)){
                salarioLiquido = salarioBase * 0.80; //DESCONTO DE 20%
            }else if(funcionario.getCargo().equals("DESENVOLVEDOR") && salarioBase < 3000){
                salarioLiquido = salarioBase * 0.90; //DESCONTO DE 10%
            }else if(funcionario.getCargo().equals("GERENTE") && salarioBase >= 5000){
                salarioLiquido = salarioBase * 0.70; //DESCONTO DE 30%
            }else if((funcionario.getCargo().equals("DBA") || funcionario.getCargo().equals("TESTADOR")) && salarioBase >= 2000){
                salarioLiquido = salarioBase * 0.75; //DESCONTO DE 25%
            }else if((funcionario.getCargo().equals("DBA") || funcionario.getCargo().equals("TESTADOR")) && salarioBase < 2000){
                salarioLiquido = salarioBase * 0.85; //DESCONTO DE 15%
            }
            salarioLiquido = Math.round(salarioLiquido * 100.0) / 100.0; //FORMATAÇÃO PARA DUAS CASAS DECIMAIS
        }
        return salarioLiquido;
    }
}

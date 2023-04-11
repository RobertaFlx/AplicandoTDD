import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Service service = new Service();
        Scanner scanner = new Scanner(System.in);
        String opcao = "";

        while (true) {
            opcao = menu(scanner);
            selecionaOpcao(opcao, scanner, service);
        }
    }

    private static String menu(Scanner scanner) {
        System.out.println(
                "\n---\nMENU\n" +
                        "(C)adastrar Funcionário\n" +
                        "(V)erificar Salário Líquido\n" +
                        "(S)air do programa!\n" +
                        "\n" +
                        "Opção>" );

        return scanner.nextLine().toUpperCase();
    }

    public static void selecionaOpcao(String opcao, Scanner scanner, Service service) {
        switch (opcao) {
            case "C":
                cadastraFuncionario(scanner, service);
                break;
            case "V":
                calculaSalarioLiquido(scanner, service);
                break;
            case "S":
                sair();
                break;
            default:
                System.out.println("OPÇÃO INVÁLIDA!");
                sair();
        }
    }

    public static void cadastraFuncionario(Scanner scanner, Service service) {
        System.out.println("Nome: ");
        String nome = scanner.nextLine().toUpperCase();
        System.out.println("Email: ");
        String email = scanner.nextLine().toUpperCase();
        System.out.println("Salário Base: ");
        double salarioBase = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Cargo: ");
        String cargo = scanner.nextLine().toUpperCase();
        System.out.println(service.cadastrarFuncionario(nome, email, salarioBase, cargo));
    }

    public static void calculaSalarioLiquido(Scanner scanner, Service service) {
        System.out.println("Email: ");
        String email = scanner.nextLine().toUpperCase();
        System.out.println(service.calcularSalarioLiquido(email));
    }

    public static void sair() {
        System.exit(0);
    }

}

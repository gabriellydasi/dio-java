import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Usando try-with-resources para garantir que o Scanner será fechado automaticamente
        try (Scanner sc = new Scanner(System.in)) {

            int numero = 0;
            String agencia = "";
            String nomeCliente = "";
            float saldo = 0.0f;

            // Solicitar número da conta
            while (true) {
                System.out.println("Digite o número da conta:");
                try {
                    numero = Integer.parseInt(sc.nextLine()); // Lê a entrada como String e converte para inteiro
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Número inválido. Tente novamente.");
                }
            }

            // Solicitar agência
            while (true) {
                System.out.println("Digite a agência:");
                agencia = sc.nextLine().trim();
                if (!agencia.isEmpty()) { // Verifica se a entrada não está vazia
                    break;
                } else {
                    System.out.println("Agência não pode ser vazia. Tente novamente.");
                }
            }

            // Solicitar nome do cliente (somente letras e espaços)
            while (true) {
                System.out.println("Digite o nome do cliente:");
                nomeCliente = sc.nextLine().trim();
                if (nomeCliente.matches("[a-zA-Z ]+")) { // Verifica se a entrada contém apenas letras e espaços
                    break;
                } else {
                    System.out.println("Nome do cliente deve conter apenas letras e espaços. Tente novamente.");
                }
            }

            // Solicitar saldo
            while (true) {
                System.out.println("Digite o saldo:");
                try {
                    saldo = Float.parseFloat(sc.nextLine()); // Lê a entrada como String e converte para float
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Saldo inválido. Tente novamente.");
                }
            }

            // Exibir os dados da conta
            System.out.printf("Conta = %d\nAgência = %s\nCliente = %s\nSaldo = R$ %.2f\n", numero, agencia, nomeCliente, saldo);

        } // O 'Scanner' será fechado automaticamente ao final do bloco try-with-resources
    }
}
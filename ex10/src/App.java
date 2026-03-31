

// Nome: João da Mata
// Matrícula: 1261930137

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        double saldo = 1000.00;
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("=== CAIXA ELETRÔNICO ===");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar saldo");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Valor do depósito: R$ ");
                    double deposito = leitor.nextDouble();

                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.printf("Depósito realizado. Novo saldo: R$ %.2f%n", saldo);
                    } else {
                        System.out.println("Valor inválido!");
                    }
                    break;

                case 2:
                    System.out.print("Valor do saque: R$ ");
                    double saque = leitor.nextDouble();

                    if (saque > saldo) {
                        System.out.printf("Saldo insuficiente. Saldo disponível: R$ %.2f%n", saldo);
                    } else if (saque <= 0) {
                        System.out.println("Valor inválido!");
                    } else {
                        saldo -= saque;
                        System.out.printf("Saque realizado. Novo saldo: R$ %.2f%n", saldo);
                    }
                    break;

                case 3:
                    System.out.printf("Saldo atual: R$ %.2f%n", saldo);
                    break;

                case 0:
                    System.out.println("Obrigado. Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }

        leitor.close();
    }
}
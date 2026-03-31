// Nome: João da Mata
// Matrícula: 1261930137
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner Leitor = new Scanner(System.in);

        double nota;

        System.out.print("Digite a nota (0 a 100): ");
        nota = Leitor.nextDouble();

        while (nota < 0 || nota > 100) {
            System.out.println("Nota inválida. Tente novamente.");
            System.out.print("Digite a nota (0 a 100): ");
            nota = Leitor.nextDouble();
        }

        if (nota >= 90) {
            System.out.println("Conceito: A");
        } else if (nota >= 75) {
            System.out.println("Conceito: B");
        } else if (nota >= 60) {
            System.out.println("Conceito: C");
        } else {
            System.out.println("Conceito: D (Reprovado)");
        }

        Leitor.close();
    }
}
// Nome: João da Mata
// Matrícula: 1261930137
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner Leitor = new Scanner(System.in);

        System.out.print("Digite o número: ");
        int num = Leitor.nextInt();

        int multiplicador = 1;

        while (multiplicador <= 10) {
            System.out.println(num + " x " + multiplicador + " = " + (num * multiplicador));
            multiplicador++;
        }

        Leitor.close();
    }
}

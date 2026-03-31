// Nome: João da Mata
// Matrícula: 1261930137
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner Leitor = new Scanner(System.in);
        int soma = 0;
        int contador = -1;
        while (contador != 0) {
            System.out.print("digite um numero (digite 0 pra encerrar): ");
            contador = Leitor.nextInt();
            soma += contador;
        }
        System.out.print("a soma é: "+soma);
        Leitor.close();
    }
}

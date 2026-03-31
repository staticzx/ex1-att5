// Nome: João da Mata
// Matrícula: 1261930137
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner Leitor = new Scanner(System.in);
        
        System.out.println("escreva um numero inteiro: ");
        int num = Leitor.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " é par!");
        } else {
            System.out.println(num + " é impar!");
        }
        Leitor.close();
    }
}

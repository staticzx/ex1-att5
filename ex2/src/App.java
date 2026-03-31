// Nome: João da Mata
// Matrícula: 1261930137
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner Leitor = new Scanner(System.in); 
       System.out.println("escreva o lado A: ");
       int ladoA = Leitor.nextInt();
       System.out.println("escreva o lado B: ");
       int ladoB = Leitor.nextInt();
       System.out.println("escreva o lado C: ");
       int ladoC = Leitor.nextInt();

       if (ladoA == ladoB && ladoB == ladoC) {
            System.out.println("Triangulo equilatero");        
       } else if (ladoA == ladoB || ladoB == ladoC) {
            System.out.println("triangulo isoceles");        
       } else {
            System.out.println("triangulo escaleno");
       }
       Leitor.close();
    }
}

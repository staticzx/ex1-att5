// Nome: João da Mata
// Matrícula: 1261930137
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner Leitor = new Scanner(System.in);
        System.out.print("Até que numero você quer ver? ");
        int num = Leitor.nextInt();
        int contador = 1;
        while (contador != num) {
            System.out.println(contador);
            contador ++;
        } 
        System.out.println("contagem concluida"); 
        Leitor.close();
    }
}

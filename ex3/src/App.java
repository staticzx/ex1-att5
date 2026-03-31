// Nome: João da Mata
// Matrícula: 1261930137
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner Leitor = new Scanner(System.in);

        System.out.println("digite o primeiro numero: ");
        double num1 = Leitor.nextInt();
        System.out.println("digite o segunodo numero: ");
        double num2 = Leitor.nextInt();
        System.out.println("Escolha a operação: 1- soma 2-subtração 3-multilplicação 4-divisão");
        int op = Leitor.nextInt();
        switch (op) {
            case 1:
                System.out.println("A soma é: " + (num1 + num2));
                break;
                case 2: 
                    System.out.println("O resultado é: " + (num1 - num2));
                    break;
                    case 3: 
                        System.out.println("o resultado é: " + (num1 * num2));
                        break;
                        case 4:
                            if (num1 != 0 && num2 != 0) {
                                  System.out.println("o resultado é: " + (num1 / num2));
                            } else {
                                System.out.println("divisão por 0 não existe");
                            }
                          
                 break;
        
            default: System.err.println("operação invalida");
                break;
        }


        Leitor.close();
    }
}

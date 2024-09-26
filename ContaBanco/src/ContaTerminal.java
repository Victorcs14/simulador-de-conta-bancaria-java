import java.util.Scanner;

public class ContaTerminal {
//colocando o Scanner para pegar os dados     
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//pedindo os dados 
        System.out.println("digite seu nome:");
        String nome = scanner.nextLine();
    
        System.out.println( "digite o nome da agência:");
        String agencia = scanner.nextLine();
    
        System.out.println("digite o número da conta:");
        int numero = scanner.nextInt();
    
        System.out.println(" digite o saldo inicial:");
        double saldo = scanner.nextDouble();
    
//mostrando a mensagem com os dados 
        System.out.println("Agradecemos , " + nome + " por abrir a conta da agência " + agencia + 
                               " de número " + numero + ". Você possui um saldo de R$ " + saldo + " disponível para saque.");
            
//Fechando o scanner
         scanner.close();
        }
    }


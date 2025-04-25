import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //Criação do Scanner
        Scanner scanner = new Scanner(System.in);

        //Atribuição de valores
        String agencia = null;
        String nomeCliente = null;
        double saldo = 0.0;
        int numero = 0;

        //Coleta dos dados do cliente
        System.out.println("Por favor, digite o seu Número: ");
        numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha pendente

        System.out.println("Por favor, digite o número da Agência: ");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o seu Nome: ");
        nomeCliente = scanner.nextLine();
        
        System.out.println("Por favor, digite o seu Saldo: ");
        saldo = Double.parseDouble(scanner.nextLine());

        //Mensagem final
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + numero + " e seu saldo é R$" + saldo + " já está disponível para saque.");

        //Fechamento do Scanner 
        scanner.close();    

    }
}

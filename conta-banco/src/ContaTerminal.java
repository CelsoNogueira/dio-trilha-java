import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da Conta: ");
        int numero = scanner.nextInt();

        System.out.println("Digite o número da Agencia: ");
        scanner.nextLine();
        String agencia = scanner.nextLine();

        System.out.println("Digite o Nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o saldo da Conta: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente+ ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + "e seu saldo " + saldo + " já está disponível para saque!");

    }
}

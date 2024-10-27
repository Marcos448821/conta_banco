import java.util.Scanner;
import java.util.Locale;

public class CmarcontaTerminal {
    public static void main(String[] args) {
       //todo: conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
       //exibir as mensagem para o usuario
        System.out.println("Digite seu Nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o Número da Agencia: ");
        String agencia = scanner.nextLine();

        System.out.println("Digite o Número da Conta: ");
        int conta = scanner.nextInt();

        System.out.println("Saldo: ");
        double saldo = scanner.nextDouble();
       //obter pela Scanner os valores digitado no terminal

       //exibir a mensagem conta criada
        System.out.println("olá, " + nome);
        System.out.println("sua agência: " + agencia + " Conta: " + conta);
        System.out.println("saldo R$: " + saldo);

    }
}

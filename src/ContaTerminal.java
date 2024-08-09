import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero;
        String agencia, nomeCliente;
        float saldo;

        Scanner leitor = new Scanner(System.in).useLocale(Locale.ENGLISH);

        System.out.println("Por favor, digite o número da sua conta!");
        numero = leitor.nextInt();
        System.out.println("Por favor, digite o número da agência!");
        agencia = leitor.next();
        System.out.println("Por favor, digite seu nome!");
        nomeCliente = leitor.next();
        System.out.println("Por favor, o saldo!");
        saldo = leitor.nextFloat();
        leitor.close();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}

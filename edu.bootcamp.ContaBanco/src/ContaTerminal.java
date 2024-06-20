import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Olá, qual seu nome? ");
        String clientName = scanner.nextLine();

        System.out.print("Por favor digite o número da agência: ");
        String bankNumber = scanner.nextLine();

        System.out.print("número da conta: ");
        int showAccount = scanner.nextInt();

        System.out.print("Quanto deseja depositar? ");
        float accountBalance = scanner.nextFloat();

        System.out.println("Olá " + clientName + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                bankNumber + " conta de número: " + showAccount + " e seu saldo de: " + accountBalance + " já está disponível para saque");
    }
}


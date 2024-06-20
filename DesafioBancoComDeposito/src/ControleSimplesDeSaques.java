import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double limiteDiario = scanner.nextDouble();

// TODO: Crie um loop 'for' para iterar sobre os saques:
        for (int i=1; i<=5; i++){
// TODO: Solicite ao usuário o valor do saque:
            double valorSaque = scanner.nextDouble();
// TODO: Verifique se o valor do saque é zero, encerrando as transações:
// Dica: Utilize um 'if/else' para verificar as condições do valorSaque e o limiteDiario;
            if(valorSaque == 0){
                System.out.println("Transacoes encerradas.");
                break;
            }
// TODO: Se o valor do saque não ultrapassar o limite diário, subtraia o valor do saque do limite diário:
            if(valorSaque > limiteDiario){
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break;
            } else {
                limiteDiario -= valorSaque;
// TODO: Informe que o saque foi realizado e mostre o limite restante:
                System.out.println("Saque realizado. Limite restante: " + limiteDiario);
            }
        }
// Fechamos o Scanner para evitar vazamento de recursos:
        scanner.close();
    }
}
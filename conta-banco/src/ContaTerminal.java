import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO:Conhecer e importar a classe scanner
        //Exibir as menssagens para o usuario
        //Obter pela scanner os valores gititados no terminal
        //Exibir a menssagen da conta criada


        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Bem vindo a DIO Bank, informe corretamente os dados solicitados a baixo para criar sua conta.");
        

        System.out.println("Digite seu nome:");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome:");
        String sobrenome = scanner.next();

        System.out.println("Digite a agencia desejada:");
        String agencia = scanner.next();

        System.out.println("Digite o numero da conta desejada:");
        int conta = scanner.nextInt();

        System.out.println("Conta criada com sucesso!");

        System.out.println("Digite o valor do seu primeiro deposito:");
        double saldo = scanner.nextDouble();

        System.out.println("Ola " + nome + " " + sobrenome + ", Seja bem vindo ao DIO Bank, sua Agencia é: " + agencia + ", e sua conta: " + conta + ", seu saldo de  R$" + saldo + ", ja esta disponivel para saques e ou transferencias!");



    }
}

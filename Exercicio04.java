import java.util.Scanner;

public class Exercicio04 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro valor");
        int primeiroValor =  input.nextInt();
        System.out.println("Digite o segundo valor");
        int segundoValor = input.nextInt();

        if (primeiroValor > segundoValor) {
            System.out.println("A diferenca do primeiro valor e maior, comparado ao segundo valor :");
        }else if (segundoValor < primeiroValor){
            System.out.println("A diferenca do segundo valor é maior, comparado ao primeiro valor :");
        }
    }
}

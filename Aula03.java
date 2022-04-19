import java.util.Scanner;

public class Aula03 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");

        double numero1 = input.nextDouble();

        System.out.println("Digite o segundo numero");

        double numero2 = input.nextDouble();

        double subtracao = numero1 - numero2;

        System.out.println("A subtracao entre os numeros digitados e: " + subtracao);

        input.close();

    }
}

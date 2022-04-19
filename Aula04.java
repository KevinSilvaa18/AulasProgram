import java.util.Scanner;

public class Aula04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro valor");

        Double numero1 = input.nextDouble();

        System.out.println("Digite o segundo valor");

        Double numero2 = input.nextDouble();

        Double resultadodivisao = numero1/numero2;

        System.out.println("O resutado da divisao entre os numeros digitados e: " + resultadodivisao);

        input.close();
    }

}

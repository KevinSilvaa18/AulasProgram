import java.util.Scanner;

public class Aula02 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro numero:");

        int numero1 = input.nextInt();

        System.out.println("Digite o segundo numero");

        int numero2 = input.nextInt();

        int numerosSomados = numero1 + numero2;
        int numerosSubtracao = numero1 - numero2;
        int numerosMultiplicados = numero1 * numero2;
        int numerosDivisao = numero1/numero2;

        System.out.println("Digite a operacao que voce deseja realizar:");
        String operacao = input.next();

        if (operacao.equals("soma")) {
            System.out.println("Realizando a soma...");
            System.out.println("A resposta dos dois numeros somados e " + numerosSomados + ".");
        } else if (operacao.equals("subtracao")){
            System.out.println("Realizando a Subtracao...");
            System.out.println("A resposta dos dois numeros subtracao e " + numerosSubtracao + ".");
        } else if (operacao.equals("multiplicacao")) {
            System.out.println("Realizando a Multiplacao");
            System.out.println("A resposta dos dois numeros multiplicados e " + numerosMultiplicados + ".");
        } else if (operacao.equals("divisao")) {
            System.out.println("Realizando a Divisao");
            System.out.println("A resposta dos dois numeros divididos e " + numerosDivisao + "." );
        }
        input.close();

    }
}

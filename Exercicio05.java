import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nivel;

        double horas;

        Scanner ler = new Scanner(System.in);

        System.out.println("Ola, tudo bem? Por favor, escolha o nível do professor que você quer calcular o salario: \n Opcoes disponiveis: 1, 2 ou 3");

        nivel = ler.nextInt();

        System.out.println("Informe o numero de aulas/horas dadas :");

        horas = ler.nextDouble();

        if (nivel == 1) {

            System.out.println("Salario R$:" + horas * 12);

        } else if (nivel == 2) {

            System.out.println("Salario R$:" + horas * 17);

        } else if (nivel == 3) {

            System.out.println("Salario R$:" + horas * 25);
        }
    }
}

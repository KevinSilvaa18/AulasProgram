import java.util.Scanner;

public class Exercicio01 {
    public static void main(String args []) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o seu nome ?");
        String nome = input.next();

        System.out.println("Primeira nota");
        double nota1 = input.nextDouble();

        System.out.println("Segunda nota");
        double nota2 = input.nextDouble();

        System.out.println("Terceira nota");
        double nota3 = input.nextDouble();

        double resultado = (nota1 + nota2 + nota3) / 3;

        if (resultado >= 70) {
            System.out.println("Meus parabens, Voce foi aprovado :). Sua media e " + resultado);

        }else if (resultado<=50) {
            System.out.println("Infelizmente voce nao passou, sinto muito" + resultado);
        }else if(resultado<=50){
            System.out.println("Voce ficou recuperacao, aproveite essa chance para conseguir uma nota melhor." + resultado);

        }


    }

    }

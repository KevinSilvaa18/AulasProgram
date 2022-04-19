import java.util.Scanner;

public class Exercicio03 {
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o seu Genero");
        String genero = input.next();

        if(genero.equals("F")){
            System.out.println("O genero informado não exite, digite corretamente");
        } else if (genero.equals("M")) {
            System.out.println("O genero informado não existe, digite corretamente");
        } else if (genero.equals("Masculino")) {
            System.out.println("O genero informado foi Masculino");
        }else if (genero.equals("Feminino")) {
                System.out.println("O genero informado foi Feminino");
            }
        }
    }


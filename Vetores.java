import java.util.Scanner;

public class Vetores {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        String[] vetorNomes = new String[5];

        vetorNomes[0] = "Kevin";

        vetorNomes[1] = "Júlio";

        vetorNomes[2] = "João";

        vetorNomes[3] = "Gustavo";

        vetorNomes[4] = "Marcos";

        System.out.println("Insira o nome que deseja procurar!");

        String nomes = input.next();

        for (int i = 0; i< vetorNomes.length; i++) {
            if(vetorNomes[i].equals(nomes)){
                System.out.println("Sua posição na matriz é: " + i);
                break;

            }else{
                System.out.println("O " + nomes + "não foi encontrado");

            }

            }
          }

}


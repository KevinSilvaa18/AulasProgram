import java.util.Scanner;

public class Aula01 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Veja a previsao do tempo (=");

        String previsaodoTempo = input.next();

        String previsaodotempoSol = "sol";

        String previsaodoTempoChuva = "chuva";

        if(previsaodoTempo.equals(previsaodotempoSol)) {
            System.out.println("Vamos a praia fazer um churrasco");
        }else{
            System.out.println("1 - Almocar");
            System.out.println("2 - Ver televisao");
            System.out.println("3 - Dormir");

        }
        input.close();
    }
}


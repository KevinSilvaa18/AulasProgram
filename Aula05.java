import java.util.ArrayList;
import java.util.List;

public class Aula05 {

    static List listaDeProdutos = new ArrayList<>();


    public static void main (String[] args){

//        for (int i = 1; i<=10; i++) {
//            System.out.println(i);
//      }

        listaDeProdutos.add("Pao");
        listaDeProdutos.add("Manteiga");
        listaDeProdutos.add("Cafe");
        listaDeProdutos.add("Leite");

        System.out.println(listaDeProdutos);

        for(Object lista : listaDeProdutos) {
            if (lista.equals("Pao")) {
                System.out.println(lista);
            }
        }

    }
}

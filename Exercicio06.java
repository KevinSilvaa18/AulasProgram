import java.util.ArrayList;
import java.util.List;

public class Exercicio06 {

    static List listaDeEmails = new ArrayList<>();

    public static void main (String[] args){


        listaDeEmails.add("Eduardo.Costa@gmail.com");
        listaDeEmails.add("Clarice.Lispector1920@hotmail.com");
        listaDeEmails.add("GusttavoLimaEmbaixador@hotmail.com");
        listaDeEmails.add("Leonardo.Ribeiro@gmail.com");

    for (Object email : listaDeEmails){
       System.out.println(email);
       }
    }
}

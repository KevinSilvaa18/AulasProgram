public class Celular02 {

    String processador;

    String bateria;

    String memoria;

    String ram;

    String chipset;

    String gpu;

    String ampere;

    public Celular02(String processador, String liPo, String s){
        this.processador = processador;

        System.out.println(processador );
    }

    public Celular02(String bateria, String ampere){
        this.bateria = bateria;
        this.ampere = ampere;

        System.out.println(bateria + "\n" + ampere );
    }
}

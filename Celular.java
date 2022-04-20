public class Celular {
    String processador;
    String bateria;
    String memoria;
    String ram;
    String chipset;
    String gpu;
    String ampere;


    public void celularON(){
        System.out.println("O celular está ligando");
    }

    public void celularOFF(){
        System.out.println("O celular está desligando");
    }

    public void celularSetup(Celular celular){
        System.out.println("O setup do celular é:" + celular.ampere + " \n " + celular.gpu + " \n " + celular.chipset + " \n " + celular.memoria + " \n " + celular.bateria + " \n " + celular.ram + " \n " + celular.processador);
    }

    public void celularDescarregando(){
        System.out.println("Celular em 2%, coloque-o para carregar urgentemente!!!!");
    }

    public void celularCarregado(){
        System.out.println("Celular carregado em 100%, pode voltar a usa-lo!!!");
    }

}

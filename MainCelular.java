public class MainCelular {

    public static void main (String[] args){

        Celular celular = new Celular();

        celular.processador = "2x 2.96 GHz Kryo 485 Gold + 6x 1.8 GHz Kryo 485 Silver";
        celular.bateria = "LiPo";
        celular.memoria = "128 GB";
        celular.ram = "6 GB";
        celular.chipset = "Snapdragon 860 Qualcomm";
        celular.gpu = "Adreno 640";
        celular.ampere = "5160 mAh";

        celular.celularDescarregando();
    }
}

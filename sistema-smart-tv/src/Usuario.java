public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        
        System.out.println("Qual canal se encontra? " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Qual canal se encontra? " + smartTv.canal);

        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Qual volume da TV? " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo estado : Tv ligada? " + smartTv.ligada);
        smartTv.desligar();
        System.out.println("Novo estado : Tv ligada? " + smartTv.ligada);
    }
}

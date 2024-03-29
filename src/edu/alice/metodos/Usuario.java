package edu.alice.metodos;

public class Usuario {

  public static void main(String[] args) throws Exception {
    SmartTv smartTv = new SmartTv();
    System.out.println("Tv ligada: " + smartTv.ligada);
    System.out.println("Canal atual: " + smartTv.canal);
    System.out.println("Volume atual: " + smartTv.volume);

    smartTv.ligar();
    System.out.println("Tv ligada: " + smartTv.ligada);
    smartTv.desligar();
    System.out.println("Tv ligada: " + smartTv.ligada);

    smartTv.aumentarVolume();
    smartTv.aumentarVolume();
    System.out.println("Volume atual: " + smartTv.volume);
    smartTv.diminuirVolume();
    System.out.println("Volume atual: " + smartTv.volume);

    smartTv.aumentarCanal();
    smartTv.aumentarCanal();
    System.out.println("Canal atual: " + smartTv.canal);
    smartTv.diminuirCanal();
    System.out.println("Canal atual: " + smartTv.canal);
    smartTv.mudarCanal(120);
    System.out.println("Canal atual: " + smartTv.canal);
    smartTv.mudarCanal(99);
    System.out.println("Canal atual: " + smartTv.canal);

  }

}

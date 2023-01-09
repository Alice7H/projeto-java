package edu.alice.metodos;

public class SmartTv {
  boolean ligada = false;
  int canal = 1;
  int volume = 20;

  public void ligar() {
    this.ligada = true;
  }

  public void desligar() {
    this.ligada = false;
  }

  public void aumentarVolume() {
    this.volume++;
    if (this.volume > 100) {
      System.out.println("Volume inexistente");
      this.volume = 100;
    }
  }

  public void diminuirVolume() {
    this.volume--;
    if (this.volume < 0) {
      System.out.println("Volume inexistente");
      this.volume = 0;
    }
  }

  public void mudarCanal(int valor) {
    if (valor < 1 || valor > 100) {
      System.out.println("Canal inexistente");
      this.canal = 1;
    } else {
      this.canal = valor;
    }
  }

  public void aumentarCanal() {
    this.canal++;
    if (this.canal > 100) {
      System.out.println("Canal inexistente");
      this.canal = 100;
    }
  }

  public void diminuirCanal() {
    this.canal--;
    if (this.canal < 1) {
      System.out.println("Canal inexistente");
      this.canal = 1;
    }
  }
}

package edu.alice.tiposevariaveis;

public class TiposVariaveis {
  public static void main(String[] args) throws Exception {
    double salarioMinimo = 2500.33;
    byte idade = 123;
    short ano = 2023;
    int cep = 2107033; // se começar com zero, mude o tipo
    long cpf = 98765432109L; // deve se encerrar com L, se começar com zero, mude o tipo
    float pi = 3.14F; // deve se encerrar com com F
    double salario = 1275.33;

    // Tipos de variáveis
    short numeroCurto = 1;
    int numeroNormal = numeroCurto;
    short numeroCurto2 = (short) numeroNormal; // uso de casting

    // Variáveis
    int numero = 5;
    numero = 10;
    final double VALOR_DE_PI = 3.14;
    // VALOR_DE_PI = 15; -> proibido alterar

    String meuNome = "ALICE HATA";
  }
}

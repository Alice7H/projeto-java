package edu.alice.operadores;

public class Operadores {
  public static void main(String[] args) {
    String nomeCompleto = "LINGUAGEM " + "JAVA";
    System.out.println(nomeCompleto); // LINGUAGEM JAVA

    int soma = 2 + 3;
    System.out.println(soma); // 5

    String concatenacao = 1 + 1 + "1";
    System.out.println(concatenacao); // 21
    concatenacao = "1" + 1 + 1;
    System.out.println(concatenacao); // 111
    concatenacao = 1 + "1" + 1;
    System.out.println(concatenacao); // 111

    // operador unário
    int numero = 5;
    numero = -numero;
    System.out.println(numero);
    // numero = + numero; // atribui valor à variável
    numero = numero * -1; // torna positivo
    System.out.println(numero);

    int valor = 5;
    valor++; // 6
    valor += 2; // 8
    System.out.println(valor++); // 8
    System.out.println(valor); // 9
    System.out.println(++valor); // 10

    boolean variavel = true;
    variavel = !variavel;
    System.out.println(variavel);

    // operador ternário
    int idade = 18;
    String resultado = idade >= 18 ? "Maior de idade" : "Menor de idade";
    System.out.println(resultado);

    // operadores relacionais
    int valor1 = 15;
    int valor2 = 14;
    boolean simNao = valor1 == valor2;
    System.out.println("Valor igual? " + simNao);

    simNao = valor1 != valor2;
    System.out.println("Valor diferente? " + simNao);
    simNao = valor1 > valor2;
    System.out.println("Valor 1 maior que valor 2? " + simNao);
    simNao = valor1 < valor2;
    System.out.println("Valor 1 menor que valor 2? " + simNao);

    String nome1 = "Alice";
    String nome2 = new String("Aline");
    System.out.println("Nomes são iguais? " + nome1.equals(nome2));

    // operadores lógicos
    boolean condicao1 = true;
    boolean condicao2 = false;
    if (condicao1 && condicao2)
      System.out.println("ok");
    else
      System.out.println("nope");

    if (condicao1 || condicao2)
      System.out.println("Atende aos requisitos");
  }
}

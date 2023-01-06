package edu.alice.anatomiadasclasses;

public class MyClass {
  public static void main(String[] args) {
    String primeiroNome = "Alice";
    String segundoNome = "Hata";
    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
    System.out.println(nomeCompleto);
  }

  public static String nomeCompleto(String primeiroNome, String segundoNome) {
    return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
  }

  /*
   * // Variáveis
   * int numeroUm = 1;
   * int numero$um = 1;
   * int numero1 = 1;
   * int numeroum = 1;
   * int numbero_long = 1;
   * int _numero1 = 1;
   *
   * // Uso de final
   * final String BR = "Brasil";
   * final double PI = 3.14;
   * final int ESTADOS_BRASILEIROS = 27;
   *
   * // Tipo NomeBemDefinido = Atribuição(opcional)
   * String meuNome = "Alice";
   * int anoFabricacao = 2022;
   * boolean verdadeira = true;
   * int idade;
   * double altura;
   *
   * idade = 23;
   * altura = 1.62;
   *
   * // TipoRetorno NomeObjetivoNoInfinitivo Parâmetro(s)
   * // int somar(int numero1, int numero2)
   * // String formatarCep(long cep)
   *
   * // Nomenclaturas recomendadas
   * double salarioMedio = 1500.23; // variavel bem definida
   * String email = "aluno@escola.com"; // variavel no singular
   * String [] emails = {"aluno@escola.com", "professor@escola.com"} // variavel
   * no plural (array ou coleção)
   * String meuNome = "JOSEPH" // variavel com mesmo padrão de nome
   *
   * // Nomenclatura de métodos
   * somar(int numero1, int numero2){}
   * abrirConexao(){}
   * concluirProcessamento(){}
   * findById(int id){}
   */
}
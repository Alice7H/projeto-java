## Projeto Java

### Sintaxe Java

- Anatomia das Classes

  - Declarações de variáveis e métodos:

    - As variáveis podem iniciar com letra ou`_,` e pode conter `$_`.

    - Usamos a palavra-chave `final` para definir uma instrução final/constante ou não modificável.

    - Definimos a estrutura da variável como:
      Tipo NomeBemDefinido = Atribuição(opcional)

    - A estrutura dos métodos é:
      TipoRetorno, NomeObjetivoNoInfinitivo e Parâmetro(s)(opcional)

    - Concat é uma power class, serve para conectar textos.

    - Quando não temos retorno definimos o tipo como void, caso exista, indicamos o retorno com a palavra `return`.

  - Identação
    É o termo usado para escrever o código do programa de forma hierárquico. Usamos como boa prática e organização, facilitando a visualização e o entendimento do programa.

  - Organizando arquivos
    À medida que o sistema evolui, surgem novos arquivo e isso exige organização, realizamos isso através de uma estrutura de subdiretórios com arquivos através de pacotes(packages).

    Podemos usar abreviações ou outros nomes de pacotes para determinadas finalidades. Ex: `org` para organizacional e `com` para comercial.

  - Sugestões de nomenclaturas

    - Seja claro, sem abreviações ou definição sem sentido.
    - Use variável no singular, exceto se referir a uma coleção ou array.
    - Defina um idioma único.

    - Os métodos deverão ser nomeados como verbos, através da mistura de letras minúsculas com maiúsculas. As palavras terão os nomes minúsculas, com exceção da primeira letra de cada palavra composta a partir da segunda palavra.

- Tipos e variáveis

  - Numéricos inteiros e decimais
  - Tipos Lógicos
  - Caracteres
  - Objetos
  - Diferenças entre variável e constante

  Palavrar reservadas servem para representar tipos de dados básicos que precisam ser manipulados para a construção de programas, são conhecidos como `primitive types`.

  Eles são:

  - int, byte, short, long, float, double, boolean e char.

  | Tipo    | Memória | Valor Mínimo               | Valor Máximo              |
  | ------- | ------- | -------------------------- | ------------------------- |
  | Byte    | 1 byte  | -128                       | -128                      |
  | Short   | 2 byte  | -32,768                    | 32,767                    |
  | Int     | 4 byte  | -2,147,483,648             | 2,147,483,647             |
  | Long    | 8 byte  | -9,223,372,036,854,775,808 | 9,223,372,036,854,775,807 |
  | Float   | 4 byte  | -3,4028E + 38              | 3,4028E + 38              |
  | Double  | 8 byte  | -1,7976E + 308             | 1,7976E + 308             |
  | Boolean | 1 byte  | true ou false              |
  | Char    | 2 byte  | 1 carácter, valores ASCII  |

  Variável é uma identificação de um espaço em memória utilizado pelo nosso programa, é composta por tipo de dados + identificação + valor atribuído.

  Às vezes precisamos usar o `casting` para garantir que o valor de uma variável poderá ser atribuído um determinado tipo.

  Constantes são valores armazenados em memória que não podem ser modificados depois de declarados, usamos a palavra `final` e por convenção, usamos a variável em caixa alta.

  Variáveis do tipo String guardam referências a objetos/sequência de caracteres, e não um valor. Esta classe possui construtores que permitem inicializar objetos do tipo String de várias formas.

- Operadores

  São símbolos especiais que tem um significado próprio para a linguagem e estão associados a determinadas operações.

  - Aritméticos: `+ - * / %`
  - Unários: `+ - ++ -- !`, valor positivo, negativo, incremento, decremento e negação.
  - Ternário: condição + `? :`
  - Relacionais: `> < <= >= == != === !==`
  - Lógicos: `&& ||`

- Métodos
- Escopo

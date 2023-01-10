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

  Questões importantes na construção de um método:

  - Proposta do método?
  - Retorno esperado?
  - Parâmetros necessários?
  - Possui riscos de exceções? (throws Exception)
  - Visibilidade do método?

  As ações das aplicações são consideradas métodos/funções ou sub-rotinas disponíveis dentro das classes.

  O método é nomeado como verbo e com padrão camelCase.

- Escopo

  É a identificação da localização mais conveniente para a escrita de algoritmos necessário para o nosso programa.

  Também pode ser entendido como o ambiente onde uma variável pode ser acessada.

  - Escopo de classe (atributos da classe)
  - Escopo de método (variável declarada dentro de um método)
  - Escopo de fluxo (variável disponível apenas em algum bloco de código, dentro do loop for, pro exemplo).

- Palavras reservadas

  São identificadores de uma linguagem que já possuem uma finalidade específica e não podem ser utilizados para nomear variáveis, classes, métodos ou atributos.

  Java possui 52 palavras reservadas e são usadas em:

  Em controle de pacotes:

  - import: importa pacotes ou classes para dentro do código.
  - package: especifica a que pacote todas as classes de um arquivo pertencem.

  Modificadores de acesso:

  - public: acesso a qualquer classe
  - private: acesso apenas dentro da classe
  - protect: acesso por classes no mesmo pacote e subclasses(herança).

  Tipos primitivos:

  - boolean, byte, char, double, float, int, long, short e void.

  Modificadores de classes, variáveis ou métodos

  - abstract: classes que não pode ser instanciada ou precisa ser implementado por uma subclasse não abstrata.
  - class:especifica uma classe.
  - extends: indica superclasse que a subclass está estendendo.
  - final: impossibilita que a classe seja estendida, que um método seja sobrescrito ou que uma variável seja reinicializada.
  - implements: indica as interfaces que uma classe irá implementar.
  - interface: especifica uma interface.
  - native: indica que um método está escrito em uma linguagem dependente de plataforma, como o C.
  - new: instancia um novo objeto. chamando o seu construtor.
  - static: faz um método ou variável pertencer à classe ao invés de às instâncias.
  - strictfp: (em método ou classe) indica que os números de ponto flutuante seguirão as regras de um ponto flutuante em todas as expressões.
  - synchronized: indica que um método só pode ser acessado por uma thread de cada vez.
  - transient: impede serialização de campos.
  - volatile: indica que uma variável pode ser alterada durante o uso de threads.

  Controle de fluxo dentro de um bloco de código:

  - break: sai do bloco de código em que está.
  - case: escuta um bloco de código dependendo do teste do switch.
  - continue: pula a execução do código que viria após essa linha e vai para a próxima passagem do loop.
  - assert: teste uma expressão condicional para verificar uma suposição do programador.
  - catch: declara o bloco de código usado para tratar uma exceção
  - finally: bloco de código, após um try-catch, que é executado independentemente do fluxo de programa seguido ao lidar com uma exceção.
  - throw: usado para passar uma exceção para o método que o chamou
  - throws: indica que um método pode passar uma exceção para o método que o chamou.
  - try: bloco de código que tentará ser executado, mas que pode causar exceção.

  Variáveis de referência:

  - super: refere-se a superclasse imediata
  - this: refere-se a instância atual do objeto.

  | Uso      | palavras                                                                     |
  | -------- | ---------------------------------------------------------------------------- |
  | arquivo  | package, import, static                                                      |
  | classe   | public ou protected ou private + final ou abstract + extends ou implements   |
  | método   | public ou protected ou private + static ou final ou abstract + void e return |
  | atributo | public ou protected ou private + static ou final + tipo primitivo            |

  Palavras "opostas":

  | Palavra | Palavra    | Explicação                                                                                                                                |
  | ------- | ---------- | ----------------------------------------------------------------------------------------------------------------------------------------- |
  | package | import     | package determina o diretório real da classe, o import informa de onde será importado a classe de um pacote.                              |
  | extends | implements | extends determina que uma classe estende outra classe (herança) e implements determina que uma classe implementa uma interface            |
  | final   | abstract   | final determina fim de alteração de valor lógica comportamental, abstract em método exige que subclasses precisarão definir comportamento |
  | throws  | throw      | throws determina que um método pode lançar uma exceção, throw é a implementação que dispara a exceção                                     |

- Java Doc:

  Mais em [Java Básico](https://felipe-silva-aguiar.gitbook.io/dio-java/gitbook/summary)

  [Documentação JavaSE7 - String] (https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)

  Tags:

  - Podemos usar `tags` para informar sobre a versão, autor, data de início ou disponibilização de determinado recurso, além de parâmetros, definir o tipo de retorno de um método e se o método lança alguma exceção.

  Comentários:

  - Uma linha (one line), usa-se a barra `//`;
  - Múltiplas linhas (multi line), `/**/`;
  - Documentação: `/** */`.

  Javadoc:

  É um gerador de documentação criado pela Sun Microsystems para documentar a API dos programas em Java, a partir do código-fonte.

  O resultado é expresso em HTML, constituído por algumas marcações simples.

  Para criar nossa documentação, no terminal, execute o comando:
  `javadoc -encoding UTF-8 -docencoding ISO-8859-1  -d ../docs  src/*.java`

- Terminal e Argumentos

  Com a JVM devidamente configurada, podemos criar um executável do nosso programa e disponibilizar o instalador para qualquer sistema operacional. Faremos isso via terminal.

  - Configuração da pasta bin

    O Visual Studio Code não cria automaticamente a pasta bin, o arquivo .classpath e o arquivo .settings para a linguagem java, se o seu projeto for recém-criado no VS Code através do comando Java: `Create Java Project...`. Este comando criará um novo projeto sem ferramentas de compilação. (Sem Maven e Gradle). Nesse caso, os arquivos como .classpath, .project, etc... ficarão ocultos no caminho de armazenamento do espaço de trabalho, o que é intencional, pois serve para o usuário se concentrar apenas no próprio código.

    Se você quiser ver a pasta bin, há uma configuração chamada `java.project.outputPath`, você pode definir um caminho relativo para essa configuração, então a pasta de saída será mostrada explicitamente em seu projeto.

    Para isso, você pode seguir os passos no VS Code:

    - Na aba View -> Command Palette -> Preferences: Open User Settings(JSON).
    - Ou use o atalho Ctrl + Shift + P -> Preferences: Open User Settings(JSON).
    - Adicione: "java.project.outputPath": "bin"

  - Execução de arquivo no terminal

    Com o diretório apontado para a pasta bin, podemos rodar o comando `java MinhaClasse` para executar o arquivo MinhaClasse.class (gerado a partir da criação do MinhaClasse.java).

  - Argumentos

    Quando executamos uma classe que contenha o método main, o mesmo permite que passemos um array [] de argumentos do tipo String. Logo podemos após a definição da classe a ser executada informar estes parâmetros, exemplo: `java MinhaClasse agumentoUm argumentoDois`.

    Podemos adicionar `args` como array e configurar parâmetros no arquivo `launch.json` para rodar as classes via IDE.

  - Scanner

    Podemos receber dados digitados pelo usuário, e outra maneira de fazer isso é via Scanner.

    A classe Scanner permite que o usuário tenha uma interação mais assertiva com o nosso programa, além de mais intuitiva aos usuários.

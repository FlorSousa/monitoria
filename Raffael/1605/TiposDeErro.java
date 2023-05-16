public class TiposDeErro {

    public static void main(String[] args) {

        // 2 TIPOS DE ERROS
        // ERROS DE COMPILAÇÃO

        // Primeiro erro - Erro de compilação é o erro convencional que acontece quando escrevemos uma palavra errada.
        // É um erro que faz com que o computador não entenda oque você escreveu. Isso está diretamente ligado
        // as linguagens da alto e baixo nível.

        // Exemplo :

        //---------------------------------------------------------------------------------------------------------------
                                                    var textstring = "Olá";
                                                    System.out.println(textstringg);
        //---------------------------------------------------------------------------------------------------------------

        // É possível ver que a variavel "textstringg" está escrito de maneira incorreta, isso acaba gerando um erro de
        // compilação. O computador não vai entender oque está sendo solicitado, fazendo com que a conversão entre
        // linguagem de alto/baixo nível não ocorra.

        // Segundo erro - Erro de execução é o erro que ocorre durante a execução do programa.

        // Exemplo :

        //---------------------------------------------------------------------------------------------------------------
                                                    int x = 10;
                                                    int y = 0;
                                                    System.out.println(x / y);
        //---------------------------------------------------------------------------------------------------------------

        // Geralmente é um erro que o programa não espereva, chamamos isso de exceção. No caso acima, é visível o erro
        // de matemática básica, pois nenhum número é divisível por 0. O programa acaba tendo um problema de execução
        // por conta do erro inesperado.

    }
}

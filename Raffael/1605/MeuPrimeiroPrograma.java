public class MeuPrimeiroPrograma {

    //"public static void" é um conjunto de palavras-chave usadas para declarar um método em Java. Aqui está o que cada um desses termos significa:
    //
    //"public" indica que o método pode ser acessado de fora da classe em que está definido.
    //"static" indica que o método pertence à classe em vez de uma instância específica dessa classe. Isso significa que você pode chamar o método
    //sem precisar criar um objeto da classe primeiro.
    //"void" indica que o método não retorna nenhum valor.
    //Portanto, um método definido como "public static void" é um método público, pertencente à classe e que não retorna nenhum valor.
    //
    //Esse tipo de método é frequentemente usado para executar uma tarefa ou ação que não requer um resultado. Por exemplo, um método "public static void"
    //pode ser usado para imprimir uma mensagem na tela, atualizar um arquivo de log, inicializar um objeto ou realizar cálculos intermediários em um programa.
    // Eles também são frequentemente usados como métodos de utilidade, ou seja, métodos que podem ser usados ​​em toda a aplicação e não estão vinculados a uma instância específica da classe.
    public static void main(String[] args) {

            System.out.println("Olá Mundo !!");
            System.out.println(2 + 2);
            System.out.println((2 - 6) + 50 * 2);
            System.out.println("Valor do produto : R$ ");

        //JAVA necessita de um "começo"... (entry-point)
        //Para exemplificar essa fala, podemos utlizar a Netflix. Quando o aplicativo é aberto, uma janela com a opção de registro/login é exibida como um ponto inicial do programa.
        //Então, existe uma linha de código (comando) que serve como esse ponto de entrada dentro dos códigos do aplicativo em questão, pois é semelhante ao "public static void main(String[] args)"; do java.
        //Assim que o computador lê esse código, ele inicia o programa. Lembrando que é um código obrigatório para dar início a um programa em JAVA.

        //A partir deste ponto estaremos manipulando dados, criando mecanismos para que tudo funcione perfeitamente de acordo com a necessidade do aplicativo, site e etc.
        //Todos esse dados são armazenados em propriedades/variáveis. Além da parte de método/funções, que são instruções (bloco de códigos) reutilizáveis para alterar dados.

                //---------------------------------------------------------------------------------------------------------------
                                                //Um exemplo : " void minhaInstrucaoDeImprimir() "
                //---------------------------------------------------------------------------------------------------------------

        //Dessa forma, você cria uma função que não está presente no kit desenvolvimento JAVA.
        // Com esse exemplo acima, assim que você cria, ela fica disponível para uso sempre que for necessária (chamada).

        //Caso precise, pode-se deixar uma nota para que o programador consiga entender qual a utilidade da função que você está criando.
        // Para criar, basta adicionar "//" e escrever logo após.


        //Metodos : são instruções que define para programar e executar.

                //---------------------------------------------------------------------------------------------------------------
                                        //Um exemplo : instrução chamada "System.out.printl("       ")"
                //---------------------------------------------------------------------------------------------------------------


    }

}
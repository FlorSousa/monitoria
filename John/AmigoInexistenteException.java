package John;

public class AmigoInexistenteException extends Exception{
    public AmigoInexistenteException(String textoRetorno){
        System.out.println(textoRetorno);
    }
}

package John.Ex2;

public class AmigoInexistenteException extends Exception{
    public AmigoInexistenteException(String textoRetorno){
        System.out.println(textoRetorno);
    }
}

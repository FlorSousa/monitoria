
public class Mensagem {
    private String texto;
    private String emailRemetente;
    private boolean anonima;

    public Mensagem(String texto, String emailRemetente, boolean anonima){
        this.anonima = anonima;
        this.emailRemetente = emailRemetente;
        this.texto = texto;
    }

    public String getTexto(){
        return this.texto;
    }

    public boolean ehAnonima(){
        return this.anonima;
    }

    public String getEmailRemetente(){
        return this.emailRemetente;
    }

    public void setTexto(String texto){
        this.texto  = texto;
    }

    public void setEmailRemetente(String emailRemetente){
        this.emailRemetente = emailRemetente;
    }

    public String getTextoCompletoAExibir(){
        return this.anonima?
        String.format("Mensagem para todos. Texto: %s", this.texto)
        :
        String.format("Mensagem de %s para todos. Texto: %s", this.emailRemetente, this.texto);
    }
}

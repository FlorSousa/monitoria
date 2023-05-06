package John.Ex2;
import java.util.ArrayList;
import java.util.List;

public class SistemaAmigo{
    private List<Amigo> amigos;
    private List<Mensagem> mensagens;
    public SistemaAmigo(){
        this.amigos = new ArrayList<>();
        this.mensagens = new ArrayList<>();
    }

    public void cadastraAmigo(String nome, String email){
        this.amigos.add(new Amigo(nome, email));
    }

    public List<Mensagem> pesquisaMensagensAnonimas(){
        List<Mensagem> mensagensAnonimas = new ArrayList<>();
        for (Mensagem mensagem : mensagensAnonimas) {
            if(mensagem.ehAnonima()) mensagensAnonimas.add(mensagem);
        }
        return mensagensAnonimas;
    }

    public void configuraAmigoSecretoDe(String emailDaPessoa, String emailAmigoSorteado) throws AmigoInexistenteException{
        boolean existe = false;
        for (Amigo amigo : amigos) {
            if(amigo.getEmail().equals(emailDaPessoa)){
                existe =  true;
                amigo.setEmailAmigoSorteado(emailAmigoSorteado);
            }
        }
        if(!existe) throw new AmigoInexistenteException(String.format("Não existe esse amigo: %s",emailDaPessoa));
    }

    public List<Mensagem> pesquisaTodasAsMensagens(){
        return this.mensagens;
    }

    public String pesquisaAmigoSecretoDe(String emailDaPessoa) throws Exception{
        Amigo amigoEncontrado = null;
        for (Amigo amigo : amigos) {
            if(amigo.getEmail().equals(emailDaPessoa)) amigoEncontrado = amigo;
        }
        if(amigoEncontrado != null){
            String emailSorteado = amigoEncontrado.getEmailAmigoSorteado();
            if(amigoEncontrado.getEmailAmigoSorteado() == null) throw new AmigoNaoSorteadoException("Não sorteado");
            return emailSorteado;
        }
        throw new AmigoInexistenteException("Não existe esse amigo");
    }

    public void enviarMensagemParaAlguem(String texto,String emailRemetente, String emailDestinatario, boolean anonima){
        this.mensagens.add(new MensagemParaAlguem(texto, emailRemetente, emailDestinatario, anonima));
    }

    public void enviarMensagemParaTodos(String texto,String emailRemetente, boolean anonima){
        this.mensagens.add(new MensagemParaTodos(texto, emailRemetente, anonima));
    }
}
public class TestaAmigo {
    public static void main(String[] args){
        SistemaAmigo s = new SistemaAmigo();
        s.cadastraAmigo("Jose", "jose@gmail.com");
        s.cadastraAmigo("maria", "maria@gmail.com");
        try{
            s.configuraAmigoSecretoDe("jose@gmail.com", "maria@gmail.com");
            s.configuraAmigoSecretoDe("maria@gmail.com", "jose@gmail.com");
            s.enviarMensagemParaAlguem("M1", "maria@gmail.com", "jose@gmail.com", true);
            s.enviarMensagemParaTodos("M2", "maria@gmail.com", false);
            for(Mensagem m:s.pesquisaMensagensAnonimas()){
                m.getTextoCompletoAExibir();
            }
            if(s.pesquisaAmigoSecretoDe("jose@gmail.com").equals("maria@gmail.com")) System.out.println("Ok!");
        }catch(Exception e){
            System.out.println(e.toString());
        }
    }
}

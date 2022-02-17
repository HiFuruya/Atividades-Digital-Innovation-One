public class Vagao {

    private String conteudo;
    private Vagao proximoVagao;
    private Vagao vagaoAnterior;

    public Vagao(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getConteudo(){
        return this.conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
    
    public Vagao getProximoVagao(){
        return this.proximoVagao;
    }

    public void setProximoVagao(Vagao proximoVagao) {
        this.proximoVagao = proximoVagao;
    }
    
    public Vagao getVagaoAnterior(){
        return this.vagaoAnterior;
    }

    public void setVagaoAnterior(Vagao vagaoAnterior) {
        this.vagaoAnterior = vagaoAnterior;
    } 
}

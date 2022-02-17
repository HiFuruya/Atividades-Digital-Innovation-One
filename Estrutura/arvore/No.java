public class No {
    private No direita;
    private No esquerda;
    private String conteudo;

    public No(String conteudo){
        this.conteudo = conteudo;
    }

    public No getNoDireita() {
        return direita;
    }

    public void setNoDireita(No direita) {
        this.direita = direita;
    }

    public No getNoEsquerda() {
        return esquerda;
    }

    public void setNoEsquerda(No esquerda) {
        this.esquerda = esquerda;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
}

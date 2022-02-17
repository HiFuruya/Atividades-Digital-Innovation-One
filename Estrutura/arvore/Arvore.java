public class Arvore {

    private No raiz;

    public Arvore(){}

    public void inserir(String conteudo) {
        No novoNo = new No(conteudo);
        raiz = inserir(raiz, novoNo);
    }

    private No inserir(No atual, No novoNo){
        
        if (atual == null) 
            return novoNo;
        else if(novoNo.getConteudo().compareTo(atual.getConteudo()) < 0)
            atual.setNoEsquerda(inserir(atual.getNoEsquerda(), novoNo));
        else
            atual.setNoDireita(inserir(atual.getNoDireita(), novoNo));

        return atual;
    }

    public void emOrdem(){

        System.out.print("\nExibir em Ordem");
        emOrdem(this.raiz);

    }

    private void emOrdem(No atual){

        if (atual != null) {
            emOrdem(atual.getNoEsquerda());
            System.out.print(" -> "+atual.getConteudo());
            emOrdem(atual.getNoDireita());
        }
    }

    public void emPosOrdem(){

        System.out.print("\nExibir Pos Ordem");
        emPosOrdem(this.raiz);

    }

    private void emPosOrdem(No atual){

        if (atual != null) {
            emPosOrdem(atual.getNoEsquerda());
            emPosOrdem(atual.getNoDireita());
            System.out.print(" -> "+atual.getConteudo());
        }
    }    

    public void emPreOrdem(){

        System.out.print("\nExibir Pre Ordem");
        emPreOrdem(this.raiz);

    }

    private void emPreOrdem(No atual){

        if (atual != null) {
            System.out.print(" -> "+atual.getConteudo());
            emPreOrdem(atual.getNoEsquerda());
            emPreOrdem(atual.getNoDireita());
        }
    }
    
    public boolean remover(String conteudo){

        No atual = this.raiz;
        No pai =  null;
        No filho;
        No temp;

        while (atual != null && !atual.getConteudo().equals(conteudo)){
            pai = atual;
            if(conteudo.compareTo(atual.getConteudo()) < 0){
                atual = atual.getNoEsquerda();
            }else if(atual == null)
                break;
            else {
                atual = atual.getNoDireita();
            }
        }

        if (atual == null) {
            return false;
        }

        if(pai == null){
            if(atual.getNoDireita() == null){
                this.raiz = atual.getNoEsquerda();
            }else if (atual.getNoEsquerda() == null){
                raiz = atual.getNoDireita();
            }else {
                for(temp = atual, filho = atual.getNoEsquerda();
                        filho.getNoDireita() != null;
                        temp = filho, filho = filho.getNoEsquerda()
                    ){
                        if(filho != atual.getNoEsquerda()){
                            temp.setNoDireita(filho.getNoEsquerda());
                            filho.setNoEsquerda(raiz.getNoEsquerda());
                        }
                    }
                    filho.setNoDireita(raiz.getNoDireita());
                    raiz = filho;
            }
        }else if(atual.getNoDireita() == null){
            if(pai.getNoEsquerda() == atual){
                pai.setNoEsquerda(atual.getNoEsquerda());
            }else {
                pai.setNoDireita(atual.getNoEsquerda());
            }
        }else if(atual.getNoEsquerda() == null){
            if(pai.getNoEsquerda() == atual){
                pai.setNoEsquerda(atual.getNoDireita());
            }else {
                pai.setNoDireita(atual.getNoDireita());
            }
        }else{
            for(temp=atual, filho = atual.getNoEsquerda();
                filho.getNoDireita() != null;
                temp = filho, filho = filho.getNoDireita());
            if(filho != atual.getNoEsquerda()){
                temp.setNoDireita(filho.getNoEsquerda());
                filho.setNoEsquerda(atual.getNoEsquerda());
            }else{
                pai.setNoDireita(filho);
            for(
                    temp = atual, filho = atual.getNoEsquerda();
                    filho.getNoDireita() != null;
                    temp = filho, filho = filho.getNoDireita()
            ){
                if(filho != atual.getNoEsquerda()){
                    temp.setNoDireita(filho.getNoEsquerda());
                    filho.setNoEsquerda(atual.getNoEsquerda());
                }
                filho.setNoDireita(atual.getNoDireita());
                if(pai.getNoEsquerda() == atual){
                    pai.setNoEsquerda(filho);
                }else{
                    pai.setNoDireita(filho);
                }
            }
        }
    }
    return true;
}


    public No buscar(String conteudo){

        No atual = this.raiz;

        while (atual != null && atual.getConteudo().equals(conteudo)) {

            if (conteudo.compareTo(atual.getConteudo()) < 0) 
                atual = atual.getNoEsquerda();
            else
                atual = atual.getNoDireita();
            
        }
        return atual;
    }

    
}

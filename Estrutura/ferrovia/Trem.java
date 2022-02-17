public class Trem {
    
    private Vagao ultimoVagao;
    private Vagao primeirVagao;
    private int qtd = 0;

    public int getQtd() {
        return qtd;
    }
    
    public void adicionar(String conteudo){

        Vagao nVagao = new Vagao(conteudo);

        if (qtd == 0) {
            primeirVagao = nVagao;
            ultimoVagao = nVagao;
            qtd++;
        }else{
            ultimoVagao.setProximoVagao(nVagao);
            nVagao.setVagaoAnterior(ultimoVagao);
            ultimoVagao = nVagao;
            qtd++;
        }
    }

    public boolean romever(){

        if (qtd > 1) {
            ultimoVagao.getVagaoAnterior().setProximoVagao(null);
            qtd--;
            return true;
        }else if(qtd == 1){
            primeirVagao = null;
            ultimoVagao = null;
            qtd--;
            return true;
        }else{
            return false;
        }
    }
    
    public String listar(){

        String lista = "\nConteudo dos vagoes:";

        if (qtd == 0) 
            lista = "Nao ha vagoes";
        
        else{
            Vagao aux = primeirVagao;
            for (int i = 0,j = 1; i < qtd; i++,j++) {
                lista += " -> Vagao "+j+": "+aux.getConteudo();
                aux = aux.getProximoVagao();
            }
        }
        return lista;
    }
}

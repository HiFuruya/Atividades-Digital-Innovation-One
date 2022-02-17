public class ListaSimples{

    private int posicao = 0;
    private NoSimples primeiroNo;

    public ListaSimples(){}

    public int quantidadeDeElementosLista(){
        return posicao;
    }

    private NoSimples getNo(int lugar){

        NoSimples aux = primeiroNo;

        for (int i = 0; i < lugar; i++) {
            aux = aux.getProximoNo();
        }
        return aux;
    }

    public void incluir(String item){

        NoSimples novoNo = new NoSimples(item);

        if (posicao == 0) {
            primeiroNo = novoNo;
            posicao++;
            return;
        }

        NoSimples aux = primeiroNo;
        for (int i = 0; i < posicao - 1; i++) {
            aux = aux.getProximoNo();
        }
        
        aux.setProximoNo(novoNo);
        posicao++;
        return;
    }

    public boolean incluirPosicao(String item, int lugar){

        NoSimples novoNo = new NoSimples(item);

        if (posicao == 0 && lugar == 0)
            primeiroNo = novoNo;
        else if(lugar <= posicao && lugar > 0){
            NoSimples aux = getNo(lugar);
            novoNo.setProximoNo(aux);

            aux = getNo(lugar - 1);
            aux.setProximoNo(novoNo);
        }else
            return false;
        posicao++;
        return true;
    }

    public boolean excluir(int lugar){

        if (posicao != 0) {
            if (lugar == 0) {
                primeiroNo = primeiroNo.getProximoNo();

                posicao--;
                return true;
            }else{
                if (lugar <= posicao - 1 && lugar > 0) {
                    NoSimples aux = getNo(lugar - 1);
                    aux.setProximoNo(aux.getProximoNo().getProximoNo());

                    posicao--;
                    return true;
                }

                return false;
            }
        }
        return false;
    }

    public String listar(){
        String lista = "Lista";

        NoSimples aux = primeiroNo;

        for (int i = 0; i < posicao; i++) {

            lista += " -> "+aux.getItem();

            aux = aux.getProximoNo();
        }

        return lista;
    }
}
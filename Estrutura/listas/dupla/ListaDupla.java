public class ListaDupla {
    
    private NoDuplo primeiroNo;
    private NoDuplo ultimoNo;
    private int tamanho = 0;

    public ListaDupla(){}

    public int tamanho(){
        return tamanho;
    }

    private NoDuplo getNo(int lugar){

        NoDuplo aux = primeiroNo;

        for (int i = 0; i < lugar; i++) {
            aux = aux.getProximoNo();
        }
        return aux;
    }

    public void incluir(String item){

        NoDuplo novoNo = new NoDuplo(item);
        novoNo.setProximoNo(null);
        novoNo.setNoAnterior(ultimoNo);

        if (primeiroNo == null) {
            primeiroNo = novoNo;
        }

        if (ultimoNo != null) {
            ultimoNo.setProximoNo(novoNo);
        }

        ultimoNo = novoNo;
        tamanho++;
    }

    public boolean incluirPosicao(String item, int lugar){

        if (lugar > -1 && lugar <= tamanho) {
            NoDuplo aux = getNo(lugar);
            NoDuplo novoNo = new NoDuplo(item);
            novoNo.setProximoNo(aux);

            if (novoNo.getProximoNo() != null) {
                novoNo.setNoAnterior(aux.getNoAnterior());
                novoNo.getProximoNo().setNoAnterior(novoNo);
            }else{
                novoNo.setNoAnterior(ultimoNo);
                ultimoNo = novoNo;
            }

            if (lugar == 0) {
                primeiroNo = novoNo;
            }else{
                novoNo.getNoAnterior().setProximoNo(novoNo);
            }
            tamanho++;
            return true;
        }else return false;

        
    }

    public boolean excluir(int lugar){

        if (lugar > -1 && lugar <= tamanho) {
            if (lugar == 0) {
                primeiroNo = primeiroNo.getProximoNo();
                if (primeiroNo != null) {
                    primeiroNo.setNoAnterior(null);
                }
            }else{
                NoDuplo aux = getNo(lugar);
                aux.getNoAnterior().setProximoNo(aux.getProximoNo());
                if (aux != ultimoNo) {
                    aux.getProximoNo().setNoAnterior(aux.getNoAnterior());
                }else{
                    ultimoNo = aux;
                }
            }
            tamanho--;
            return true;
        }else return false;
    }

    public String listar(){

        String lista = "Lista";

        NoDuplo aux = primeiroNo;

        for (int i = 0; i < tamanho; i++) {
            lista += " -> "+aux.getItem();
            aux = aux.getProximoNo();
        }
        return lista;
    }
}

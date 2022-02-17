public class NoDuplo {
    private String item;
    private NoDuplo proximoNo;
    private NoDuplo noAnterior;

    public NoDuplo(String item) {
        this.setItem(item);
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public NoDuplo getNoAnterior() {
        return noAnterior;
    }

    public void setNoAnterior(NoDuplo noAnterior) {
        this.noAnterior = noAnterior;
    }

    public NoDuplo getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(NoDuplo proximoNo) {
        this.proximoNo = proximoNo;
    }

}

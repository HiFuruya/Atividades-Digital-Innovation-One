public class NoSimples{
    private String item;
    private NoSimples proximoNo;

    public NoSimples(){
    }

    public NoSimples(String item){
        this.item = item;
    }

    public NoSimples(String item, NoSimples no){
        this.item = item;
        this.proximoNo = no;
    }
    
    public String getItem() {
        return item;
    }

    public NoSimples getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(NoSimples no) {
        this.proximoNo = no;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String toString(){
        return item;
    }    
}
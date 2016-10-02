public class STCard {
    private int id;
    private String title;

    public STCard(int id,String title){
        this.id = id;
        this.title = title;
    }

    public String toString() {
        return "id =" + id + "title = " + title;
    }
}

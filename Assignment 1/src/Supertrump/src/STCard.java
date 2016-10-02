public class STCard {
    private int id;
    private String title;
    private String type;

    public STCard(int id,String title,String type){
        this.id = id;
        this.title = title;
        this.type = type;
    }

    public String toString() {
        return "\nid ="+id+" title = "+title+ " type = " + type;
    }
}

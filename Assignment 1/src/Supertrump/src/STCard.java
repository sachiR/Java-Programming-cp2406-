public class STCard {
    private int id;
    private String title;
    private String type;
    private String subtitle;


    public STCard(int id,String title,String type){
        this.id = id;
        this.title = title;
        this.type = type;
    }

    public STCard(int id, String title, String type, String subtitle) {
        this.id = id;
        this.title = title;
        this.type = type;
        this.subtitle = subtitle;
    }

    public String toString() {
        return "\nTitle="+title+", Card Type="+type+", Subtitle="+subtitle;
    }
}
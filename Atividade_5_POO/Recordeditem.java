public class Recordeditem extends Libraryitem {
    String Title;
    String Medium;
    public Recordeditem(String Title, String Medium){
        this.Title = Title;
        this.Medium = Medium;
    }
    @Override
    public String toString(){
        return "Title: " + Title + "\nMedium: " + Medium;
 }
}

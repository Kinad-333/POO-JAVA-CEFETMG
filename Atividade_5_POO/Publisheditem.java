public class Publisheditem extends Libraryitem{
    String Title;
    String Publisher;
    public Publisheditem(String Title, String Publisher){
        this.Title = Title;
        this.Publisher = Publisher;
    }
    @Override
    public String toString(){
        return "Title: " + Title + "\nPublisher: " + Publisher;
 }
}

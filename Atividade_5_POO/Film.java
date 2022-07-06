public class Film extends Recordeditem{
    String Director;
    String Date_of_release;
    String Distributor;
    public Film(String Title, String Medium , String director, String dateOfRelease, String Distributor){
        super(Title, Medium);
        this.Director = director;
        this.Date_of_release = dateOfRelease;
        this.Distributor = Distributor;
    }
    @Override
    public String toString() {
        return super.toString()+"\nDirector: " + Director +"\nDate: " + Date_of_release + "\nDiscributor: " + Distributor;
    }
}

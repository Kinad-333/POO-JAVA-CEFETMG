public class Computer_program extends Recordeditem{
    String Version;
    String Platform;
    public Computer_program(String Title, String Medium ,String version, String platform){
        super(Title, Medium);
        this.Version = version;
        this.Platform = platform;
    }
    @Override
    public String toString() {
        return super.toString()+"\nVersion: "+ Version + "\nPlatform: "+ Platform;
    }
}
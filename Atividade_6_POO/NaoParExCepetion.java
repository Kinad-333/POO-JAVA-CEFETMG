public class NaoParException extends Exception{
    int valor;
    public NaoParException(int valor){
        this.valor = valor;
    }
    @Override
    public String toString(){
        return valor+"Esse numero não é par";
    }
}

public class CalculadoraDePares{
    public CalculadoraDePares() throws NaoParException{
    }
    public int somar(int x, int y){
        if((x%2 != 0) || (y%2 != 0)){
            throw new NaoParException();
        }
        return x+y;
    }
    public int subtrair(int x, int y){
        if((x%2 != 0) || (y%2 != 0)){
            throw new NaoParException();
        }
        return x-y;
    }
    public int multiplicar(int x, int y){
        if((x%2 != 0) || (y%2 != 0)){
            throw new NaoParException();
        }
        return x*y;
    }
    public int dividir(int x, int y){
        if((x%2 != 0) || (y%2 != 0)){
            throw new NaoParException();
        }
        return x/y;
    }
}

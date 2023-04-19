import java.lang.Math;
public class Calculadora {
    private boolean status;
    public Calculadora(){
        this.status=true;
    }
    public boolean getStatus() {
        return true;
    }

    public int addition(int i, int j) {
        return i+j;
    }

    public int differences(int i, int j) {
        return i-j;
    }

    public int division(int i, int j) {
        if(j==0){
            throw new IllegalArgumentException("No se puede dividir por cero");
        }else{
            return i/j;
        }

    }

    public int multiplication(int i, int j) {
        return i*j;
    }

    public float squareRoot(int i) {
        if(i<0){
            throw new IllegalArgumentException("No se puede sacar raiz cuadrada de un negativo");
        }else{
            return (float) Math.sqrt(i);
        }

    }
}


package calculadoraa;


public class calculadora {


    public int sumar(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public int restar(int numero1, int numero2) {
        return numero1 - numero2;

    }

    public int multiplicar(int numero1, int numero2){
        return numero1 * numero2;

    }
    public int dividir(int numero1, int numero2) {
        return numero1 / numero2;

    }
    public double raizCuadratica(int a, int b, int c){
        if(a ==0 || b == 0) {
            System.out.println("Ingrese datos válidos");
            return 0;
        }
       else {
            return (-b + -Math.sqrt((b * b) - (4 * a * c))) / 2 * a;
        }
    }
}

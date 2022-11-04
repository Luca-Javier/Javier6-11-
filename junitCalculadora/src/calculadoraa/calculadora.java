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
    public double[] raizCuadratica(int a, int b, int c){
        try{
       if(a ==0 || b == 0)  { throw new ArithmeticException(); }

        }catch (ArithmeticException e){
            System.out.println("El valor a o b vale 0");
        }
        double preMasMenos = Math.sqrt((b * b) - (4 * a * c));
        double postMasMenosPositivo = (-b + preMasMenos)/2*a;
        double postMasMenosNegativo = (-b - preMasMenos)/2*a;

        double[] rta = {postMasMenosPositivo,postMasMenosNegativo};
        return rta;
        //return (-b + -Math.sqrt((b * b) - (4 * a * c))) / 2 * a;

    }

}

package calculadoraTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import calculadoraa.calculadora;

import java.lang.reflect.Array;

public class calculadoraTest {

    calculadora calculator = new calculadora();
    @Test
    public void probar(){
        calculator.raizCuadratica(2,0,3);

    }

    @Test
    public void sumaTest() {
        assertEquals(calculator.sumar(1, 2), 3);
    }

    @Test
    public void sumaTestFail() {
        assertNotEquals(calculator.sumar(4,1),3);
    }


    @Test
    public void restarTest() {
        assertEquals(calculator.restar(5, 2), 3);
    }

    @Test
    public void restarTestFail() {
        assertNotEquals(calculator.restar(3,1),3);
    }

    @Test
    public void multiplicarTest() {
        assertEquals(calculator.multiplicar(5, 2), 10);
    }

    @Test
    public void multiplicarTestFail() {
        assertNotEquals(calculator.multiplicar(4,1),3);
    }

    @Test
    public void dividirTest() {
        assertEquals(calculator.dividir(6, 2), 3);
    }

    @Test
    public void dividirTestFail() {
        assertNotEquals(calculator.dividir(6, 2), 4);
        assertNotEquals(calculator.dividir(3, 2), 4);
        try{assertNotEquals(calculator.dividir(6, 0), 3);}catch (ArithmeticException e){System.out.println(e);}
    }
    @Test(expected = ArithmeticException.class)
    public void dividirExceptionTest(){
        calculator.dividir(1,0);
    }

    /*@Test
    public void raizCuadraticaTest(){
        assertEquals(calculator.raizCuadratica(1,2,-8),-4,2);
        assertNotEquals(calculator.raizCuadratica(1,2,-8),-45,25); //Los 2 resultados tienen que ser diferentes
        assertNotEquals(calculator.raizCuadratica(0,2,-8),-45,25);
        assertNotEquals(calculator.raizCuadratica(1,0,-8),-45,25);

    }

    @Test
    public void raizCuadraticaTestFail(){
        assertNotEquals(calculator.raizCuadratica(1,2,-8),-45,25); //Los 2 resultados tienen que ser diferentes
        assertNotEquals(calculator.raizCuadratica(0,2,-8),-45,25);
        assertNotEquals(calculator.raizCuadratica(1,0,-8),-45,25);

    }*/
    @Test
    public void raizCuadraticaTest(){
        double[] response;
        assertEquals(calculator.raizCuadratica(1,2,-8),new double[] rta,new double[1]);
    }
}

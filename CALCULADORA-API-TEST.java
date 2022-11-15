package apiCalculadora.apiCalculadora;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
//import ApiCalculadoraApplication.ApiCalculadoraApplication;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ApiCalculadoraApplicationTests {

	ApiCalculadoraApplication calculator = new ApiCalculadoraApplication();

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
	}
	@Test
	public void dividirException() {
		Assertions.assertThrows(ArithmeticException.class,()->{
				calculator.dividir(1,0);
		});

	}

	@Test
	public void raizCuadraticaTest(){
		assertArrayEquals(calculator.cuadratica(1,2,-8),new double[]{2,-4});
	}
	@Test
	public void raizCuadraticaTestFail(){
		assertNotEquals(calculator.cuadratica(1,2,80),new double[]{2,-4});
	}
	@Test
	public void raizCuadraticaException(){
		Assertions.assertThrows(ArithmeticException.class,()->{
			calculator.cuadratica(1,0,-8); // sí b vale 0
			calculator.cuadratica(0,2,-8); // sí a vale 0
		});
	}

	 
}

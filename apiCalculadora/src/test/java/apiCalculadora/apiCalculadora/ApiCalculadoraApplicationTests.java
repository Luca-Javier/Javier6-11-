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
		assertNotEquals(calculator.sumar(4,1),3);
	}

	@Test
	public void restarTest() {
		assertEquals(calculator.restar(5, 2), 3);
		assertNotEquals(calculator.restar(3,1),3);
	}

	@Test
	public void multiplicarTest() {
		assertEquals(calculator.multiplicar(5, 2), 10);
		assertNotEquals(calculator.multiplicar(4,1),3);
	}

	@Test
	public void dividirTest() {
		assertEquals(calculator.dividir(6, 2), 3);
		assertNotEquals(calculator.dividir(6, 2), 4);
		assertNotEquals(calculator.dividir(3, 2), 4);
	}
	@Test
	public void dividirException() {
		Assertions.assertThrows(ArithmeticException.class,()->{
				calculator.dividir(1,0);
		});

	}
	/*
	@Test
	public void raizCuadraticaTest(){
		assertEquals(calculator.cuadratica(1,2,-8),);
		assertNotEquals(calculator.cuadratica(1,2,-8),-45,25); //Los 2 resultados tienen que ser diferentes
		assertNotEquals(calculator.cuadratica(0,2,-8),-45,25);
		assertNotEquals(calculator.cuadratica(1,0,-8),-45,25);

	}
	*/
	 
}

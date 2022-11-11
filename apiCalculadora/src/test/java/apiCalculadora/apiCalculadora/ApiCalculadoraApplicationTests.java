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

	ApiCalculadoraApplication calc = new ApiCalculadoraApplication();
	@Test
	void contextLoads() {
	}

	@Test
	void sumar() {

		assertEquals(calc.sumar(1,2),3);
		assertNotEquals(calc.sumar(1,2),4);
	}
	@Test //(expected = ArithmeticException.class)
	public void shouldThrowException() {
		Assertions.assertThrows(ArithmeticException.class,()->{
				calc.dividir(1,0);
		});

	}
}

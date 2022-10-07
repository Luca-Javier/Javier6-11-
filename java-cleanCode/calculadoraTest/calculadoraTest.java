package calculadoraTest;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import calculadoraa.calculadora;

public class calculadoraTest {

  calculadora calculator = new calculadora();

  @Test
  public void sumaTest() {
    assertEquals(calculator.suma(1, 2), 3);
  }
}

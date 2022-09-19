// import junit.framework.TestCase;

public class calculadora {
  int numero1;
  int numero2;

  /*
   * public static void main(String[] args) {
   * }
   */

  public calculadora(int numero1, int numero2) {
    this.numero1 = numero1;
    this.numero2 = numero2;
  }

  public int sumar() {
    return this.numero1 + this.numero1;
  }
  public int restar() {
    return this.numero1 - this.numero1;
  }
  public int dividir() {
    return this.numero1 / this.numero1;
  }
}

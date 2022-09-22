import java.util.Scanner;

public class Calculadora {
  int numero1;
  int numero2;
  Scanner inputTeclado = new Scanner(System.in);

  public Calculadora() {
  }

  public void preguntarNumeros() {
    System.out.println("Numero 1: ");
    this.numero1 = Integer.parseInt(inputTeclado.nextLine());
    System.out.println("Numero 2: ");
    this.numero2 = Integer.parseInt(inputTeclado.nextLine());
  }

  public void preguntarOperacion() {
    System.out.println("Qué operacion deseas realizar? (sumar, restar, dividir)");
    String operacionSelected = inputTeclado.nextLine();

    switch (operacionSelected) {
      case "sumar":
        System.out.println("El resultado es: " + Integer.toString(sumar()));
        break;
      case "restar":
        System.out.println("El resultado es: " + Integer.toString(restar()));
        break;
      case "dividir":
        System.out.println("El resultado es: " + Integer.toString(dividir()));
        break;
      default:
        System.out.println("Ingrese una operación válida");
        preguntarOperacion();
        break;
    }
    inputTeclado.close();
  }

  public int sumar() {
    return this.numero1 + this.numero2;
  }

  public int restar() {
    return this.numero1 - this.numero2;
  }

  public int dividir() {
    return this.numero1 / this.numero2;
  }
}

import java.util.Scanner;

public class holaMundo {
  public static void main(String[] args) {
    System.out.println("Hola mundo");
    Scanner inputTeclado = new Scanner(System.in);
    System.out.println("Numero 1: ");
    int numero1 = Integer.parseInt(inputTeclado.nextLine());
    System.out.println("Numero 2: ");
    int numero2 = Integer.parseInt(inputTeclado.nextLine());

    calculadora calculadora = new calculadora(numero1, numero2);

    int resultado = calculadora.sumar();

    System.out.println("El resultado es"+Integer.toString(resultado));

    inputTeclado.close();
  }
}
import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero = 0;
		System.out.println("Introduzca un n�mero: ");
		numero = sc.nextInt();

		System.out.println("El cuadrado de " + numero + " es " + numero*numero);

	}
}

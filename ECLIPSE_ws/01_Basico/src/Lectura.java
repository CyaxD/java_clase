import java.util.Scanner;

public class Lectura {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		System.out.println("Introduzca un n�mero: ");
		//leer numero
		numero = sc.nextInt();
		//Aqu� el programa se quedar� parado a la espera de que el usuario introduzca el n�mero y pulse enter
		
		for(int i=1; i<=numero; i++) {
			System.out.println(i);
		}
		sc.close();
	}

}

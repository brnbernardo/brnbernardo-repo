import java.util.Arrays;
import java.util.Scanner;

public class Identificador {

	public static void main(String[] args) {

		String malha[][] = new String[10][10];

		Coordenada coordenada = new Coordenada(geraAleatorio(), geraAleatorio());
		/*Coordenada b = new Coordenada(geraAleatorio(), geraAleatorio());
		Coordenada c = new Coordenada(geraAleatorio(), geraAleatorio());*/

		boolean retorno = true;
		int count = 0;
		int eixoX;
		int eixoY;
		Scanner in = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			do {

				System.out.println("Digite o eixo x: ");
				eixoX = in.nextInt();
				
				System.out.println("Digite o eixo y: ");
				eixoY = in.nextInt();
				
				retorno = coordenada.encontraTripulante(malha, eixoX, eixoY);
				count++;
				
				mostraMapa(coordenada.getMapa());
				
			} while (!retorno);
				coordenada.setX(geraAleatorio());
				coordenada.setY(geraAleatorio());
		}
		
		System.out.println("Todos os tripulantes foram encontrados com " + count + " sinalizadores!");


	}

	private static void mostraMapa(String[][] malha) {

		System.out.format("     ");
		for (int i = 0; i < malha.length; i++) {
			System.out.format("%3d",i+1);
		}
		System.out.println();
		System.out.println("-------------------------------------------------------------");
		
		for (int i = 0; i < malha.length; i++) {
			System.out.format("%3da - ", (i + 1));
			for (int j = 0; j < malha.length; j++) {
				malha[j][i] = malha[j][i] == null ? " " : malha[j][i];
				System.out.format("%-1.8s  ",malha[j][i] );
				//System.out.format("%-1.8s  ", "x");
			}

			System.out.println();
		}
	}

	private static int geraAleatorio() {
		int numero = 1 + (int) (Math.random() * 10);
		int aleatorio = Math.round(numero);
		return aleatorio;
	}

}

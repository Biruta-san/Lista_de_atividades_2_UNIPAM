import java.util.Scanner;

public class PrincipalArray {
	public static void main(String[] args) {
		
		//declarar array da classe principal e instanciar scanner
		int[] array = new int[5];
		Scanner input = new Scanner(System.in);
		
		//instanciar objeto
		CalculoArray calcArr = new CalculoArray();
		
		//uso do setArray
		System.out.println("A seguir digite os valores do arraay: ");
		for(int i = 0;i<array.length; i++) {
			System.out.printf("Digite o  %d° numero\n", i+1);
			array[i] = input.nextInt();
		}
		calcArr.setArray(array);
		
		//limpar buffer
		input.nextLine();
		
		//imprimir array
		calcArr.imprimeArray();
		System.out.println();
		
		//imprimir soma do array
		calcArr.somaArray();
		System.out.println();
		
		//imprimir media do array
		calcArr.mediaArray();
		System.out.println();
		
		//Matriz
		
		int[][] matriz = new int[3][3];
		
		System.out.println("A seguir digite os valores da matriz: ");
		for(int i = 0;i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.printf("Digite valor da linha %d e coluna %d\n", i+1, j+1);
				matriz[i][j] = input.nextInt();
			}
		}
		
		calcArr.imprimeMatriz(matriz);
	}
}

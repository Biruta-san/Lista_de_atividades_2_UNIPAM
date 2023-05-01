import java.util.Scanner;

public class SobrecargaMetodos {
	
	public static void imprimeValor(int[] _arrayDeInteiros){
		System.out.println("Imprimindo array de inteiros...");
		for(int i = 0; i < _arrayDeInteiros.length; i++) {
			System.out.println(_arrayDeInteiros[i]);
		}
	}
	
	public static void imprimeValor(double[] _arrayDeDouble){
		System.out.println("Imprimindo array de double...");
		for(int i = 0; i < _arrayDeDouble.length; i++) {
			System.out.println(_arrayDeDouble[i]);
		}
	}
	
	public static void imprimeValor(String[] _arrayDeString){
		System.out.println("Imprimindo array de Strings...");
		for(int i = 0; i < _arrayDeString.length; i++) {
			System.out.println(_arrayDeString[i]);
		}
	}
	
	public static void main(String[] args) {
		
        	Scanner input = new Scanner(System.in);
	    
        	        	
        	int[] arrayDeInteiros = new int[5];
		double[] arrayDeDouble = new double[5];
		String[] arrayDeString = new String[3];
		
		System.out.println("Digite numeros inteiros:");
		for(int i = 0; i<arrayDeInteiros.length; i++){
                    System.out.printf("Digite o %d numero:\n", i+1);
                    arrayDeInteiros[i] = input.nextInt();
		}
		
		System.out.println("Digite numeros decimais:");
		for(int i = 0; i<arrayDeDouble.length; i++){
                    System.out.printf("Digite o %d numero:\n", i+1);
                    arrayDeDouble[i] = input.nextDouble();
		}
		
		System.out.println("Digite palavras:");
		for(int i = 0; i<arrayDeString.length; i++){
                  input.nextLine();              
		    System.out.printf("Digite a %d palavra:\n", i+1);
                    arrayDeString[i] = input.nextLine();
		}
		
		imprimeValor(arrayDeInteiros);
		System.out.println();
		imprimeValor(arrayDeDouble);
		System.out.println();
		imprimeValor(arrayDeString);
		System.out.println();
		
	}
}

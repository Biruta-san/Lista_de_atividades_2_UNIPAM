public class CalculoArray {
	
	private int[] array;
	private int[][] matriz;
	
	public CalculoArray(){
		array = new int[5];
	}
	
	public CalculoArray(int[] _array){
		this.array = _array;
	}
	
	public void setArray(int[] _array) {
		this.array = _array;
	}
	
	public int[] getArray() {
		return array;
	}
	
	public void imprimeArray(){
		System.out.printf("Valores do Array: ");
		for(int i = 0; i < array.length; i++){
			System.out.printf("%d ", array[i]);
		}
		
	}
	
	public void somaArray(){
		int soma = 0;
		for(int i = 0; i <array.length;i++){
			soma += array[i];
		}
		System.out.println("A soma dos numeros contidos no array é: " + soma);;
	}
	
	public void mediaArray(){
		int soma = 0;
		for(int i = 0; i <array.length;i++){
			soma += array[i];
		}
		System.out.printf("A média dos numeros do array é: %d",(soma/array.length));		
	}
	
	public void imprimeMatriz(int[][] _matriz){
		matriz = _matriz;
		System.out.println("***Impressão da matriz***");
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				System.out.printf("%d ", matriz[i][j]);
			}
			System.out.println();
		}
		
	}
	
	
}

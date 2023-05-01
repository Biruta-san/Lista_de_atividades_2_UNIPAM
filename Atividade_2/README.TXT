2- Crie um programa que receberá do usuário 5 números inteiros respeitando as seguintes orientações:
Você deve criar DUAS classes, a “CalculoArray” e “PrincipalArray”;
Crie na classe CalculoArray:
Um array de inteiros privado //private int[] array;
Dois construtores que vão criar 5 posições para o array; //Ex.: public CalculoArray(int[] array){...}
Os métodos get e set do array criado; //Ex.: public int[] getArray(){...} e public void setArray(int[] array){...} 
Um método para imprimir os dados do array; //public void imprimeArray(){...}
Um método que vai imprimir o resultado da soma dos valores do array; //public void somaArray(){...}
Um método que vai imprimir a média dos valores do array; //public void mediaArray(){...}
Agora, na classe PrincipalArray, você deve armazenar em um array 5 números inteiros digitados pelo usuário;
Crie um objeto da classe CalculoArray; //Ex.: CalculoArray objArray = new CalculoArray();
Passe o array com os números digitados como parâmetro através do objeto da classe CalculoArray, use o método setArray();
Imprima os dados do vetor através do objeto da classe CalculoArray, use o método imprimeArray();
Imprima o resultado da soma dos valores do array através do objeto da classe CalculoArray, use o método somaArray();
Imprima o resultado da média dos valores do array através do objeto da classe CalculoArray, use o método médiaArray();
Agora, na classe PrincipalArray, crie uma matriz com os seguintes números inteiros:
{{1,2,3},{4,5,6},{7,8,9}}
Crie na classe CalculoArray um método que vai imprimir os dados de qualquer matriz, que será passada por parâmetro; 
//Ex.: public void imprimeMatriz(int[][] matriz){...}
Imprima os valores da matriz criada acima através do objeto da classe CalculoArray, use o método imprimeMatriz();
//Ex.: objArray.imprimeMatriz(matriz);
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


3- Baseados nos conceitos sobre sobrecarga de métodos, faça as seguintes atividades.
Crie uma classe chamada SobrecargaMetodos;
Crie nesta classe o método principal, que será o responsável por chamar os outros métodos;
Implemente nesta classe os TRÊS métodos abaixo, e realize a sobrecarga chamando os métodos através do método principal.
public void imprimeValor(int[] arrayInt){...}
public void imprimeValor(double[] arrayDouble){...}
public void imprimeValor(String[] arrayString){...}



4- Crie DUAS novas classes, a primeira chamada “Principal” e a segunda chamada “Pessoa”.
Crie na classe Pessoa:
Os atributos nome (String), idade (int) e cpf (String);
Crie os métodos gets e set para cada um dos atributos;
Crie no mínimo dois construtores, usando a técnica de sobrecarga de construtores;
Crie o método toString; //Ex.: public String toString(){...}
Agora na classe “Principal” crie UM array com DUAS posições (objetos) do tipo “Pessoa”, e através da classe Scanner() receba do usuário e passe por parâmetro para os devidos métodos da classe “Pessoa” os valores dos atributos: nome, idade e cpf;
Após armazenar os dados digitados pelo usuário, chame o método toString usando os dois objetos criados. Com isso, as informações armazenadas devem ser exibidas na tela.
Ainda na classe Pessoa, use os dois objetos criados (array) e os métodos gets para:
Imprimir o tamanho dos nomes cadastrados em cada objeto do array, use o método length();
Verificar se os nomes cadastrados em cada objeto do array são iguais, use o método equals();
Imprimir a String resultante da concatenação entre os nomes dos dois objetos cadastrados, use o método concat();
Verifique se existe a ocorrência da substring “100” e em qual índice ela inicia nos CPFs dos dois objetos cadastrados, use o método indexOf

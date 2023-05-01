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

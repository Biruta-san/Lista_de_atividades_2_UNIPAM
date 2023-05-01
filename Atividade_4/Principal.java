import java.util.Scanner;

public class Principal {
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Pessoa[] arrayPessoa = new Pessoa[2];
        
        System.out.println("A seguir digite os dados de duas pessoas...");
        
        for (int i = 0;i<arrayPessoa.length; i++){
            
            arrayPessoa[i] = new Pessoa();
            
            input.nextLine();
            System.out.printf("Digite o nome da %d° pessoa\n",i+1);
            arrayPessoa[i].setNome(input.nextLine());
            
            //limpar buffer
            input.nextLine();
            System.out.printf("Digite a Idade da %d° pessoa\n",i+1);
            arrayPessoa[i].setIdade(input.nextInt());
            
            //limpar buffer
            input.nextLine();
            System.out.printf("Digite o CPF da %d° pessoa\n",i+1);
            arrayPessoa[i].setCpf(input.nextLine());
            

        }
    
        for (int i = 0;i<arrayPessoa.length; i++){
            System.out.println(arrayPessoa[i].toString());
        }
        
        for (int i = 0;i<arrayPessoa.length; i++){
            arrayPessoa[i].tamanhoNome(arrayPessoa[i].getNome());
        }
                
        arrayPessoa[0].verificaIgualdade(arrayPessoa[0].getNome(), arrayPessoa[1].getNome());
        arrayPessoa[0].concatenar(arrayPessoa[0].getNome(), arrayPessoa[1].getNome());
        
        /*for (int i = 0;i<arrayPessoa.length; i++){
            arrayPessoa[i].indexOF(arrayPessoa[i].getCpf(), arrayPessoa[i].getNome());
        }*/
        
        
        for(int i = 0; i<(arrayPessoa.length);i++){
            if(arrayPessoa[i].indexar(arrayPessoa[i].getCpf())== -1){
                        System.out.printf("100 não encontrado no cpf %s", arrayPessoa[i].getCpf());
            }else{
                    System.out.printf("100 encontrado no indice %d do cpf %s\n", arrayPessoa[i].indexar(arrayPessoa[i].getCpf()),arrayPessoa[i].getCpf());
            }
                 
        }
        
    }
    
}

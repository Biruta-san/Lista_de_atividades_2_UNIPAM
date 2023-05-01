public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;
    
    public Pessoa(){
        this("", 0, "");
    }
    
    public Pessoa(int _idade){
        this("", _idade, "");
    }
    
    public Pessoa(String _nome, int _idade, String _cpf){
        this.nome = _nome;
        this.idade = _idade;
        this.cpf = _cpf;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String getNome() {
        return nome;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public String getCpf() {
        return cpf;
    }
    
    public String toString(){
        return String.format("Nome: %s, \nIdade: %d, \nCPF: %s\n", this.nome, this.idade, this.cpf);
    }
    
    public void tamanhoNome(String _nome){
        System.out.printf("A contagem de caracteres em %s é de: %d\n", _nome, _nome.length());
    }
    
    public void verificaIgualdade(String nome1, String nome2){
        boolean iguais = nome1.equals(nome2);
        if(iguais){
            System.out.printf("Os nomes %s e %s são iguais\n", nome1, nome2);
        } else {
            System.out.printf("Os nomes %s e %s não são iguais\n", nome1, nome2);
        }
    }
    
    public void concatenar(String nome1, String nome2){
        System.out.println("Junção/concatenação dos nomes: " + nome1.concat(nome2));
    }
        
    /*public void indexOF(String _nome, String _cpf){
        System.out.printf("A string 100 se encontra na posição %d do cpf de %s\n", _cpf.indexOf("100"), _nome);
        
    }*/
    
    public int indexar(String _cpf){
        for(int j = 0;j<(_cpf.length()-2);j++) {
            if(Integer.parseInt(Character.toString(_cpf.charAt(j))) == 1 
                && Integer.parseInt(Character.toString(_cpf.charAt(j+1))) == 0 
                && Integer.parseInt(Character.toString(_cpf.charAt(j+2))) == 0)
            {
                return j;
            } 
        }
        return -1;
    }
    
}

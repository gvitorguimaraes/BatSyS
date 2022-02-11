public class Pessoa {
    protected String nome;
    protected int idade;
    protected String cidadeNascimento;

    public Pessoa(String nome, int idade, String cidadeNascimento){
        this.nome = nome;
        this.idade = idade;
        this.cidadeNascimento = cidadeNascimento;
    }

    public Pessoa(String nome){
        this.nome = nome;
        idade = 0;
        cidadeNascimento = "";
    }

    public Pessoa(){
    }
}

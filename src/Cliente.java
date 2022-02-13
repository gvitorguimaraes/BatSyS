public class Cliente extends Pessoa{
    
    private int id;
    private String endereco;

    public Cliente(int id, String endereco, String nome, int ano, String cpf){
        this.id = id;
        this.endereco = endereco;
        this.nome = nome;
        this.anoNascimento= ano;
        this.cpf = cpf;        

    }
    
    public Cliente(int id){
        this.id = id;
    }

    public Cliente(){

    }

    // Getters and Setters
    public int getID(){
        return id;
    }
    public void setID(int id){
        this.id = id;
    }

    public String getEndereco(){
        return endereco;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
}

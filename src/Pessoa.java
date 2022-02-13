import java.time.LocalDate;

public class Pessoa {
    
    protected String nome;
    protected int anoNascimento;
    protected String cpf;

    public Pessoa(String nome, int ano, String cpf){
        this.nome = nome;
        this.anoNascimento = ano;
        this.cpf = cpf;
    }

    public Pessoa(String nome){
        this.nome = nome;     
    }

    public Pessoa(){
    }

    // Getters and Setters
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getAnoNascimento(){
        return anoNascimento;
    }
    public void setAnoNascimento(int ano){
        this.anoNascimento = ano;
    }

    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
}

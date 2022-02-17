package models;

import java.time.LocalDate;

import enums.*;

public class Os{
    
    private Cliente cliente;
    private String descricao;
    private LocalDate dataCriacao;
    private LocalDate dataEntrega;
    private Pagamento formaPagamento;
    private StatusOS status;
    private Setor setor;
    
    public Os(Cliente cliente, String descricao, /**LocalDate dataEntrega*/ Pagamento formaPagamento, Setor setor){
        this.cliente = cliente;
        this.descricao = descricao;
        dataCriacao = LocalDate.now();
        //this.dataEntrega = dataEntrega;               **FALTA IMPLEMENTAR A DATA DE ENTREGA
        this.formaPagamento = formaPagamento;
        this.setor = setor;
    }

    public Os(){

    }

    // Getters and Setters
    public Cliente getCliente(){
        return cliente;
    }
    public void setClient(Cliente cliente){
        this.cliente = cliente;
    }

    public String getDescricao(){
        return descricao;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public LocalDate getDataCriacao(){
        return dataCriacao;
    }

    public LocalDate getDataEntrega(){
        return dataEntrega;
    }
    public void setDataEntrega(LocalDate dataEntrega){
        this.dataEntrega = dataEntrega;
    }

    public Pagamento getPagamento(){
        return formaPagamento;
    }
    public void setPagamento(Pagamento formaPagamento){
        this.formaPagamento = formaPagamento;
    }

    public StatusOS getStatus(){
        return status;
    }
    public void setStatus(StatusOS staus){
        this.status = status;
    }

    public Setor getSetor(){
        return setor;
    }
    public void setSetor(Setor setor){
        this.setor = setor;
    }

    
}
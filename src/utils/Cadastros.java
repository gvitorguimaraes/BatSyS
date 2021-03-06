package utils;

import models.*;
import enums.*;

import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public class Cadastros {

    static Scanner input = new Scanner(System.in);  
    /**
     * Método que cadastra um novo cliente em um array
     * @param clientes
     */

    public static void cadastraCliente(int c_clientes, ArrayList<Cliente> clientes){
        Cliente aux = new Cliente(c_clientes);
        System.out.print(" > Nome do cliente: ");
        aux.setNome(input.nextLine());
        System.out.print(" > Endereço: ");
        aux.setEndereco(input.nextLine());
        System.out.print(" > Ano de nascimento: ");
        aux.setAnoNascimento(input.nextInt());
        input.nextLine();
        System.out.print(" > CPF: ");
        aux.setCpf(input.nextLine());
        clientes.add(aux);
    }
    
    /**
     * Método para cadrastrar uma nova O.S em um HashMap
     * @param clientes
     */
    
    public static void cadastraOS(Integer c_os, ArrayList<Cliente> clientes, HashMap<Integer,Os> ordensDeServico){
        System.out.println(" ----------------------------------------");
        System.out.println("        CADASTRO DE ORDEM DE SERVICO ");
        System.out.println(" ----------------------------------------");

        /**
         * Lista todos os clientes dentro do array
         */
        System.out.println("----------------------------------------");
        System.out.println(" Clientes =>\n");

        for(int i = 0; i < clientes.size(); i++)
            System.out.println(" "+clientes.get(i).getID()+" | "+clientes.get(i).getNome());
        
        /**
         * Registra os parametros fornecidos pelo usuário
         */
        System.out.println("----------------------------------------");
        Os temp = new Os();
        
        System.out.print("\n > Para começar informe o ID do cliente: ");
        temp.setClient(clientes.get(input.nextInt()-1));                      // VERIFICAR EXCESSOES - PASSIVEL DE ERRO
        input.nextLine();

        System.out.print(" > Descrição do serviço: ");
        temp.setDescricao(input.nextLine());
        
        System.out.println("\n (1) Dinheiro \n (2) Cartão \n (3) Pix \n (4) Outros");
        System.out.print(" > Forma de pagamento: ");
        int _pagamento = input.nextInt();
        switch(_pagamento){
            case 1:
                temp.setPagamento(Pagamento.DINHEIRO);
                break;
            case 2:
                temp.setPagamento(Pagamento.CARTAO);
                break;
            case 3:
                temp.setPagamento(Pagamento.PIX);
                break;
            case 4:
                temp.setPagamento(Pagamento.OUTROS);
                break;
        }
        input.nextLine();

        System.out.println("\n (1) Manutenção \n (2) Suporte \n (3) Financeiro \n (4) Comercial");
        System.out.print(" > Setor: ");
        int _setor = input.nextInt();
        switch(_setor){
            case 1:
                temp.setSetor(Setor.MANUTENCAO);
                break;
            case 2:
                temp.setSetor(Setor.SUPORTE);
                break;
            case 3:
                temp.setSetor(Setor.FINANCEIRO);
                break;
            case 4:
                temp.setSetor(Setor.COMERCIAL);
                break;
        }
        /**
         * Insere a O.S criada no hashmap
         */
        ordensDeServico.put(c_os, temp);
        c_os++;
    }
}

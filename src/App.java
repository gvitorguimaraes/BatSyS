/**
 * BatSyS - Mini sistema para gerenciamento de Ordens de Serviço - Versão 1.2
 * Autor: Gabriel Guimarães - 2022
 * 
 * Sistema criado com objetivo de praticar os conceitos de Estrutura de dados e POO.
 */
import models.*;
import utils.*;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    static Scanner input = new Scanner(System.in);
    /**
     *                      MAIN
     * @param args
     * @throws Exception
     */
    public static void main(String[] args){
        HashMap<Integer,Os> ordensDeServico = new HashMap<>();
        ArrayList<Cliente> clientes = new ArrayList<>();
        int op;
        Integer c_os = 1;
        int c_clientes = 1;

        System.out.println(" ========================================");
        System.out.println("        BatSyS - Gerenciador de O.S      ");
        System.out.println(" ========================================");
        
        do{
            System.out.println("\n----------------------------------------");
            System.out.println("                - MENU -");
            System.out.println(" ----------------------------------------");
            System.out.println(" [1] Cadastrar nova OS");
            System.out.println(" [2] Consultar O.S");
            System.out.println(" [3] Cadastrar novo cliente");
            System.out.println(" [4] Consultar clientes");
            System.out.println(" [5] Sair");
            System.out.print("\n >> ");
            op = input.nextInt();
            if(op > 5){
                System.out.println("\n ERRO! Selecione uma opção válida! ");
            }
            else if(op == 1){
                if(c_clientes == 1){
                    System.out.println("\n Não existem clientes cadastrados!!\n Cadastre ao menos um para criar uma O.S.");
                }else{
                    Cadastros.cadastraOS(c_os, clientes, ordensDeServico);
                    c_os++;
                    System.out.println("\n    - O.S cadastrada com sucesso! -");
                }
            }
            else if(op == 2){
                Imprime.listaOS(ordensDeServico);
                System.out.print("Informe o numero da O.S: \n >> ");        // Apresenta um erro caso o numero de O.S cadastradas seja zero.
                Integer x = input.nextInt();
                Imprime.printOS(x, ordensDeServico.get(x));
            }
            else if(op == 3){
                Cadastros.cadastraCliente(c_clientes, clientes);
                c_clientes++;
                System.out.println("\n    - Cliente cadastrado com sucesso! -");
            }
            else if(op == 4){
                Imprime.listaClientes(clientes);
            }
        }while(op != 5);

        input.close();
    }
}

package utils;

import models.*;

import java.util.ArrayList;
import java.util.HashMap;

public class Imprime {
    /**
     * Imprime de forma simplificada uma O.S 
     * @param numOS
     * @param os
     */
    public static void printOS(int numOS, Os os){
        System.out.println(" ----------------------------------------");
        System.out.println("    OS: "+numOS+" | Cliente: "+os.getCliente().getNome());
        System.out.println("\n    - Descrição: "+os.getDescricao());
        System.out.println("    - Pagamento: "+os.getPagamento());
        System.out.println("    - Setor responsável: "+os.getSetor());
        System.out.println(" ----------------------------------------");
    }

    public static void listaOS(HashMap<Integer, Os> ordensDeServico){
        if(ordensDeServico.isEmpty()){
            System.out.println(" Nenhuma O.S cadastrada!");
        }else{
            for(int i = 1; i <= ordensDeServico.size(); i++){
                System.out.println(" "+(i)+" | Cliente: "+ordensDeServico.get(i).getCliente().getNome());
            }
        }
    }

    public static void listaClientes(ArrayList<Cliente> clientes){
        if(clientes.isEmpty()){
            System.out.println(" Nenhum cliente cadastrado!");
        }else{
            System.out.println(" ----------------------------------------");
            for(int i = 0; i < clientes.size(); i++){
                System.out.println(" "+(i+1)+" | Cliente: "+clientes.get(i).getNome());
            }
            System.out.println(" ----------------------------------------\n");
        }
    }
}

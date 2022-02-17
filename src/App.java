/**
 * BatSyS - Mini sistema para gerenciamento de Ordens de Serviço - Versão 1.1
 * Autor: Gabriel Guimarães - 2022
 * 
 * Sistema criado com objetivo de praticar os conceitos de Estrutura de dados e POO.
 */
import enums.*;
import models.*;
import utils.*;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    static Scanner input = new Scanner(System.in);
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
    /**
     *                      MAIN
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        HashMap<Integer,Os> ordensDeServico = new HashMap<>();
        ArrayList<Cliente> listaClientes = new ArrayList<>();

        System.out.println(" ========================================");
        System.out.println("        BatSyS - Gerenciador de O.S ");
        System.out.println(" ========================================\n");

        Cadastros.cadastraOS(listaClientes, ordensDeServico);
        printOS(1, ordensDeServico.get(1));

        input.close();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primeiralistasimples;

import lista.Cliente;
import lista.Lista;

/**
 *
 * @author Léo
 */

public class PrimeiraListaSimples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista listaClientes = new Lista();
        Cliente c = new Cliente(221, "Produtos excelentes LTDA", "Rua sem fim, 200", 5000.0);
        
        // inserindo elementos na lista ligada
        
        listaClientes.insereInicio(c);
        listaClientes.imprimeLista();
        listaClientes.insereInicio(new Cliente(185,"Negócios Importantes SA", "Avenida Principal, 10", 12000.0));
        listaClientes.imprimeLista();
        listaClientes.insereInicio(new Cliente(443,"Parceiros Críticos LTDA", "Rua Dos Negócios, 2000", 7000.0));
        listaClientes.imprimeLista();
        
        //busca do elemento na posição 2 da lista
        
        c = (Cliente) listaClientes.buscaElemento(2);
        if (c != null) {
            System.out.println("Elemento da posicao 2 da Lista Ligada: " + c);
        }
        
        // removendo um elemento da lista ligada (necessário type casting para a classe Cliente
        
        Cliente clienteRemovido = (Cliente) listaClientes.removeInicio();
        System.out.println("Elemento removido da Lista Ligada: " + c);
        listaClientes.imprimeLista();
        
        // liberando toda lista
        
        System.out.println("Liberando toda a lista");
        listaClientes.LiberaLista();
        listaClientes.imprimeLista();
    }
}

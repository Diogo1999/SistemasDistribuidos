/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.util.ArrayList;

/**
 *
 * @author Diogo
 */
//classe para fazer o registo dos utilizadores
public class ListaClientes {
    ArrayList<clienteDados> ListaClientes;
    
    
    public ListaClientes(){
    ListaClientes = new ArrayList <clienteDados>();
    
    }

    public ArrayList<clienteDados> getListaClientes() {
        return ListaClientes;
    }

    public void setListaClientes(ArrayList<clienteDados> ListaClientes) {
        this.ListaClientes = ListaClientes;
    }
    
    public void adicionarCliente(clienteDados cliente){
    
    ListaClientes.add(cliente);
    }
    
    public void removerCliente(clienteDados cliente){
    
    ListaClientes.remove(cliente);
    }
    
    
    
    
    
}

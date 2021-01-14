/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import Backend.ListaClientes;
import java.util.ArrayList;


/**
 *
 * @author Diogo
 */
public class Pedidos extends UnicastRemoteObject implements PedidosInterface{
    String ano;
    ListaClientes listaC;
    
    public Pedidos() throws RemoteException {
		super();
	}

    @Override
    public String enviaConvite(String ano) throws RemoteException {
        this.ano = ano;
        return ano;
    }

    @Override
    public ListaClientes getListaCliente() throws RemoteException {
       return listaC;
    }

   
    
    

  

    

    

   

    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Diogo
 */
public class Pedidos extends UnicastRemoteObject implements PedidosInterface{
    String ano;
    
    public Pedidos() throws RemoteException {
		super();
	}

    @Override
    public String enviaConvite(String ano) throws RemoteException {
        this.ano = ano;
        return ano;
    }

  

    

    

   

    
    
}

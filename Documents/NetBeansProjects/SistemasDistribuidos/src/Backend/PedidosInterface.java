/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;


/**
 *
 * @author diogo
 */
public interface PedidosInterface extends Remote {
    
    
    String enviaConvite(String ano) throws RemoteException;
    
    public ListaClientes getListaCliente() throws RemoteException;
    
    
    
}

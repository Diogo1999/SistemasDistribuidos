/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 *
 * @author diogo
 */
public interface PedidosInterface extends Remote {
    
    String enviaConvite(String ano) throws RemoteException;
    
    
}

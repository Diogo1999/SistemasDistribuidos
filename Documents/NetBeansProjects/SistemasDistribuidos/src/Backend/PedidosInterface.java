/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 *
 * @author diogo
 */
public interface PedidosInterface extends Remote {
    
    public int enviaConvite() throws RemoteException;
    public void aceitaConvite() throws RemoteException;
    public void login() throws RemoteException;
    
}

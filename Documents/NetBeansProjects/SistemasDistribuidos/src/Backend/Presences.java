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
public class Presences extends UnicastRemoteObject implements PedidosInterface{
    
    
    public Presences() throws RemoteException {
		super();
	}

    @Override
    public int enviaConvite() throws RemoteException {
        
        return  1 ;//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void aceitaConvite() throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void login() throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

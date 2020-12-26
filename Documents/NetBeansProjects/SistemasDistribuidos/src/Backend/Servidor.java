/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;
import java.lang.SecurityManager;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 *
 * @author diogo
 */
public class Servidor {
    
    String SERVICE_NAME = "/PresencesRemote";
    private void bindRMI() throws RemoteException{
    System.getProperties().put("java.security.policy", "./server.policy");
    
    if (System.getSecurityManager() == null) {
      System.setSecurityManager(new SecurityManager());
    }
    
     try {
      LocateRegistry.createRegistry(1099); //é utilizado para criar um registo de objeto remoto que aceita chamadas na porta 1099.

    } catch (RemoteException e) {

    }
     
    try {
      LocateRegistry.getRegistry("127.0.0.1",1099).rebind(SERVICE_NAME,); //o servidor regista o objeto remoto no registry.
    } catch (RemoteException e) {
      System.out.println("Registry not found");
    }

    
    
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        
        
        
        
        }
    }
    
}

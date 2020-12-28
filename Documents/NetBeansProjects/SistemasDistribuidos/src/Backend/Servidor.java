/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;
import java.lang.SecurityManager;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 *
 * @author diogo
 */
public class Servidor {
    
    String SERVICE_NAME="/PresencesRemote";

		private void bindRMI(Presences presences) throws RemoteException {
			
			System.getProperties().put( "java.security.policy", "C:\\Users\\Diogo\\Documents\\NetBeansProjects\\SistemasDistribuidos\\Documents\\NetBeansProjects\\SistemasDistribuidos\\src\\Backend\\server.policy");

			if( System.getSecurityManager() == null) {
				System.setSecurityManager(new SecurityManager());
			}

			try { 
				LocateRegistry.createRegistry(1099);
			} catch( RemoteException e) {
				
			}
			try {
			LocateRegistry.getRegistry("127.0.0.1",1099).rebind(SERVICE_NAME, presences);
                        
			} catch( RemoteException e) {
				System.out.println("Registry not found" + e);
			}
		}

	public Servidor() {
		super();
	}

        public void createPresences() {
		
		Presences presences = null;
		try {
			presences = new Presences();
		} catch (RemoteException e1) {
			System.err.println("unexpected error...");
			e1.printStackTrace();
		}
		
		try {
			bindRMI(presences);
		} catch (RemoteException e1) {
			System.err.println("erro ao registar o stub...");
			e1.printStackTrace();
		}
		
	}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
       Servidor s = new Servidor();
       s.createPresences();
        
        
        
        
        
        
        }
    }
    


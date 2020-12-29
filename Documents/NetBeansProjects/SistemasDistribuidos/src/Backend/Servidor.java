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


public class Servidor {
    
    static int DEFAULT_PORT = 8080;
    //static Pedido pedido;
    static Presences pedidos = null;
    
    String SERVICE_NAME="/PresencesRemote";
    
    static PedidosInterface stub;
    
		private void bindRMI(Presences pedidos) throws RemoteException {
			
			System.getProperties().put( "java.security.policy", "C:\\Users\\diana\\Documents\\NetBeansProjects\\SistemasDistribuidos\\Documents\\NetBeansProjects\\SistemasDistribuidos\\src\\Backend\\server.policy");
                        

			if( System.getSecurityManager() == null) {
				System.setSecurityManager(new SecurityManager());
			}

			try { 
				LocateRegistry.createRegistry(1099);
			} catch( RemoteException e) {
				
			}
			try {
			LocateRegistry.getRegistry("127.0.0.1",1099).rebind(SERVICE_NAME, pedidos);
                        
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
     int port = DEFAULT_PORT;
       Servidor s = new Servidor();
       s.createPresences();
        
        
        
        
        
        
        }
    }
    


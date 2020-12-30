/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;
import java.lang.SecurityManager;
import java.net.ServerSocket;
import java.net.Socket;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;


public class Servidor {
    
    static int DEFAULT_PORT = 8080;
    //static Pedido pedido;
    static Pedidos pedidos = null;
    ServerSocket servidor;
    
    String SERVICE_NAME="/PresencesRemote";
    
    static PedidosInterface stub;
    
		private void bindRMI(Pedidos pedidos) throws RemoteException {
			
			System.getProperties().put( "java.security.policy", "C:\\Users\\Diogo\\Documents\\NetBeansProjects\\SistemasDistribuidos\\Documents\\NetBeansProjects\\SistemasDistribuidos\\src\\Backend\\server.policy");
                        

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
		
		Pedidos presences = null;
		try {
			presences = new Pedidos();
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
		try{
                servidor = new ServerSocket(DEFAULT_PORT);
                System.out.println("Servidor na porta " + DEFAULT_PORT);
                while(true){
                Socket ligacao = servidor.accept();
                System.out.println("Cliente conectado: " + ligacao.getInetAddress());
                
                
                
                }
                
                }catch(Exception e){
                
                
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
    


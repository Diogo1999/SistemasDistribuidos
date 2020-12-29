/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;
import Backend.PedidosInterface;
import java.rmi.NotBoundException;
//import java.rmi.NotBoundException;
//import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

//Implementa o cliente

public class Cliente {
    
    String servidor = "127.0.0.1";
    int port = 8080;
    
    String cliente; 
    //static Pedido pedido;
    
    PedidosInterface stub = null;

    /**
     * @param args the command line arguments
     */
 //   public static void main(String[] args) {
        // TODO code application logic here
        static String SERVICE_NAME="/PresencesRemote";
        
        public Cliente(String cliente){
            this.cliente = cliente;
        
        try {
            stub =
                (PedidosInterface) LocateRegistry.getRegistry("127.0.0.1").lookup(SERVICE_NAME);
                   	

		} catch (Exception e) {
			System.err.println("Error");
			e.printStackTrace();
		}
        }
        
 /*       public int enviaConvite() throws NotBoundException{
            try{
                PedidosInterface stub = (PedidosInterface)LocateRegistry.getRegistry("127.0.0.1", 1099).lookup(SERVICE_NAME);
                //colocar o metodo
            }catch (Exception e){}
    }
}
*/    
} 

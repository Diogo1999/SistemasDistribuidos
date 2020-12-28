/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;
import java.rmi.registry.LocateRegistry;
import Backend.*;

/**
 *
 * @author diogo
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String SERVICE_NAME="/PresencesRemote";
        
        
        try {

			PedidosInterface presences = (PedidosInterface) LocateRegistry.getRegistry("127.0.0.1").lookup(SERVICE_NAME);
                        System.out.println(presences.enviaConvite());
                        
			
			
	
		} catch (Exception e) {
			System.err.println("Error");
			e.printStackTrace();
		}
        
     
    }
    
}

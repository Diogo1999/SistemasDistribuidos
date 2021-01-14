/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

import Backend.PedidosInterface;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.rmi.NotBoundException;
//import java.rmi.NotBoundException;
//import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

//Implementa o cliente
public class Cliente {

    static final String DEFAULT_HOST = "127.0.0.1";
    int port = 8080;
    BufferedReader in;
    PrintWriter out;
    Socket ligacao = null;

    String cliente;
    //static Pedido pedido;

    PedidosInterface stub = null;

    /**
     * @param args the command line arguments
     */
    //   public static void main(String[] args) {
    // TODO code application logic here
    static String SERVICE_NAME = "/PresencesRemote";

    public Cliente(String cliente) {
        this.cliente = cliente;

        try {
            PedidosInterface stub = (PedidosInterface) LocateRegistry.getRegistry("127.0.0.1").lookup(SERVICE_NAME);
            System.out.println(stub.enviaConvite("ola"));

        } catch (Exception e) {
            System.err.println("Error");
            e.printStackTrace();
        }
        try {
            ligacao = new Socket(DEFAULT_HOST, port);
            System.out.println("ligacao ao servidor");
            BufferedReader in = new BufferedReader(new InputStreamReader (ligacao.getInputStream()));
            PrintWriter out = new PrintWriter(ligacao.getOutputStream(),true);
            String teste = "oala";
            out.println();
            out.flush();
            
            
            String msg;
            while ((msg = in.readLine()) != null) {
                System.out.println("Resposta do servidor: " + msg);
            }

            ligacao.close();
            System.out.println("Terminou a ligacao!");
            

        }catch(Exception e){
        System.out.println("Erro ao comunicar com o servidor: "+e);
        
        }
        
        
        

    }
    public int getPort(){
    int porto = ligacao.getPort();
    return porto;
    }

    public static void main(String[] args) {

        Cliente cliente = new Cliente("ola");
        Registo registo = new Registo();
        registo.setVisible(true);
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

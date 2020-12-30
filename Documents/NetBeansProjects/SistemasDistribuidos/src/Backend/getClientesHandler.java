/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import Cliente.Registo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.StringTokenizer;

/**
 *
 * @author Diogo
 */
public class getClientesHandler extends Thread {
    
    Socket ligacao;
    Registo registo;
    BufferedReader in;
    PrintWriter out;
    
    public getClientesHandler(Socket ligacao, Registo registo) {
        this.ligacao = ligacao;
        this.registo = registo;
        try {
            this.in = new BufferedReader(new InputStreamReader(ligacao.getInputStream()));
            this.out = new PrintWriter(ligacao.getOutputStream());
        } catch (IOException e) {
            System.out.println("Erro na execucao do servidor: " + e);
            System.exit(1);
        }
    }
    public void run() {
        try {
            System.out.println("Aceitou ligacao de cliente no endereco " + ligacao.getInetAddress() + " na porta " + ligacao.getPort());

            String response;
            String msg = in.readLine();
            System.out.println("Request=" + msg);

            StringTokenizer tokens = new StringTokenizer(msg);
            String metodo = tokens.nextToken();
            if (metodo.equals("get")) {
                response = "101\n";
                String ip = tokens.nextToken();
                System.out.println(response);
                out.println(response);
            } else {
                out.println("201;method not found");
            }

            out.flush();
            in.close();
            out.close();
            ligacao.close();
        } catch (IOException e) {
            System.out.println("Erro na execucao do servidor: " + e);
            System.exit(1);
        }
    }

}
    
    
    
    
    
    

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.util.ArrayList;

/**
 *
 * @author Diogo
 */
public class clienteDados {
    
    private String nickname;
    private String email;
    private String curso;
    private String password;
    private int port;
    private String ip;
    private ArrayList<String> amigos;

    public clienteDados(String nickname, String email, String curso, String password, int port, String ip, ArrayList<String> amigos) {
        this.nickname = nickname;
        this.email = email;
        this.curso = curso;
        this.password = password;
        this.port = port;
        this.ip = ip;
        this.amigos = amigos;
    }

    public String getNickname() {
        return nickname;
    }

    public String getEmail() {
        return email;
    }

    public String getCurso() {
        return curso;
    }

    public String getPassword() {
        return password;
    }

    public int getPort() {
        return port;
    }

    public String getIp() {
        return ip;
    }
    

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
    
    
    
}

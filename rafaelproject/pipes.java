/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rafaelproject;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pedro
 */
public class pipes extends Thread{
    public int num;
    public String name;
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }
    
    public void run(){
        for(int i=1; i<num;i++){
            System.out.println(name+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(pipes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}

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
public class Paralelism extends pipes{
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int numProcess = 10;
    
    pipes searching = new pipes();
    pipes decodifying = new pipes();
    pipes operating = new pipes();
    pipes executing = new pipes();
    pipes recording = new pipes();
    
    searching.setName("Searching...");
    searching.setNum(numProcess);
    
    decodifying.setname("decodifying...");
    decodifying.setNum(numProcess);
    
    operating.setname("Searching operators...");
    operating.setNum(numProcess);
    
    executing.setname("executing");
    executing.setNum(numProcess);
    
    recording.setname("recording...");
    recording.setNum(numProcess);
    
    Thread estrelinhas = new Thread(){
        public void start(){
            for(int i=1;i<numProcess;i++){
                try {
                System.out.println("*********************");
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Paralelism.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    };
    estrelinhas.start();
        
    searching.start();
        try {
            Thread.sleep(1020);
        } catch (InterruptedException ex) {
            Logger.getLogger(Paralelism.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    decodifying.start();
        try {
            Thread.sleep(1040);
        } catch (InterruptedException ex) {
            Logger.getLogger(Paralelism.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    operating.start();
        try {
            Thread.sleep(1060);
        } catch (InterruptedException ex) {
            Logger.getLogger(Paralelism.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    executing.start();
        try {
            Thread.sleep(1080);
        } catch (InterruptedException ex) {
            Logger.getLogger(Paralelism.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    recording.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Paralelism.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    }
    
}

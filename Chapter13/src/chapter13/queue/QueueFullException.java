/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter13.queue;

/**
 *
 * @author love
 */
public class QueueFullException extends Exception{
    
    int size;
    QueueFullException(int z){
        this.size=z;
    }
    public String toString(){
        
        return "\n Queue Maxium is "+size;
    }
}

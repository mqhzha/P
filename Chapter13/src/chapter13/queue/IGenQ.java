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
public interface IGenQ<T> {
    
     void put(T t) throws QueueFullException;
     T get() throws QueueEmptyException;
    
}

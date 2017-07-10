/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca.c02.p067_understanding_java_statements;

import java.util.concurrent.locks.*;
import java.util.logging.*;

/**
 *
 * @author fabio.moreno.dlbi
 */
public class P076_TheWhileStatement_ConcurrencyTest {
    private static Boolean theBoolean = true;
    final static Lock lock = new ReentrantLock();
    public static void main(String[] args) {
        String message;
        {
            message = "---- SWITCH STATEMENT - STRUCTURE - SINGLE STATEMENT ----";
            System.out.printf("%n %50s%n", message);
            
            new Thread(){
                
                

                @Override
                public void run() {
                    
                    synchronized (lock) {
//                        if (lock.tryLock()) {
                        lock.lock();
                            try {
                                System.out.printf("%n getTheBoolean() = %s%n", getTheBoolean());
                                System.out.printf("%n this = %s%n", "waiting for 700");

                                lock.wait(700);

                                System.out.println("Changing theBoolean to false");
                                setTheBoolean(false);
                                System.out.printf("%n getTheBoolean() = %s%n", getTheBoolean());
                            } catch (InterruptedException ex) {
                                Logger.getLogger(P076_TheWhileStatement_ConcurrencyTest.class.getName()).
                                        log(Level.SEVERE, null, ex);
                            } finally {
                                lock.unlock();
                            }
//                        }
                    }
                }
                
            }.start();
            
            while(getTheBoolean())
                System.out.printf(" theBoolean = %s%n", theBoolean);
            
            
        }
    }
    
    static synchronized Boolean getTheBoolean(){
        while(!lock.tryLock())
            System.out.printf("%n Witing LOck: theBoolean = %s%n", theBoolean);
        System.out.println("getTheBoolean");
        return theBoolean;
    }
    
    static synchronized void setTheBoolean(Boolean theBoolean) {
        synchronized(theBoolean){
        while(!lock.tryLock())
            System.out.printf("%n Witing LOck: theBoolean = %s%n", theBoolean);
        P076_TheWhileStatement_ConcurrencyTest.theBoolean = theBoolean;
            System.out.println("setTheBoolean");
        }
    }
}

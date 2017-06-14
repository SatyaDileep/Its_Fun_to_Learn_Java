package com.java.threads;

import java.util.Date;

/**
 * Created by satyat on 14/09/16.
 */
public class ExtendingThreadClass extends Thread {

    private Date date;
    public void run(){
        for (int i=0; i<10; i++) {
            date = new Date();
            System.out.println("ticking by "+this.getName()+"..! " + date.getSeconds());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ie) {
                // bla bla
            }
        }
    }
}

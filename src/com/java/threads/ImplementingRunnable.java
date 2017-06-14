package com.java.threads;

import java.util.Date;
import java.util.spi.LocaleNameProvider;

/**
 * Created by satyat on 14/09/16.
 */
public class ImplementingRunnable implements Runnable {
    private Date currentDate;
    private LocaleNameProvider localeNameProvider;

    public void run(){
        System.out.println(Thread.activeCount());
    }
}

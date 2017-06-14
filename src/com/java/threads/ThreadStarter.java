package com.java.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Created by satyat on 14/09/16.
 */
public class ThreadStarter {
    public static void main(String[] args) {
        System.out.println("Starting the threads..");
        List<Thread> listOfThreads = new ArrayList<>();
        IntStream.range(0,5).forEach(number -> listOfThreads.add(new ExtendingThreadClass()));
        //listOfThreads.stream().forEach(thread -> thread.start());

        // lets start the guy who  implemented runnable
        Runnable runnable = new ImplementingRunnable();
        new Thread(runnable).start();
    }
}

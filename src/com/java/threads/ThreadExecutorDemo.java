package com.java.threads;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by satyat on 20/09/16.
 */
public class ThreadExecutorDemo {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(16);
        ThreadExecutorDemo threadExecutorDemo = new ThreadExecutorDemo();
        List<Future> futureList = threadExecutorDemo.callThreads(executorService);
        for (Future future : futureList){
            try {
                System.out.println(future.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        System.exit(0);
    }

    private List<Future> callThreads(ExecutorService executorService){
        List<Future> futureList = new ArrayList<>();
        List<CallableThread> callableThreadList = new ArrayList<>();
        for (int i =0; i< 18; i++){
            callableThreadList.add(new CallableThread("ExecutorService"+Math.random()*10000));
        }
        try {
            callableThreadList.stream().forEach(callableThread -> {
                futureList.add(executorService.submit(callableThread));
            });
        }
        catch (Exception ex){

        }
        return futureList;
    }
}



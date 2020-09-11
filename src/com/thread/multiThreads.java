package com.thread;


import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class multiThreads implements Runnable{
    private String name;
    public multiThreads(String name){
        this.name = name;
    }
    @Override
    public void run() {
        for (int i = 0; i <30 ; i++) {
            System.out.println(Thread.currentThread().getName() + "print:" + i);
        }
    }
}

class test{
    public static void main(String[] args) {
//        multiThreads t1 = new multiThreads("aaa");
//        Thread d1 = new Thread(t1,"t1");
//        Thread d2 = new Thread(t1,"t2");
//        d1.start();
//        d2.start();
        ExecutorService pool = Executors.newFixedThreadPool(6);
        int[] num = new int[]{1,2,3,4,5};
        for (int i = 0; i <20 ; i++) {
            pool.execute(()->{
                System.out.println(Thread.currentThread().getName()+"prints");
            });
        }
        pool.shutdown();
    }
}

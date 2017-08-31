package com.parallel;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * 线程池的四种实现
 * Created by mungo on 17-6-10.
 */
public class ThreadPool {
    public static void main(String[] args){
        singleThreadExecutorTest();
    }

    public static void cachedThreadPoolTest(){
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        for (int i = 0; i < 100; i++) {
            cachedThreadPool.execute(new Thread(new Runnable() {
                        @Override
                        public void run() {
                            System.out.println(Thread.currentThread());
                        }
                    })
            );
        }
    }

    private static void fixedThreadPoolTest(){
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 100; i++) {

            fixedThreadPool.execute(new Runnable() {
                                        @Override
                                        public void run() {
                                            System.out.println(Thread.currentThread());
                                        }
                                    }
            );
        }
    }

    private static void newScheduledThreadPoolTest(){
        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(3);
        /**
         * 延迟3秒执行
         */
        scheduledThreadPool.schedule(new Runnable() {

            @Override
            public void run() {
                System.out.println(Thread.currentThread());
            }
        }, 3000, TimeUnit.MILLISECONDS);

        /**
         * 延迟1秒后每3秒执行一次
         */
        scheduledThreadPool.scheduleAtFixedRate(new Runnable() {

            @Override
            public void run() {
                System.out.println(Thread.currentThread());
            }
        }, 1, 3000, TimeUnit.MILLISECONDS);
    }

    private static void singleThreadExecutorTest(){
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 100; i++) {
            singleThreadExecutor.execute(new Runnable() {

                @Override
                public void run() {
                    System.out.println(Thread.currentThread());
                }
            });
        }
    }
}

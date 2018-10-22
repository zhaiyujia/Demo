package com.example.demo.TThread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author zhai
 * @date 2018/9/18 14:14
 */
public class TthreadPool {


    public static void main(String[] args) {

        ThreadPoolExecutor threadPool = new ThreadPoolExecutor(20, 50, 3, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(3),
                new ThreadPoolExecutor.DiscardOldestPolicy());


        for (int i=0;i<10;i++){
            threadPool.execute(() ->{
                int time = 0;
                while(time<5){

//                    if (time==3){
//                    time = 6;
//                        break;
//                    }
//                    System.out.println("AAAAAA");
                    time++;
                }
            });
        }

        System.out.println(threadPool.getTaskCount());

    }



}

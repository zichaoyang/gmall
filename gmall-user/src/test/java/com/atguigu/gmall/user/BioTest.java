package com.atguigu.gmall.user;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @program: gmall->BioTest
 * @description:
 * @author: zcy
 * @create: 2019-11-20 20:11
 **/
public class BioTest {

    public static void main(String[] args) throws Exception {

        ServerSocket serverSocket=new ServerSocket(6666);
        System.out.println("服务器启动了");
        //创建线程池
        ExecutorService executorService = Executors.newCachedThreadPool();
        while (true){
            //每次连接到了他会等待下一个连接继续连
            System.out.println("等待连接");
            Socket socket = serverSocket.accept();
            System.out.println("连接到一个客户端");
            executorService.execute(()->{
                handler(socket);
            });

        }




    }

    private static void handler(Socket socket) {
        try {
            InputStream inputStream = socket.getInputStream();
            byte[] bytes=new byte[1024];
            while (true){
                System.out.println("线程信息 id="+Thread.currentThread().getId()+"线程名称="+Thread.currentThread().getName());
                System.out.println("read");
                //每当读取的时候他会继续等待下一个继续连接
                int read = inputStream.read(bytes);
                if(read!=-1){
                    System.out.println(new String(bytes,0,read));
                }else {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                socket.close();
            } catch (IOException e) {

            }
        }
    }
}

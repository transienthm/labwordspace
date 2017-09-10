package com.mi.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by wangbin on 2017/5/28.
 */
public class MyServer {

    private ServerSocket serverSocket;
    private int port;
    private boolean shutdown;

    public MyServer(int port) {
        this.port = port;
    }

    public void startup() {
        try {
            serverSocket = new ServerSocket(port);
            while (!shutdown) {
                Socket socket = serverSocket.accept();
                System.out.println("一个请求来了");
                new Thread(new DispatcherRequest(socket)).start();    //启动一个线程，为请求提供服务
                //以后可以增加线程池提供对线程的管理
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println("服务器已运行");
        new MyServer(8080).startup();
    }

}

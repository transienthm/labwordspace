package com.mi.server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by wangbin on 2017/5/28.
 */
public class DispatcherRequest implements Runnable {

    private Socket socket;

    public DispatcherRequest(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        System.out.println("线程已创建");
        InputStream is = null;
        OutputStream os = null;
        try {
            is = socket.getInputStream();
            os = socket.getOutputStream();
            byte[] b = new byte[1024];
            is.read(b);

            String str = "GET / HTTP/1.1 <html><head>" +
                    "<title>Hi Mytomcat!</title>" +
                    "</head><body>" +
                    "<h1>Hi!!!!</h1>" +
                    "</body></html>";
            System.out.println("客户端内容:" + new String(b));
            os.write(str.getBytes());

            System.out.println("写回到客户端~" + str);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                is.close();
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

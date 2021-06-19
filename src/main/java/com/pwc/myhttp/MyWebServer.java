package com.pwc.myhttp;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyWebServer {


    public static void main(String[] args) throws Exception {

        ServerSocket ss = new ServerSocket(8081);

        System.out.println("Started the server");


        ExecutorService service = Executors.newFixedThreadPool(100);


        while (true) {

            service.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        Socket s = ss.accept();
                        System.out.println("Received request...");
                        InputStream in = s.getInputStream();


                        byte[] buffer = new byte[1024];
                        in.read(buffer);
                        String requestData = new String(buffer);
                        System.out.println(requestData);


                        /**
                         *
                         * parameters, body of the request, headers
                         *
                         * 0) - the request is GET or POST
                         * a) identify nicely / perfectly : what are the parameters
                         * b) identify what is the data in the body of the request
                         * c) identify the headers in the request
                         *
                         *
                         */

                        /**
                         *
                         * Start processing request
                         * Database : Store the databse
                         *
                         * 500 milli
                         */




                        /**
                         *
                         * RESPONSE (HTML)
                         *
                         */



                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });

        }


    }
}

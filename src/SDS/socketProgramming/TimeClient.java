/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socketProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 *
 * @author Hung
 */
public class TimeClient {
 
    public static void main(String[] args) throws IOException {
       // if (args.length < 2) return;
 
        String hostname = "localhost";//args[0];
        int port = 333;//Integer.parseInt(args[1]);
 
        try (Socket socket = new Socket(hostname, port)) {
 
            InputStream input = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
 
            String time = reader.readLine();
 
            System.out.println(time);
 
 
        } catch (UnknownHostException ex) {
 
            System.out.println("Server not found: " + ex.getMessage());
 
        } catch (IOException ex) {
 
            System.out.println("I/O error: " + ex.getMessage());
        }
    }
}

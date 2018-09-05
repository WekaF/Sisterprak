/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author KEN
 */
public class no1 {
    
     public static void main(String[] args) throws UnknownHostException {
        System.out.println("Cek localhost");
        InetAddress localAddress = InetAddress.getLocalHost();
        System.out.println("Host: " + localAddress.getHostName());
        System.out.println("Ip: " + localAddress.getHostAddress());
        System.out.println(localAddress);
    }
}

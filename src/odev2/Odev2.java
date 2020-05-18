/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odev2;

/**
 *
 * @author MSİ
 */
public class Odev2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       SmartPhone dialer = new SmartPhone(100,2,"1234567890","05555555555");
       SmartPhone caller = new SmartPhone(100,2,"1234567891","05555555556");
       dialer.makeCall(caller);
        System.out.println(caller.getOnCall());
        caller.endCall();
        System.out.println(caller.getOnCall());
    }
    
}

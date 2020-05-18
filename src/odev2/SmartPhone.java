package odev2;


import odev2.Device;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MSİ
 */
public class SmartPhone implements Device {
    private double watt;
    private int hour;
    private String imei;
    private String phoneNumber;
    private boolean onCall;
    private SmartPhone callWith;
    @Override
    public double consumption(double watt,int hour) {
        return (double) (hour*watt);
    }
    public SmartPhone(double watt,int hour,String imei,String phoneNumber){
        this.watt = watt;
        this.hour = hour;
        this.imei = imei;
        this.phoneNumber = phoneNumber;
        
    }
    public String getImei(){
        return this.imei;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public int getHour(){
        return this.hour;
    }
    public double getWatt(){
        return this.watt;
    }
    public boolean getDial(SmartPhone caller){
        if(!onCall){
        this.onCall = true;
        this.callWith  = caller;
        return true;
        }
        else{
            return false;
        }
        }
    public void makeCall(SmartPhone caller){
        if(caller.getDial(this)){
        this.onCall = true;
        this.callWith=caller;
        }
    }
    public void endCall(){
        this.onCall = false;
        this.callWith = null;
    }
    public boolean getOnCall(){
        return this.onCall;
    }
    
    
}

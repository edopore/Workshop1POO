/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller1;

/**
 *
 * @author SalsaBechamel
 */
public class Phone {
     public String model;
     public String vendor;
     private int phoneNumber;
     protected String serialNumber;
     protected String serviceProvider;
     
     public Phone(String model, String vendor, int phoneNumber, String serialNumber, String serviceProvider){
         this.model = model;
         this.vendor = vendor;
         this.phoneNumber = phoneNumber;
         this.serialNumber = serialNumber;
         this.serviceProvider = serviceProvider;
     }
    /**
     * Method to get phone number
     * @return 
     */
     public int getPhonNumber(){
         return this.phoneNumber;
     }
     /**
      * Method to set phone number
      * @param phoneNumber 
      */
     public void setGetNumber(int phoneNumber){
         this.phoneNumber = phoneNumber;
     }
     /**
      * Method to get phone serial number
      * @return 
      */
     public String getSerialNumber(){
         return this.serialNumber;
     }
     /**
      * Method to set phone serial number
      * @param serialNumber 
      */
     public void setSerialNumber(String serialNumber){
         this.serialNumber = serialNumber;
     }
     /**
      * Method to make a call to another phone
      * @param number is the other phone to make a call 
      */
     public void makeCall(int number){
         System.out.print("Calling to "+number+"...");
         System.out.print("Call Ended...");
     }
     /**
      * Method to start an app into phone
      */
     public void openApp(){
         System.out.print("App Opened...");
     }
     /**
      * Method to take a photo
      */
     public void takePhoto(){
         openApp();
         System.out.print("Take photo");
     }
     
     
}

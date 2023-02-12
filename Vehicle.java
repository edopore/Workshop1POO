/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller1;

/**
 *
 * @author SalsaBechamel
 */
public class Vehicle {
    public String type;
    public String model;
    private String manufacturer;
    private String motorSerialNumber;
    protected int occupants;
    
    /**
     * Constructor
     * @param type
     * @param model
     * @param manufacturer
     * @param motorSerialNumber
     * @param occupants
     */
    
    public Vehicle(String type, String model, String manufacturer, String motorSerialNumber, int occupants){
        this.type = type;
        this.model = model;
        this.manufacturer = manufacturer;
        this.motorSerialNumber = motorSerialNumber;
        this.occupants = occupants;
    }
    
    /**
     * Methods to get manufacturer name
     * @return manufacturer name
     */
    
    public String getManufacturer(){
        return this.manufacturer;
    }
    /**
     * Method to set manufacturer name
     * @param manufacturer 
     */
    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }
    /**
     * Method to get motor serial number
     * @return motor serial number
     */
    public String getMotorSerialNumber(){
        return this.motorSerialNumber;
    }
    /**
     * Method to modify motor serial number
     * @param motorSerialNumber is the new motor serial number
     */
    public void setMotorSerialNumber(String motorSerialNumber){
        this.motorSerialNumber = motorSerialNumber;
    }
    /**
     * Method to set occupants into vehicle
     * @param occupants is quantity of person into vehicle
     */
    public void setOccupants(int occupants){
        this.occupants = occupants;
    }
    /**
     * Method to start vehicle´s engine
     */
    private void startEngine(){
        System.out.println("Engine Started");
    }
    /**
     * Method to turn lights on
     */
    protected void lightsOn(){
        System.out.println("Lights On...");
    }
    /**
     * Method to run vehicle
     */
    public void runVehicle(){
        startEngine();
    }
    /**
     * Method to open vehicle doors
     */
    public void opendoors(){
        System.out.print("Doors Open");
    }
}

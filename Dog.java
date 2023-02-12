/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller1;

/**
 * Dog Class Java for Workshop 1
 * @author Eduardo Jose Maya Rodriguez
 */
public class Dog {
    /**
     * Attributes
     */
    protected String name;
    protected String race;
    private int age;
    private float weight;
    
    /**
     * Public constructor for dog class
     * @param name dog name
     * @param race dog breed
     * @param age dog age
     * @param weight  god weight
     */
    
    public Dog(String name, String race, int age, float weight){
        this.name = name;
        this.race = race;
        this.age = age;
        this.weight = weight;
    }
    
    /**
     * Method to obtain dog name
     * @return dog name
     */
    public String getName(){
        return this.name;
    }
    /**
     * Method to set dog name
     * @param name is for new dog name
     */
    public void setName(String name){
        this.name = name;
    }
    /**
     * Method to get Dog's breed
     * @return dog's breed
     */
    public String getRace(){
        return this.race;
    }
    /**
     * Method to set dog's breed
     * @param race is for dog's breed
     */
    public void setRace(String race){
        this.race = race;
    }
    /**
     * Method to obtain dog's age
     * @return dog's age
     */
    public int getAge(){
        return this.age;
    }
    /**
     * Method to set dog age
     * @param age is for dog age 
     */
    public void setAge(int age){
        this.age = age;
    }
    /**
     * Method to get dog's class weight
     * @return dog's class weight
     */
    public float getWeight(){
        return this.weight;
    }
    /**
     * Method to set dog's class weight
     * @param weight
     */
    public void setWeight(int weight){
        this. weight = weight;
    }
    /**
     * Method to make run dog
     */
    public void run(){
        System.out.print(this.name+" is running");
    }
    /**
     * Method to feed dog class
     */
    public void feed(){
        System.out.print("Feeding "+this.name);
    }
    /**
     * Method to put to sleep dog class
     */
    protected void sleep(){
        System.out.print(this.name+" is sleeping, please do not disturb");
    }
    /**
     * Method to make pick a ball
     */
    private void pickBall(){
        System.out.print(this.name+" is picking the ball");
    }
    /**
     * Method to go to park with dog class
     */
    public void goToPark(){
        pickBall();
    }
}

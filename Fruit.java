/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller1;

import java.util.ArrayList;

/**
 * Java class Fruit from workshop 1
 * @author Eduardo Jose Maya Rodriguez
 */
public class Fruit {
    /**
     * Atributes from fruit class
     * name contains the name of the fruit
     * averageWeight contains the average weight of the fruit
     * color contains fruit's color
     */   
    public String name;
    private float averageWeight;
    public ArrayList<String> colors;
    
    /**
     * Constructor of fruit class
     * @param name is the fruit name
     * @param averageWeight is the average weight of the fruit
     * @param colors is the color of the fruit
     */
    public Fruit(String name,float averageWeight,ArrayList<String> colors){
        this.colors = new ArrayList<>();
        this.name = name;
        this.averageWeight = averageWeight;
    }
    /**
     * Method to define fruit's color
     * @param name is the color of the fruit
     */
    public void setColor(String name){
        this.colors.add(name);
    }
    /**
     * Method that shows average weight value of the fruit
     * @return the average weight of the fruit
     */
    public float getAverageWeight(){
        return this.averageWeight;
    }
    /**
     * Method that set an average weight to the fruit
     * @param averageWeight is the value to be set
     */
    public void setAverageWeight(float averageWeight){
        this.averageWeight = averageWeight;
    }
    /**
     * Method that shows all fruit info
     */
    public void frutaInfo(){
        System.out.println("Nombre de la fruta: "+this.name);
        System.out.println("Peso Promedio: "+this.averageWeight);
        System.out.println("Color de la Fruta: "+this.colors);
    }
}

package com.mycompany.taller1;

import java.util.Date;

/**
 * Java Class Person from workshop 1
 * @author Eduardo Jose Maya Rodriguez
 */
public class Person {
    /**
     * Attributes from person class
     * name is the person name
     * lastName1 is the person first last name
     * lastName2 is the person second last name
     * dateBirth is the person birthdate
     * height is the person height in meters
     */
    public String name;
    public String lastName1;
    public String lastName2;
    public Date dateBirth;
    public float height;
    
    /**
     * Contructors
     */
    public Person(){
        this.name = "Persona";
        this.lastName1 = "Primer Apellido";
        this.lastName2 = "Segundo Apellido";
        this.dateBirth = new Date(2000,01,01);
    }
    public Person(String name, String lastName1, String lastName2, int dateBirth[], float height){
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.dateBirth = new Date(dateBirth[0],dateBirth[1],dateBirth[2]);
        
    }
    /**
     * Method to define person's name
     * @param name set name to person
     */
    public void setName(String name){
        this.name = name;
    }
    /**
     * Methodo returns person's name
     * @return person name
     */
    public String getName(){
        return this.name;
    }
    /**
     * Method to define person's first last name
     * @param lastName1 is the first last name
     */
    public void setLastName1(String lastName1){
        this.lastName1 = lastName1;
    }
    /**
     * Method that shows person's second last name
     * @return person second last name
     */
    public String getLastName1(){
        return this.lastName1;
    }
    /**
     * Method to set second last name
     * @param lastName2 is the person's last name
     */
    public void setLastName2(String lastName2){
        this.lastName2 = lastName2;
    }
    /**
     * Methodo to show second last name
     * @return person's second last name
     */
    public String getLastName2(){
        return this.lastName2;
    }
    /**
     * Method to set birthdate person
     * @param dateBirth is person's birthdate
     */
    public void setDateBirth(int dateBirth[]){
        this.dateBirth = new Date(dateBirth[0],dateBirth[1],dateBirth[2]);
    }
    /**
     * Method to get person's birth date
     * @return persons birth date
     */
    public Date getDateBirth(){
        return this.dateBirth;
    }
    /**
     * Method to define person height
     * @param height is the height value for person
     */
    public void setHeight(float height){
        this.height = height;
    }
    /**
     * Method to get height value
     * @return person's height
     */
    public float getHeight(){
        return this.height;
    }
    /**
     * Method to show person class information
     * Name, Las Names, Birth date and Height
     */
    public void personaInfo(){
        System.out.println("Nombre: "+getName());
        System.out.println("Primer Apellido: "+getLastName1());
        System.out.println("Segundo Apellido: "+getLastName2());
        System.out.println("Fecha de Nacimiento: "+getDateBirth());
        System.out.println("Altura en metros: "+getHeight());
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller1;

/**
 * Java Class for Bank Account for Workshop 1
 * @author Eduardo Jose Maya Rodriguez
 */
public class BankAccount {
    private int accountNumber;
    protected boolean activated;
    /**
     * Constructor for BankAccount class
     * @param accountNumber 
     * @param active 
     */
    public BankAccount(int accountNumber, boolean active){
        this.accountNumber = accountNumber;
        this.activated = active;
    }
    /**
     * Method to set if an account is enabled or disabled
     * @param activated indicate if active or not
     */
    public void setActivated(boolean activated){
        this.activated = activated;
    }
    /**
     * Method to get if an account is enabled or disabled
     * @return a bool to establish if an account is active or not
     */
    public boolean getActivated(){
        return this.activated;
    }
    /**
     * Method to define an account number
     * @param number is the account number
     */
    public void setAccountNumber(int number){
        this.accountNumber = number;
    }
    /**
     * Method to return account number
     * @return the account number
     */
    public int getAccountNumber(){
        return this.accountNumber;
    }
}

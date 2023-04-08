package com.example.sdmproject;

public class Data {
    private static Data data = new Data();
    int amount;
    double balance;
    private Data(){

    }
    public static Data getInstance(){
        return data;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

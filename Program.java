package com.bike;

class bike1{
    String name;
    int number;
    int model;
    public void b_details(String name){
        this.name=name;
        System.out.println("Bike name = "+name);
    }
    public void b_details(String name,int number){
        this.name=name;
        this.number=number;
        System.out.println("Bike Number = "+number);
    }
    public void b_details(String name,int number,int model){
        this.name=name;
        this.number=number;
        this.model=model;
        System.out.println("Bike Model "+model);
    }
}
public class Program {
    public static void main(String[] args) {
        bike1 b = new bike1();
        b.b_details("Yamaha");
        b.b_details("Yamaha",180);
        b.b_details("Yamaha",150,23);
    }
}

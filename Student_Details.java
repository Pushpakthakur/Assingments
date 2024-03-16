package com.company;

class details{
    String name;
    int id;
    float marks;
    public void getDetails(String name,int id,float marks){
        this.name=name;
        this.id=id;
        this.marks=marks;
    }
    public void printDetails(){
        System.out.printf("Student Name :- "+name);
        System.out.println("Student id :- "+id);
        System.out.printf("Student marks :- "+marks);
    }
}
public class Student_Details {
    public static void main(String[] args) {
        details ob = new details();
        ob.getDetails("Pushpak",1,80.2f);
        ob.printDetails();
    }
}

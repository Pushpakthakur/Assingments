package com.Employee;

class emp{
    String name;
    int id;
    double salary;
    public void details(String name){
        this.name=name;
    }
    public void details(int id){
        this.id=id;
    }
    public void details(double salary){
        this.salary=salary;
    }
    public void printDetails(){
        System.out.println("Employee Name = "+name);
        System.out.println("Employee Id = "+id);
        System.out.println("Employee Salary = "+salary);
    }
}

public class employee_Details {
    public static void main(String[] args) {
        emp ob = new emp();
        ob.details(1);
        ob.details("Pushpak");
        ob.details(23000d);
        ob.printDetails();
    }
}

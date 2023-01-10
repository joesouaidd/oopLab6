/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ooplab6;

/**
 *
 * @author souai
 */
public class Employee {
    
    private String name;
    private int age;
    private String position;
    private double salary;
    
    private static double minimumSalary = 750000;


   public Employee(){
       
       setEmployee("No info",18,"No info", Employee.minimumSalary);
    
    }
   
   public Employee(String name){
       setEmployee(name,18,"No info", Employee.minimumSalary);
       
   }
   
   public Employee(String name, int age){
       setEmployee(name,age,"No info", Employee.minimumSalary);
   }
   
   public Employee(String name, int age, String position){
       setEmployee(name,age,position, Employee.minimumSalary);
   }
   
   public Employee(String name, int age, String position, double salary){
       setEmployee(name,age,position, salary);
   }   

   
   public void setEmployee(String name, int age, String position, double salary){
       setName(name);
       setAge(age);
       setPosition(position);
       setSalary(salary);
       
   }
   
   
   
   public void setName(String name){
       this.name = name;
   }
   public void setAge(int age){
       if(age >=18 && age <= 64){
       this.age = age;
       }
   }
   public void setPosition(String position){
       this.position = position;
   }
   public void setSalary(double salary){
       if (salary >750000){
       this.salary = salary;
       }
       else{
           this.salary = 750000;
       }
   }
   public String getName(){
       return this.name;
   }
   public int getAge(){
       return this.age;
   }
   public String getPosition(){
       return this.position;
   }
   public double getSalary(){
       return this.salary;
   }
   
   public static double  getMinimumSalary(){
    return Employee.minimumSalary;
   }
   
   public double getSalaryAfterTax(){
      return getTax(this.salary);
       
   }
   
   public double getTax(double salary){
       if(salary > 1000 && salary <500000){
           return salary*0.02;
       }
       if(salary > 501000 && salary <750000){
           return salary*0.04;
       }
       if(salary > 751000 && salary <1250000){
           return salary*0.07;
       }
       if(salary > 1251000 && salary <2500000){
           return salary*0.11;
       }
       if(salary > 2501000 && salary <5000000){
           return salary*0.15;
       }
       if(salary > 5000000){
           return salary*0.2;
       }
       
       else return 0;
   }
   
   public String toString(){
        return String.format("|%-20s|%-10d|%20s|%13.2f$| :",
                getName(), getAge(), getPosition(),
                getSalary());

    }
    
   
   
}




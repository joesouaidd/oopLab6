/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ooplab6;

/**
 *
 * @author souai
 */
public class Ooplab6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("The minimum salary is: "+Employee.getMinimumSalary());
        Employee [] array = new Employee [6];
        array[0]= new Employee();
        array[1]= new Employee("alex");
        array[2]= new Employee("alphonse",15);
        array[3]=new Employee ("joe",80,"retired");
        array[4]= new Employee ("charbel",50,"tech lead", 5000000);
        
       
        for(int i =0; i <5; i++){
        System.out.println(array[i]);
        }
       array[4].setSalary(6000000);
        for(int i =0; i <5; i++){
        System.out.println(array[i]);
        }
        
        array[1].setSalary(array[1].getSalary() + array[1].getSalary()*0.05);
        for(int i =0; i <5; i++){
        System.out.println(array[i]);
        }
        
    }
    
}

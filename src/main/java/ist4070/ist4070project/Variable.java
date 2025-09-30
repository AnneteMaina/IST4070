/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ist4070.ist4070project;

/**
 *
 * @author Administrator
 */
public class Variable {
    void showInterest(){
        double amount;
        double interest;
      
        amount=1200.00;
        System.out.println("amount:"+amount);
        
        interest=3.0;
        amount=amount*(100+interest)/100;
        System.out.println("after a year :"+amount);
        
        amount=amount*(100+interest)/100;
        System.out.println("after 2 years :"+amount);
    }
        
public static void main(String[]args)
{
    (new Variable()).showInterest();
}   
    }
           

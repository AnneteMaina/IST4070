/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ist4070.ist4070project;

/**
 *
 * @author Administrator
 */
public class Account {
    public int accountNo;
    public String accountName;
    public double balance;
public void deposit(double amount)    
{
    balance=balance+amount;
}
}
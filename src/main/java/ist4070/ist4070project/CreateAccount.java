/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ist4070.ist4070project;

/**
 *
 * @author Administrator
 */
public class CreateAccount {
public static void  main(String[]args)
{
    Account anneteAccount=new Account();
    anneteAccount.accountNo=143;
    anneteAccount.accountName="Annete";
    anneteAccount.balance=500;
    
 System.out.println("A/c no:"+anneteAccount.accountNo+"A/c name:"+
         anneteAccount.accountName+"Balance:"+anneteAccount.balance);
}
}

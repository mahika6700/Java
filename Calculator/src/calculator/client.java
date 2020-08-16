/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

/**
 *
 * @author Anil
 */
public class client {
    public static void main(String[] args)throws NotBoundException, RemoteException, MalformedURLException
    {
        Scanner sc = new Scanner(System.in);
        try
        {
            CalculatorInterface c= (CalculatorInterface)Naming.lookup("rmi://localhost:1010/c alculator"); 
            System.out.println("Server is ready!");
            System.out.println("Choose from the following :\n"
                    + "1. Addition"
                    + "2. Subtraction "
                    + "3. Multiplication"
                    + "4. Division");
            int choice = sc.nextInt();
            int m,n;
            switch(choice)
            {
              case 1:
                    {
                    System.out.println("Enter m and n: ");
                    m=sc.nextInt();
                    n=sc.nextInt();
                    System.out.println("The result is : "+c.add(m,n));
                    break;
            }
                case 2:
                    {
                    System.out.println("Enter m and n: ");
                    m=sc.nextInt();
                    n=sc.nextInt();
                    System.out.println("The result is : "+c.sub(m,n));
                    break;
            }    
                case 3:
                    {
                    System.out.println("Enter m and n: ");
                    m=sc.nextInt();
                    n=sc.nextInt();
                    System.out.println("The result is : "+c.mul(m,n));
                    break;
            }
                case 4:
                    {
                    System.out.println("Enter m and n: ");
                    m=sc.nextInt();
                    n=sc.nextInt();
                    System.out.println("The result is : "+c.div(m,n));
                    break;
            }
                    
            }  
        }
        catch(Exception e)
        {
            
    }
}
}

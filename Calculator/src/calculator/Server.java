/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator; 

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;


public class Server {
    public static void main(String[] args) throws RemoteException,NotBoundException
    {
       try{
            Registry r = java.rmi.registry.LocateRegistry.createRegistry(1010); 
            r.rebind("calculator",new Calculator());
            System.out.println("Server is ready!");
       
    }
       catch (Exception e)
       {
           System.out.println("Not connected"); 
       } 
    } 
} 


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Mahika
 */
public class Calculator extends UnicastRemoteObject implements CalculatorInterface{
    public Calculator() throws RemoteException
    {
        int m,n;
} 
    @Override
    public int add(int m, int n) throws RemoteException
    {
        return m+n;
    }
    @Override
    public int sub(int m, int n) throws RemoteException
    {
        return m-n;
    }
    @Override
    public int mul(int m, int n)throws RemoteException
    {
        return m*n;
    }
    @Override
    public int div(int m, int n)throws RemoteException
    {
        return m/n;
    }
}

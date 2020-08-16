/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CalculatorInterface extends Remote
{
    public int add(int m, int n)throws RemoteException;
    public int sub(int m, int n)throws RemoteException;
    public int mul(int m, int n)throws RemoteException;
    public int div(int m, int n)throws RemoteException;
}

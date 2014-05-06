package com.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

import com.model.User;

public interface IHello extends Remote { 

    /** 
     * �򵥵ķ��ء�Hello World��"���� 
     * @return ���ء�Hello World��"���� 
     * @throws java.rmi.RemoteException 
     */ 
    public String helloWorld() throws RemoteException; 

    /** 
     * һ���򵥵�ҵ�񷽷������ݴ��������������Ӧ���ʺ��� 
     * @param someBodyName  ���� 
     * @return ������Ӧ���ʺ��� 
     * @throws java.rmi.RemoteException 
     */ 
    public String sayHelloToSomeBody(String someBodyName) throws RemoteException; 
    public User getUser() throws RemoteException; 
}

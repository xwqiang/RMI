package com.server.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import com.model.User;
import com.rmi.IHello;

public class HelloImpl extends UnicastRemoteObject implements IHello { 
    /** 
     * ��ΪUnicastRemoteObject�Ĺ��췽���׳���RemoteException�쳣���������Ĭ�ϵĹ��췽������д�����������׳�RemoteException�쳣 
     * 
     * @throws RemoteException 
     */ 
    public HelloImpl() throws RemoteException { 
    } 

    /** 
     * �򵥵ķ��ء�Hello World��"���� 
     * 
     * @return ���ء�Hello World��"���� 
     * @throws java.rmi.RemoteException 
     */ 
    public String helloWorld() throws RemoteException { 
        return "Hello World!"; 
    } 

    /** 
     * һ���򵥵�ҵ�񷽷������ݴ��������������Ӧ���ʺ��� 
     * 
     * @param someBodyName ���� 
     * @return ������Ӧ���ʺ��� 
     * @throws java.rmi.RemoteException 
     */ 
    public String sayHelloToSomeBody(String someBodyName) throws RemoteException { 
        return "��ã�" + someBodyName + "!"; 
    } 
    public User getUser(){
    	User u = new User();
    	u.setId(23);
    	u.setUname("xwqiang");
    	u.setPasswd("222");
    	return u;
    }
}

package com.client.impl;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import com.rmi.IHello;

public class HelloClient { 
    public static void main(String args[]){ 
        try { 
            //��RMI����ע����в�������ΪRHello�Ķ��󣬲��������ϵķ��� 
        	
            IHello rhello =(IHello) Naming.lookup("rmi://localhost:8888/RHello"); 
            System.out.println(rhello.helloWorld()); 
            System.out.println(rhello.sayHelloToSomeBody("����")); 
            System.out.println(rhello.getUser().getUname());
        } catch (NotBoundException e) { 
            e.printStackTrace(); 
        } catch (MalformedURLException e) { 
            e.printStackTrace(); 
        } catch (RemoteException e) { 
            e.printStackTrace();   
        } 
    } 
}

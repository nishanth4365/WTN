package com.wipro.eb.main;

import com.wipro.eb.entity.*;
import com.wipro.eb.service.*;
public class Main {
  public static void main(String args[])
  {
    ConnectionService c1=new ConnectionService();
    System.out.println(c1.generateBill(220,100,"Domestic"));
    
  }

}
package com.wipro.eb.service;

import com.wipro.eb.exception.*;
import com.wipro.eb.entity.*;
public class ConnectionService {
  public boolean validate(int currentReading,int previousReading,String type)throws InvalidReadingException,InvalidConnectionException
  {
    if(currentReading<previousReading ||currentReading<0 ||previousReading<0)
    {
      throw new InvalidReadingException();
    }
    else if(!(type.equals("Domestic") || type.equals("Commercial")))
    {
      throw new InvalidConnectionException();
    }
    else
    {
      return true;
    }
  }
  public float calculateBillAmount(int currentReading,int previousReading,String type )
  {
    try {
      boolean c=validate(currentReading,previousReading,type);
      float b1=0.0f;
      if(c==true)
      {
        if(type=="Domestic")
        {
          Domestic d=new Domestic(currentReading,previousReading,new float[] {2.3f,4.2f,5.5f});
            b1=d.computeBill();
                return b1;
        }
        else
        {
          Commercial d=new Commercial(currentReading,previousReading,new float[] {5.2f,6.8f,8.3f});
          b1=d.computeBill();
          return b1;
        }
      }
    }
    catch(InvalidReadingException e)
    {
      return -1.0f;
    }
    catch(InvalidConnectionException e)
    {
      return -2.0f;
    }
    return 0.0f;
  }
  public String generateBill(int currentReading,int previousReading,String type)
  {
    float b=calculateBillAmount(currentReading,previousReading,type);
    if(b==-1)
    return "Invalid Reading";
    else if(b==-2)
      return "Invalid Connection Type";
    else
      return "Your bill is:"+b;
  }

}
package com.wipro.eb.entity;

public class Commercial extends Connection {
  public Commercial()
  {
    
  }
  public Commercial(int currentReading,int previousReading,float[] slabs)
  {
    this.currentReading=currentReading;
    this.previousReading=previousReading;
    this.slabs=slabs;
  }
  public float computeBill()
  {
    //logic for Commercial type slabs
    float reading=currentReading-previousReading;
    if(reading<50)
    {
      return reading*slabs[0];
    }
    else if(reading<100)
    {
      return 260+((reading-50)*slabs[1]);
    }
    else
    {
      return 550+((reading-100)*slabs[2]);
    }
  }

}
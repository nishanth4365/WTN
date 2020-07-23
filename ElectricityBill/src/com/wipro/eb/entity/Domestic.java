package com.wipro.eb.entity;

public class Domestic extends Connection {
  public Domestic()
  {
    
  }
  public Domestic(int currentReading,int previousReading,float[] slabs)
  {
    this.currentReading=currentReading;
    this.previousReading=previousReading;
    this.slabs=slabs;
  }
  public float computeBill()
  {
    //logic for Domestic type slabs
    float reading=currentReading-previousReading;
    if(reading<50)
    {
      return reading*slabs[0];
    }
    else if(reading<100)
    {
      return 115+((reading-50)*slabs[1]);
    }
    else
    {
      return 210+((reading-100)*slabs[2]);
    }
  }

}
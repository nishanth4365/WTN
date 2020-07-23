package com.wipro.eb.entity;

public abstract class Connection {
  int currentReading;
  int previousReading;
  float[] slabs;
  public Connection()
  {
    
  }
  public Connection(int currentReading,int previousReading,float[] slabs)
  {
    this.currentReading=currentReading;
    this.previousReading=previousReading;  
    this.slabs=slabs;
  }
  public int getCurrentReading() {
    return currentReading;
  }
  public void setCurrentReading(int currentReading) {
    this.currentReading = currentReading;
  }
  public int getPreviousReading() {
    return previousReading;
  }
  public void setPreviousReading(int previousReading) {
    this.previousReading = previousReading;
  }
  public float[] getSlabs() {
    return slabs;
  }
  public void setSlabs(float[] slabs) {
    this.slabs = slabs;
  }
  public abstract float computeBill();

}
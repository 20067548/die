 class Die
{
  private int value;
  private int numSides;
  private static int id;
  private int dieId;

  public Die (int v, int n)
  {
    setValue(v);
    setNumSides(n);
    id++;
    setDieId(id);
  }
  public Die()
  {
    this(1,6);
  }


  public boolean equals(Die d)
  {
    if (this.getValue() == d.getValue())
    {
      return true;
    }
    else
    {
      return false;
    }
  }


  public int getValue()
  {
    return value;
  }
  public int getNumSides()
  {
    return numSides;
  }
  
  public void setValue(int v)
  {
    value = v;
  }
  public void setNumSides(int n)
  {
    numSides = n;
  }
  public void setDieId(int d)
  {
    dieId = d;
  }

  public int roll()     // rolling.
  {
    int value = (1+(int)(Math.random()*numSides));
    this.setValue(value);
    return value;
  }

  public String toString()
  {
    return ("Die id: " + dieId + " Value: " + value + " Numsides: " + numSides);
  }
}
package demoChecking;

import org.testng.annotations.Test;

public class NewTest
{
  @Test(priority=1)
  public void fun1()
  {
	  System.out.println("my 1st test");
  }
  
  @Test(priority=2)
  public void fun2()
  {
	  System.out.println("my 2nd test");
  }
  @Test(priority=3)
  public void fun3()
  {
	  System.out.println("my 2nd test");
  }
  
}

package selenium;

import org.testng.annotations.Test;

public class Testing2 {
  @Test(groups = "important")
  public void test4() {
	  System.out.println("Test4");
  }
  @Test(groups = "smoke")
  public void test5() {
	  System.out.println("Test5");
  }
}

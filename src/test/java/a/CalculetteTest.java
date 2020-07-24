package a;

import org.testng.Assert;
import org.testng.annotations.Test;



public class CalculetteTest {

  @Test
  public void addTest() {
      Calculette calc = new Calculette();
    Assert.assertEquals(calc.add(12, 8),20.0);
  }

  @Test
  public void diviserTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void produitTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void soustraireTest() {
    throw new RuntimeException("Test not implemented");
  }
}

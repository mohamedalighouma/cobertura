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
    Assert.assertEquals(calc.soustraire(2, 1),1.0);
  }

  @Test
  public void produitTest() {
    Assert.assertEquals(calc.produit(1, 1),1.0);
  }

  @Test
  public void soustraireTest() {
   Assert.assertEquals(calc.diviser(1, 1),1.0);
  }
}

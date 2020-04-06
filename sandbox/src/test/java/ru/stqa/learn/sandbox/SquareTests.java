package ru.stqa.learn.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.TestInstance;

public class SquareTests {

  @Test

  public void testArea() {
    Square s = new Square(5);
    Assert.assertEquals(s.area(),25);
  }
}

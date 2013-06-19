package org.teachingkidsprogramming.recipes;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class SimpleSquare
{
  public static void main(String[] args) throws Exception
  {
    Tortoise.setSpeed(10);
    int sides = 360 / 3;
    while (true)
    {
      Tortoise.setPenWidth(2);
      Tortoise.setPenColor(Colors.getRandomColor());
      Tortoise.setPenWidth(1);
      Tortoise.move(100);
      Tortoise.turn(sides - 1);
    }
  }
}

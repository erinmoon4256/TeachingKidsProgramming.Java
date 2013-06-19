package org.teachingkidsprogramming.recipes;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class Houses
{
  public static void main(String[] args)
  {
    //   Make the tortoise move as fast as possible --#11
    //   Have the tortoise start at 200 pixels in on the X axis --#14
    Tortoise.setSpeed(10);
    Tortoise.setX(200);
    Tortoise.setPenColor(Colors.Grays.LightGray);
    int height = 50;
    drawHouse(height);
    drawHouse(120);
    //   The current height is 40 --#1.2
    //   drawHouse (recipe below) --#9
    //   ------------- Recipe for drawHouse --#9
    //   Change the color of the line the tortoise draws to lightGray --#15
    //   ------------- End of drawHouse recipe
    //   DrawHouse with height 90 (recipe below) --#12
    drawHouse(90);
    drawHouse(20);
    //   DrawHouse with height 20 (recipe below) --#13
  }
  private static void drawHouse(int height)
  {
    Tortoise.move(height);
    Tortoise.turn(90);
    Tortoise.move(30);
    Tortoise.turn(90);
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
}

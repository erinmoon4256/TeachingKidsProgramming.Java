package org.teachingkidsprogramming.recipes;

import org.teachingextensions.logo.ColorWheel;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class DigiFlower
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    //    Make the background silver --#8
    Tortoise.setPenWidth(3);
    createColorPalette();
    for (int i = 1; i <= 15; i++)
    {
      drawOctogon();
      Tortoise.turn(360 / 15);
      Tortoise.turn(360 / 5);
    }
  }
  private static void drawOctogon()
  {
    for (int i = 1; i <= 8; i++)
    {
      Tortoise.setPenColor(ColorWheel.getNextColor());
      Tortoise.move(50);
      Tortoise.turn(360 / 8);
    }
  }
  private static void createColorPalette()
  {
    String Color1 = "Colors.Reds.Red";
    String Color2 = "Colors.Oranges.DarkOrange";
    String Color3 = "Colors.Yellows.Gold";
    String Color4 = "Colors.Yellows.Yellow";
    ColorWheel.addColor(Colors.Reds.Red);
    ColorWheel.addColor(Colors.Oranges.DarkOrange);
    ColorWheel.addColor(Colors.Yellows.Gold);
    ColorWheel.addColor(Colors.Yellows.Yellow);
    ColorWheel.addColor(Colors.Yellows.Yellow);
    ColorWheel.addColor(Colors.Yellows.Yellow);
    ColorWheel.addColor(Colors.Oranges.DarkOrange);
    ColorWheel.addColor(Colors.Reds.Red);
  }
}

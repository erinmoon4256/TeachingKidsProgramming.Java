package org.teachingkidsprogramming.recipes.finalExam;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.windows.MessageBox;

public class ExamTriangleShellFour
{
  private static int length;
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    int shell = MessageBox.askForNumericalInput("Size of a shell?");
    if (shell < 210)
    {
      shell = MessageBox
          .askForNumericalInput("The size of the shell is too small to be seen! Updated size of shell?");
    }
    else
    {
      for (int i = 1; i <= shell; i++)
      {
        Tortoise.setPenColor(Colors.Purples.Purple);
        int largeLength = shell / 100;
        length = length + largeLength;
        if (largeLength < 0)
        {
          length = length + 7;
        }
        else
        {
          drawTriangle();
        }
        int rotations = 12;
        Tortoise.turn(360 * rotations / shell);
      }
    }
  }
  private static void drawTriangle()
  {
    for (int i = 1; i <= 3; i++)
    {
      Tortoise.move(length);
      Tortoise.turn(360 / 3.1);
    }
  }
}

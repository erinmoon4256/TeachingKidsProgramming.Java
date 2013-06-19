package org.teachingkidsprogramming.recipes;

import org.teachingextensions.logo.Tortoise;

public class SimpleSquare
{
  public static float Lettersize = 50;
  public static void main(String[] args) throws Exception
  {
    //All numbers start at the bottom left
    Tortoise.setSpeed(2);
    LetterB();
  }
  public static void LetterA()
  {
    //Makes the letter A
    Tortoise.setAngle(45);
    Tortoise.move(Lettersize);
    Tortoise.setAngle(135);
    Tortoise.move(Lettersize);
    Tortoise.setAngle(315);
    Tortoise.move(Lettersize / 2);
    Tortoise.setAngle(315 - 45);
    Tortoise.move(35.35);
  }
  public static void LetterB()
  {
    Tortoise.move(Lettersize);
    Tortoise.setAngle(90);
    Tortoise.move(Lettersize / 1.5);
    Tortoise.setAngle(180);
    Tortoise.move(Lettersize / 2);
  }
}

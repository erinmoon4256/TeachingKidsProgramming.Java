package org.teachingkidsprogramming.recipes;

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.windows.MessageBox;
=======
import org.teachingextensions.logo.Tortoise;
>>>>>>> 15e40837d3dff52804d6d3938f1e55bf3e07d308
=======
import org.teachingextensions.logo.Tortoise;
>>>>>>> 15e40837d3dff52804d6d3938f1e55bf3e07d308
=======
import org.teachingextensions.logo.Tortoise;
>>>>>>> 15e40837d3dff52804d6d3938f1e55bf3e07d308
=======
import org.teachingextensions.logo.Tortoise;
>>>>>>> 15e40837d3dff52804d6d3938f1e55bf3e07d308
=======
import org.teachingextensions.logo.Tortoise;
>>>>>>> 15e40837d3dff52804d6d3938f1e55bf3e07d308

public class SimpleSquare
{
  public static float Lettersize = 50;
  public static void main(String[] args) throws Exception
  {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
    Tortoise.show();
    Tortoise.setSpeed(10);
    int sides = MessageBox.askForNumericalInput("How many boyfriends do you have??");
    for (int i = 1; i <= sides; i++)
    {
      Tortoise.setPenColor(Colors.getRandomColor());
      Tortoise.setPenWidth(i * 2);
      Tortoise.move(i * -5);
      Tortoise.turn(360.0 * 3 / sides);
    }
=======
=======
>>>>>>> 15e40837d3dff52804d6d3938f1e55bf3e07d308
=======
>>>>>>> 15e40837d3dff52804d6d3938f1e55bf3e07d308
=======
>>>>>>> 15e40837d3dff52804d6d3938f1e55bf3e07d308
=======
>>>>>>> 15e40837d3dff52804d6d3938f1e55bf3e07d308
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
    Tortoise.penUp();
    Tortoise.move(Lettersize / 2);
    Tortoise.setAngle(315 - 45);
    Tortoise.penDown();
    Tortoise.move(35.35);
  }
  public static void LetterB()
  {
    Tortoise.move(Lettersize);
    Tortoise.setAngle(90);
    Tortoise.move(Lettersize / 1.52);
    Tortoise.setAngle(180);
    Tortoise.move(Lettersize / 2);
    Tortoise.setAngle(0);
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 15e40837d3dff52804d6d3938f1e55bf3e07d308
=======
>>>>>>> 15e40837d3dff52804d6d3938f1e55bf3e07d308
=======
>>>>>>> 15e40837d3dff52804d6d3938f1e55bf3e07d308
=======
>>>>>>> 15e40837d3dff52804d6d3938f1e55bf3e07d308
=======
>>>>>>> 15e40837d3dff52804d6d3938f1e55bf3e07d308
  }
}

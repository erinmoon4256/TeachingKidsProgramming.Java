package org.teachingkidsprogramming.recipes;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Turtle;

public class TurtleTree
{
  public static void main(String[] args)
  {
    //create a turtle
    Turtle turtle = new Turtle();
    //    Make the tortoise go as fast as possible --#11
    turtle.setSpeed(10);
    //    Turn the background black --#22
    turtle.getBackgroundWindow().setBackground(Colors.Grays.Black);
    //    The current branch length = 60 --#1.2
    int branch = 60;
    //    drawBranch(recipe below) --#2
    //    ------------- Recipe for drawBranch --#2
    drawBranch(turtle, branch);
    //    ------------- End of drawBranch recipe --#2
  }
  private static void drawBranch(Turtle turtle, int branch)
  {
    //        If the current branch length is greater than zero, do the rest of this recipe --#6
    if (branch > 0)
    {
      //        adjustColor --#16
      //        ------------- Recipe for adjustColor --#16
      adjustColor(turtle, branch);
      //        ------------- End of adjustColor --#16
      //        Move the tortoise the length of the current branch --#1.1
      turtle.move(branch);
      //        drawLowerBranches (recipe below) --#7
      //        ------------- Recipe for drawLowerBranches --#7
      //            Turn the Tortoise 30 degrees to the right --#3
      drawLowerBranches(turtle, branch);
      //        ------------- End of drawLowerBranches recipe --#7
    }
  }
  private static void adjustColor(Turtle turtle, int branch)
  {
    //            A 10 pixel long branch is lime --#21
    if (branch == 10)
    {
      turtle.setPenColor(Colors.Greens.Lime);
    }
    //            A 20 pixel long branch is forest green --#20
    if (branch == 20)
    {
      turtle.setPenColor(Colors.Greens.ForestGreen);
    }
    //            A 30 pixel long branch is dark green --#19
    if (branch == 30)
    {
      turtle.setPenColor(Colors.Greens.DarkGreen);
    }
    //            A 40 pixel long branch is olive --#18
    if (branch == 40)
    {
      turtle.setPenColor(Colors.Greens.Olive);
    }
    //            A 50 pixel long branch is sienna --#15
    if (branch == 50)
    {
      turtle.setPenColor(Colors.Browns.Sienna);
    }
    //            A 60 pixel long branch is saddle brown --#14
    if (branch == 60)
    {
      turtle.setPenColor(Colors.Browns.SaddleBrown);
    }
  }
  private static void drawLowerBranches(Turtle turtle, int branch)
  {
    turtle.turn(30);
    //            drawShorterBranch (recipe below) --#9
    //            ------------- Recipe for drawShorterBranch --#9
    //                drawBranch (10 pixels shorter) --#4
    drawShorterBranch(turtle, branch);
    //            ------------- End of drawShorterBranch recipe --#9
    //            Turn the Tortoise 60 degrees to the left --#8
    turtle.turn(-60);
    //            drawShorterBranch --#10
    drawShorterBranch(turtle, branch);
    //            Turn the Tortoise 30 degrees to the right --#13
    turtle.turn(30);
    //            adjustColor --#17
    adjustColor(turtle, branch);
    //            Move the tortoise backward the length of the current branch --#12
    turtle.move(-branch);
  }
  private static void drawShorterBranch(Turtle turtle, int branch)
  {
    drawBranch(turtle, branch - 10);
  }
}
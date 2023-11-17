package com.pluralsight;

import com.pluralsight.forms.World;
import com.pluralsight.forms.Turtle;


import java.awt.*;

public class MainApp {
    public static void main(String[] args) {
        // This starter code to get you familiar with how
        // the TurtleLogo application works

        // The world is your canvas
        World world = new World(200, 200);
        Turtle turtle = new Turtle(world, 0, 0);

        int width = 200;
        int height = 200;

        // calculate the hypotenuse (diagonal)
        // a2 + b2 = c2
        double widthSquared = Math.pow(width, 2);
        double heightSquared = Math.pow(height, 2);
        double hypotenuse = Math.sqrt(widthSquared + heightSquared);


        int side1 = 50;
        int size2 = 50;



//        turtle.turnRight(45);
//        turtle.forward(hypotenuse);
//
//        turtle.penUp();
        //turtle.goTo(40, 40);
//        turtle.turnRight(90);
//
//        turtle.penDown();
//        turtle.forward(hypotenuse);

//
        makeTriangle(turtle);

    }

    public static void makeCircle(Turtle turtle){

        double diameter = 50;
        int steps = 360;

        turtle.setPenWidth(3);
        turtle.setColor(Color.RED);
        turtle.penDown();

        for (int i = 0; i < steps; i++) {
            turtle.forward(diameter * Math.PI / steps);
            turtle.turnRight(360.0 / steps);
        }


    }

    public static void makeSquare(Turtle turtle) {
        turtle.forward(50);
        turtle.turnRight(90);
        turtle.forward(50);
        turtle.turnRight(90);
        turtle.forward(50);
        turtle.turnRight(90);
        turtle.forward(50);
}

    public static void makeTriangle(Turtle turtle){

        turtle.forward(60);
        turtle.turnLeft(145);
        turtle.forward(60);
        turtle.turnLeft(90);
        turtle.forward(40);


    }



}

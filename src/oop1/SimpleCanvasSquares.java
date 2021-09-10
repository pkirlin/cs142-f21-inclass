package oop1;

import java.awt.*;

public class SimpleCanvasSquares {
    public static void main(String[] args) {

        SimpleCanvas squareCanvas = new SimpleCanvas(500, 500);
        Color otherColor = new Color(50, 100, 200);

        squareCanvas.setPenColor(otherColor);
        squareCanvas.drawFilledRectangle(100, 100, 300, 300);

        Color c = new Color(118, 64, 142);

        squareCanvas.setPenColor(c);
        squareCanvas.drawFilledRectangle(150, 150, 200, 200);
        squareCanvas.show();
    }
}
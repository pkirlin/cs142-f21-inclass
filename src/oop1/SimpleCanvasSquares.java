package oop1;

import java.awt.*;

public class SimpleCanvasSquares {
    public static void main(String[] args) {

        // Use SimpleCanvas to open a new canvas and draw
        // a concentric square design similar to this:
        // https://www.levygorvy.com/works/frank-stella/

        SimpleCanvas squareCanvas = new SimpleCanvas(500, 500);
        squareCanvas.drawFilledRectangle(100, 100, 300, 300);

        Color mycolor = new Color(188, 218, 86);
        squareCanvas.setPenColor(mycolor);
        squareCanvas.drawFilledRectangle(150, 150, 200, 200);


        squareCanvas.show();

    }
}
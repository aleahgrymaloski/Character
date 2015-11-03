/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author Aleah
 */
public class Plankton {

    public static Color GREEN_BODY = new Color(47, 121, 21);
    
    
    public void draw(Graphics graphics) {
        graphics.setColor(Color.BLUE);
        graphics.drawRect(getX(), getY(), getWidth(), getHeight());
        
        
        //body
        graphics.setColor(GREEN_BODY);
//        graphics.fillOval(x + (width * 10 / 100), y + (height * 50 / 100), width * 80 / 100, height * 40 / 100);
        graphics.fillRoundRect(x + (width * 10 / 100), y + (height * 50 / 100), width * 80 / 100, height * 40 / 100, width * 60 / 100, width * 60 / 100);

        
        //eye
        graphics.setColor(Color.YELLOW);
        graphics.fillOval(x + (width * 25 / 100), y + (height * 55 /100), width * 50 / 100, height * 12 / 100);
        
        graphics.setColor(Color.RED);
        graphics.fillOval(x + (width * 38 / 100), y + (height * 57 /100), width * 28 / 100, height * 7 / 100);
        
        graphics.setColor(Color.WHITE);
        graphics.fillOval(x + (width * 47 / 100), y + (height * 58 /100), width * 8 / 100, height * 2 / 100);

        graphics.setColor(Color.BLACK);
        graphics.fillRect(x + (width * 25 / 100), y + (height * 53 / 100), width * 50 / 100 , height * 4 / 100);
        
        graphics.setColor(Color.RED);
        
        graphics.setColor(GREEN_BODY);
        graphics.fillOval(x + (width * 20 / 100), y + (height * 80 /100), width * 10 / 100, height * 15 / 100);
        
        graphics.setColor(GREEN_BODY);
        graphics.fillOval(x + (width * 75 / 100), y + (height * 80 /100), width * 10 / 100, height * 15 / 100);
        
        graphics.setColor(GREEN_BODY);
        graphics.fillOval(x + (width * 1 / 100), y + (height * 70 /100), width * 50 / 100, height * 5 / 100);
        
        graphics.setColor(GREEN_BODY);
        graphics.fillOval(x + (width * 50 / 100), y + (height * 70 /100), width * 50 / 100, height * 5 / 100);
        
        //mouth
        graphics.setColor(Color.RED);
        graphics.fillArc(x + (width * 30 / 100), y + (height * 60 /100), width * 40 / 100, height * 20 / 100, 170, 200);
//      
        graphics.setColor(Color.WHITE);
        graphics.fillArc(x + (width * 30 / 100), y + (height * 63 / 100), width * 40 / 100, height * 10 / 100, 170, 190);
        graphics.fillOval(x + (width * 35 / 100), y + (height * 75 / 100), width *   28 / 100, height * 5 / 100);

        //right antennae
        int[] xValues = new int[7];
        xValues[0] = x + (width * 5 /  100);
        xValues[1] = x + (width * 10 / 100);
        xValues[2] = x + (width * 15 / 100);
        xValues[3] = x + (width * 20 / 100);
        xValues[4] = x + (width * 25 / 100);
        xValues[5] = x + (width * 20 / 100);
        xValues[6] = x + (width * 18 / 100);

        int[] yValues = new int[7];
        yValues[0] = y + (height * 5 /  100);
        yValues[1] = y + (height * 30 / 100);
        yValues[2] = y + (height * 35 / 100);
        yValues[3] = y + (height * 53 / 100);
        yValues[4] = y + (height * 53 / 100);
        yValues[5] = y + (height * 35 / 100);
        yValues[6] = y + (height * 30 / 100);
        
        graphics.setColor(GREEN_BODY);
        graphics.fillPolygon(xValues, yValues, xValues.length);
        
        //left antennae
        xValues[0] = x + (width * 95 /  100);
        xValues[1] = x + (width * 90 / 100);
        xValues[2] = x + (width * 85 / 100);
        xValues[3] = x + (width * 80 / 100);
        xValues[4] = x + (width * 75 / 100);
        xValues[5] = x + (width * 80 / 100);
        xValues[6] = x + (width * 82 / 100);

        yValues[0] = y + (height * 5 /  100);
        yValues[1] = y + (height * 30 / 100);
        yValues[2] = y + (height * 35 / 100);
        yValues[3] = y + (height * 53 / 100);
        yValues[4] = y + (height * 53 / 100);
        yValues[5] = y + (height * 35 / 100);
        yValues[6] = y + (height * 30 / 100);
        
        graphics.setColor(GREEN_BODY);
        graphics.fillPolygon(xValues, yValues, xValues.length);
        
        
        graphics.setColor(Color.BLACK);
        graphics.fillRect(x + (width * 74 / 100), y + (height * 35 / 100), width * 20 / 100 , height * 1 / 100);
        graphics.fillRect(x + (width * 75 / 100), y + (height * 43 / 100), width * 20 / 100 , height * 1 / 100);
        graphics.fillRect(x + (width * 75 / 100), y + (height * 25 / 100), width * 20 / 100 , height * 1 / 100);
        graphics.fillRect(x + (width * 76 / 100), y + (height * 15 / 100), width * 20 / 100 , height * 1 / 100);

        
        graphics.fillRect(x + (width * 3 / 100), y +  (height * 15 / 100),  width * 20 / 100 , height * 1 / 100);
        graphics.fillRect(x + (width * 5 / 100), y + (height *  25 / 100), width * 20 / 100 , height * 1 / 100);
        graphics.fillRect(x + (width * 10 / 100), y + (height * 35 / 100), width * 20 / 100 , height * 1 / 100);
        graphics.fillRect(x + (width * 10 / 100), y + (height * 43 / 100), width * 20 / 100 , height * 1 / 100);
//        Graphics2D g2d = (Graphics2D) graphics;
//        g2d.rotate(Math.toRadians(45));
//        g2d.fillOval(x + 150, y - 200, width / 2, height /2);
//        g2d.rotate(Math.toRadians(-45));
        
//        graphics.setColor(new Color(47, 121, 21));
////        graphics.fillOval(x, y + (  height * 40 / 100), width */ 20/100, height * 20 / 100);
//
//        graphics.setColor(new Color(47, 121, 21));
//        graphics.fillOval(320, 350, 20, 150);
//        graphics.setColor(new Color(47, 121, 21));
//        graphics.fillOval(400, 350, 20, 150);
//
//        graphics.setColor(Color.white);
//        graphics.fillOval(350, 100, 50, 50);
//        graphics.setColor(Color.red);
//        graphics.fillOval(360, 110, 30, 30);
//        graphics.setColor(Color.white);
//        graphics.fillOval(360, 110, 10, 10);
//        graphics.setColor(Color.black);
//        graphics.fillRect(345, 85, 60, 20);
//        graphics.setColor(Color.red);
//        graphics.fillOval(340, 200, 60, 40);
//
//        graphics.setColor(new Color(47, 121, 21));
//        graphics.fillOval(200, 250, 150, 20);
//        graphics.setColor(new Color(47, 121, 21));
//        graphics.fillOval(400, 250, 150, 20);
//
//        
//        
//        int[] xS = new int[3];
//        xS[0] = x + (width / 4);
//        xS[1] = x;
//        xS[2] = x + width;
//
//        int[] yS = new int[3];
//        yS[0] = y;
//        yS[1] = y = (height * 1 / 4);
//        yS[2] = y + (height);
//
//        graphics.setColor(Color.red);
//        graphics.fillPolygon(xS, yS, 3);
    }

    public Plankton(int x, int y, int height, int width) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;

    }

    private int x;
    private int y;
    private int height;
    private int width;

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * @return the width
     */
    public int getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(int width) {
        this.width = width;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character;

import environment.Environment;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author Aleah
 */
class CharacterEnvironment extends Environment {

    private Plankton pBig;
    private Plankton pSmall;

    public CharacterEnvironment() {
        pBig = new Plankton(50, 10, 600, 150);
        pSmall = new Plankton(500, 10, 400, 100);
    }

    @Override
    public void initializeEnvironment() {
    }

    @Override
    public void timerTaskHandler() {
    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {
    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {
        if (pSmall != null) {
            pSmall.setX(e.getX());
            pSmall.setY(e.getY());
        }
    }

    @Override
    public void paintEnvironment(Graphics graphics) {
        if (pBig != null) {
            pBig.draw(graphics);
        }

        if (pSmall != null) {
            pSmall.draw(graphics);
        }

    }

}

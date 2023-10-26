/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class keyHandler implements KeyListener {
    
    boolean wPressed,sPressed,aPressed,dPressed,upPressed,downPressed,leftPressed,rightPressed;

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == KeyEvent.VK_W || code == KeyEvent.VK_UP) {
            wPressed = true;
            upPressed = true;
        }else if(code == KeyEvent.VK_S || code == KeyEvent.VK_DOWN){
            sPressed = true;
            downPressed = true;
        }else if(code == KeyEvent.VK_A || code == KeyEvent.VK_LEFT){
            aPressed = true;
            leftPressed = true;
        }else if(code == KeyEvent.VK_D || code == KeyEvent.VK_RIGHT){
            dPressed = true;
            rightPressed = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == KeyEvent.VK_W || code == KeyEvent.VK_UP) {
            wPressed = false;
            upPressed = false;
        }else if(code == KeyEvent.VK_S || code == KeyEvent.VK_DOWN){
            sPressed = false;
            downPressed = false;
        }else if(code == KeyEvent.VK_A || code == KeyEvent.VK_LEFT){
            aPressed = false;
            leftPressed = false;
        }else if(code == KeyEvent.VK_D || code == KeyEvent.VK_RIGHT){
            dPressed = false;
            rightPressed = false;
        }
    }
    
    
    
}

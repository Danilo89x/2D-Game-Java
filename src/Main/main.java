/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Main;

import javax.swing.JFrame;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class main {
    
    public static void main(String[] args) {
        JFrame window = new JFrame();
        GamePanel gp = new GamePanel();
        window.setTitle("2D Adventure");
        window.add(gp);
        window.pack();
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(window.EXIT_ON_CLOSE);
        window.setVisible(true);
        gp.startGameThread();
    }

}

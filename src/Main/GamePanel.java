/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Main;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class GamePanel extends JPanel {
        
    final int originalTileSize = 16;
    final int scale = 3;
    final int tileSize = originalTileSize * scale;
    final int screenCol = 16;
    final int screenRow = 12;
    final int screenWidth = screenCol * tileSize;
    final int screenHeight = screenRow * tileSize;

    public GamePanel() {
    this.setPreferredSize(new Dimension(screenWidth, screenHeight));
    this.setBackground(Color.BLACK);
    
    }
    
    
}

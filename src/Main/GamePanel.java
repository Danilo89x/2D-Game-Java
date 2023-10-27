/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Main;

import Enity.Player;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class GamePanel extends JPanel implements Runnable{
        
    final int originalTileSize = 16;
    final int scale = 3;
    public final int tileSize = originalTileSize * scale;
    final int screenCol = 16;
    final int screenRow = 12;
    final int screenWidth = screenCol * tileSize;
    final int screenHeight = screenRow * tileSize;
    int x = 100;
    int y = 100;
    int speed = 4;
    
    public keyHandler kh = new keyHandler();
    Thread gameThread;
    Player player = new Player(this);

    public GamePanel() {
    this.setPreferredSize(new Dimension(screenWidth, screenHeight));
    this.setBackground(Color.BLACK);
    this.setDoubleBuffered(true);
    this.addKeyListener(kh);
    this.setFocusable(true);
    
    }
    public void update(){
       player.update();
        
    }
    public void startGameThread(){
       gameThread = new Thread(this);
       gameThread.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
        player.drawPlayerImages(g);
    }

    @Override
    public void run() {
        double drawInterval = 1000000000/60;
        double nextDrawTime = System.nanoTime() + drawInterval;
        while(gameThread != null){
        update();
        repaint();
            double remmainingTime = nextDrawTime - System.nanoTime();
            remmainingTime /= 1000000;
            if (remmainingTime < 0) {
                remmainingTime = 0;
            }
            try {
                Thread.sleep((long) remmainingTime);
                nextDrawTime += drawInterval;
            } catch (InterruptedException ex) {
                Logger.getLogger(GamePanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
    
    
}

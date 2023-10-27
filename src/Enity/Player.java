/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enity;

import Main.GamePanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Player extends Entity {

    GamePanel gp;

    public Player(GamePanel gp) {

        this.gp = gp;
        setDefaultValue();
        getPlayerImages();
    }

    public void setDefaultValue() {
        x = 100;
        y = 100;
        speed = 4;
        direction = "down";
    }

    public void getPlayerImages() {
        try {
            up1 = ImageIO.read(getClass().getResourceAsStream("/images/boy_up_1.png"));
            up2 = ImageIO.read(getClass().getResourceAsStream("/images/boy_up_2.png"));
            down1 = ImageIO.read(getClass().getResourceAsStream("/images/boy_down_1.png"));
            down2 = ImageIO.read(getClass().getResourceAsStream("/images/boy_down_2.png"));
            left1 = ImageIO.read(getClass().getResourceAsStream("/images/boy_left_1.png"));
            left2 = ImageIO.read(getClass().getResourceAsStream("/images/boy_left_2.png"));
            right1 = ImageIO.read(getClass().getResourceAsStream("/images/boy_right_1.png"));
            right2 = ImageIO.read(getClass().getResourceAsStream("/images/boy_right_2.png"));

        } catch (IOException ex) {
            Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void update() {
        if (gp.kh.wPressed || gp.kh.upPressed) {
            y -= speed;
            direction = "up";
        } else if (gp.kh.sPressed || gp.kh.downPressed) {
            y += speed;
            direction = "down";
        } else if (gp.kh.aPressed || gp.kh.leftPressed) {
            x -= speed;
            direction = "left";
        } else if (gp.kh.dPressed || gp.kh.rightPressed) {
            x += speed;
            direction = "right";
        }
        count++;
        if (count > 12) {
            spriteNum = spriteNum == 1 ? 2 : 1;
            count =0;
        }
    }

    public void drawPlayerImages(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        BufferedImage image = null;

        switch (direction) {
            case "up":
                image = spriteNum == 1 ? up1 : up2;
                break;
            case "down":
                image = spriteNum == 1 ? down1 : down2;
                break;
            case "left":
                image = spriteNum == 1 ? left1 : left2;
                break;
            case "right":
                image = spriteNum == 1 ? right1 : right2;
                break;
        }
        g2.drawImage(image, x, y, gp.tileSize, gp.tileSize, null);
    }

}

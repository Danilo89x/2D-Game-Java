/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Enity;

import java.awt.image.BufferedImage;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Entity {
    
    public int x;
    public int y;
    public int speed;
    public BufferedImage up1,up2,down1,down2,left1,left2,right1,right2;
    String direction;
    public int spriteNum = 1;
    public int count;

}

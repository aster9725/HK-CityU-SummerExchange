/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tutorial02;

/**
 *
 * @author SummerWorkShop
 */
public class Shape {
    public int height;
    public char drawChar;
    
    public static final int MID = 40;
            
    public void changeHeight(int h){
        height = h;
    }
      
    public void changeChar(char c){
        drawChar = c;
    }
    
    public int getHeight(){
        return height;
    }
    
    public char getChar(){
        return drawChar;
    }
    
    public void drawShape() {

    }
}
 
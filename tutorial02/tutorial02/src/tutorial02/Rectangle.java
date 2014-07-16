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
public class Rectangle extends Shape{

    private int width;
    
    private static final int MID = 40;

    public Rectangle(int w, int h) {
        width = w;
        height = h;
        drawChar = '*';
    }
    
    public void changeWidth(int w){
        width = w;
    }
    
    public int getWidth(){
        return width;
    }
    
    public void drawShape() {
        for(int i=0;i<height;i++){
            drawChar(' ',MID-width/2);
            drawChar(drawChar,width);
            System.out.println();
        }
    }
    
    private void drawChar(char c, int num){
        for(int i=0;i<num;i++)
            System.out.print(c);
    }
    
    @Override
    public String toString(){
        return "Rectangle (width:"+width+", height:"+height+", char:"+drawChar+")";
    }
    
}

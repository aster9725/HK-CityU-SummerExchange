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
public class Triangle extends Shape{
    
    public Triangle(int h) {
        height = h;
        drawChar = '*';
    }
    
    
    public void drawShape() {
        for(int i=1;i<=height;i++){
            drawChar(' ',MID-i);
            drawChar(drawChar,i*2-1);
            System.out.println();
        }
    }
    
    private void drawChar(char c, int num){
        for(int i=0;i<num;i++)
            System.out.print(c);
    }
    
    @Override
    public String toString(){
        return "Triangle (height:"+height+", char:"+drawChar+")";
    }
    
}

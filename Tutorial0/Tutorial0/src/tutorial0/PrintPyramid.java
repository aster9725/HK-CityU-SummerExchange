/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tutorial0;

/**
 *
 * @author SummerWorkShop
 */
public class PrintPyramid {

    public void printPyrimid(int h){        
        if(h>15||h<1)
            return;
        for(int i = h;i>0;i--){
            for(int b = i;b>0;b--){
                System.out.print("   ");
            }
            for(int j=h-i;j>0;j--)
                System.out.format("%3d", j+1);
            
            for(int k=1;k<=(h+1-i);k++)
                System.out.format("%3d", k);
            
            System.out.println();
        }
    }
}

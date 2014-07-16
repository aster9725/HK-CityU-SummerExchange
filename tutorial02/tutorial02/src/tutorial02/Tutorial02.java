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
public class Tutorial02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangle r1 = new Rectangle(1, 1);
        System.out.println(r1);
        r1.drawShape();
        
        Rectangle r2 = new Rectangle(1, 1);
        r2.changeWidth(3);
        r2.changeHeight(3);
        System.out.println(r2);
        r2.drawShape();
        
        Rectangle r3 = new Rectangle(10, 5);
        r3.changeChar('#');
        System.out.println(r3);
        r3.drawShape();
        
        Triangle t1 = new Triangle(5);
        System.out.println(t1);
        t1.drawShape();
        
        Triangle t2 = new Triangle(10);
        t2.changeChar('@');
        System.out.println(t2);
        t2.drawShape();
        
        Shape[] ary = new Shape[5];
        ary[0] = r1;
        ary[1] = t2;
        ary[2] = r3;
        ary[3] = t1;
        ary[4] = r2;
        
        for(int i=0;i<ary.length;i++){
            System.out.println(ary[i]);
            ary[i].drawShape();
        }
        
    }
    
}

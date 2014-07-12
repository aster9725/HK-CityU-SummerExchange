/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tutorial01;

/**
 *
 * @author SummerWorkShop
 */
public class Mycircle {
    public double radius;
    
    public Mycircle(double r){
        radius = r;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    
    public double getcircumference(){
        return 2*Math.PI*radius;
    }
}

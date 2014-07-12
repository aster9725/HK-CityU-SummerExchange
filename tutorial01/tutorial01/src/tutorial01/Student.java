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
public class Student {
    private String name;
    private double CGPA;
    private double SGPA[];
    
    public Student(String name,double sgpa[]){
        SGPA = new double[6];
        this.name = name;
        this.SGPA = sgpa.clone();
        calcCGPA();
    }
    
    private void calcCGPA(){
        double tmp = 0;
        for(int i=0;i<SGPA.length;i++)
            tmp += SGPA[i];
        CGPA = tmp/6;
    }
    
    public double getCGPA(){
        return CGPA;
    }
    
    public String getHonor(){
        if(CGPA > 3.6)
            return "First Class";
        else if(CGPA>3.2)
            return "Second Upper Class";
        else if(CGPA > 2.8)
            return "Second Lower Class";
        else
            return "--";
    }
}

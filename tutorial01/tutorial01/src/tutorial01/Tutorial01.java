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
public class Tutorial01 {

    /**
     * @param args the command line arguments
     */
    
    static int num=0;

    public Tutorial01() {
        Tutorial01.num++;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Problem 1");
        
        Mycircle circle;
        for(int i=10;i<=100;i=i+10){
            circle = new Mycircle(i);
            System.out.println(circle.radius);
            System.out.println(circle.getArea());
            System.out.println(circle.getcircumference());
            System.out.println();
        }
        
        
        
        
        
        System.out.println("Problem 2 and 3");
        
        double[][] sgpa = {{1.5,3.6,3.2,2.8,3.1,3.5},{4.0,3.5,3.2,3.8,3.9,3.7}};
        Student Andy = new Student("Andy",sgpa[0]);
        Student Jacky = new Student("Jacky",sgpa[1]);
        
        System.out.println("Andy's honor : " + Andy.getHonor() + '(' + Andy.getCGPA() + ')');
        System.out.println("Jacky's honor : " + Jacky.getHonor() + '(' + Jacky.getCGPA() + ')' + '\n');
        
        
        
        
        
        System.out.println("\nProblem 4");
        
        int a=0;
        int b=1;
        System.out.format("%d %d\n",a,b);
        a = swap(b,b=a);
        System.out.format("%d %d\n\n",a,b);
        
        
        
        
        
        System.out.println("Problem 5");
        
        Tutorial01 tut1 = new Tutorial01();
        Tutorial01 tut2 = new Tutorial01();
        Tutorial01 tut3 = new Tutorial01(); 
        System.out.println("it's increase to 3\n");
        
        
        
        
        
        System.out.println("Problem 6");
        //CreditCardStatement.printStatement();
        System.out.println();
        
        
        
        
        
        System.out.println("Problem 7");
        
        CreditCardStatement[] Statement = new CreditCardStatement[3];
        for(int i=0;i<3;i++)
            Statement[i].printStatement(); //change printStatement and variables to static method
        
        
        
        System.out.println("Problem 8");
        
        int[][] array1 = {{5,15},{2,22}};
        Matrix m1 = new Matrix(array1);
        Matrix m2 = new Matrix(new int[][]{{0,6},{7,8}}); // anonymous array
        
        m2.setElement(0, 0, 5);
        System.out.println("First matrix:");
        
        m1.printMatrix();
        System.out.println("Second matrix:");
        
        m2.printMatrix();
        System.out.println("Result of addition:");
        if(m1.addMatrix(m2))
            m1.printMatrix();
        else
            System.out.println("Invalid matrix size.");
        
    }
    
    /** Swap two variables */ 
    public static int swap(int n1, int n2) { 
        return n1;
    }
}

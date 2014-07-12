/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tutorial0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

/**
 *
 * @author SummerWorkShop
 */
public class Tutorial0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        System.out.println("Problem 2");
        
        char a = 'A';
        for(int i = a;i<='Z';i++,a++){
            System.out.print(a);
        }
        
        
        System.out.println("\n");
        System.out.println("Problem 3");
        
        int ary1[] = {1,1,2,2,1};
        int ary2[] = {1,1,2,2,2,1};
        int ary3[] = {1,1,1,2,2,2,1};
        
        System.out.println(noTriples(ary1));
        System.out.println(noTriples(ary2));
        System.out.println(noTriples(ary3));
        
        
        System.out.println();
        System.out.println("Problem 4");
        
        int above = 0;
        int below = 0;
        
        for(int i=0;i<100000;i++){
            if(Math.random() >= 0.5)
                above++;
            else
                below++;
        }
        
        System.out.println("above : "+above);
        System.out.println("below : "+below);
        
        
        
        System.out.println();
        System.out.println("Problem 5");
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintPyramid pp = new PrintPyramid();
        
        //System.out.print("Input Height : ");
        //pp.printPyrimid(Integer.parseInt(br.readLine()));
        pp.printPyrimid(Integer.parseInt(JOptionPane.showInputDialog("Input Height")));
        
        
    }
    
    public static boolean noTriples(int[] ary){
        int triple = 0;
        int preInt = ary[0];
        
        for(int i=1;i<ary.length;i++){
            if(preInt == ary[i]){
                triple++;
            }
            else
                triple = 0;
            
            if(triple == 2)
                return false;
            
            preInt = ary[i];
        }
        
        return true;
    }
    
}

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
public class Matrix {
    
    int[][] element;

    public Matrix(int col, int row) {
        element = new int[col][row];
        
    }
    
    public Matrix(int[][] ary){
        element = new int[ary.length][ary[0].length];
        setAllElement(ary);
    }
    
    private void resetMatrix(){
        for(int i=0;i<element.length;i++)
            for(int j=0;j<element[0].length;j++)
                element[i][j] = 0;
    }
    
    public boolean addMatrix(Matrix matrix) {
        int[][] mat = matrix.getAllElement();
        int row1 = mat.length; 
        int col1 = mat[0].length; 
        
        if (row1 == element.length && col1 == element[0].length) { 
            for (int i = 0; i < row1; i++) { 
                for (int j = 0; j < col1; j++) {
                    element[i][j] += mat[i][j];
                } 
            } return true; 
        } else { 
            return false; 
        } 
    }

    public void printMatrix() {
        int row = element.length; 
        int col = element[0].length;

        for (int i = 0; i < row; i++) { 
            for (int j = 0; j < col; j++) { 
                System.out.printf("[%02d]", element[i][j]);
            } System.out.println("");
        } 
    }
    
    public int[][] getAllElement(){
        return element;
    }
    
    public int getElement(int row,int col){
        return element[row][col];
    }
    
    public void setAllElement(int[][] mat){
        if(element.length != mat.length || element[0].length != mat[0].length)
            return;
        
        resetMatrix();
        for(int i=0;i<element.length;i++)
            for(int j=0;j<element[0].length;j++)
                element[i][j] = mat[i][j];
    }
    
    public void setElement(int row, int col, int val){
        element[row][col] = val;
    }
}

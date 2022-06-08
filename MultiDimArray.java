/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author diegobarbosa
 */
public class MultiDimArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        int[][] myNumbers = {{1,2,3,4},{5,6,7,8}};
        int x=myNumbers[1][2];
        System.out.println(x);
        System.out.println(myNumbers.length);
        //printing numbers in the array
        System.out.println("Let's print the numbers in the array: ");
      for (int i = 0; i < myNumbers.length; ++i) {
      for(int j = 0; j < myNumbers[i].length; ++j) {
        System.out.println(myNumbers[i][j]);
      }
    }
    }
}

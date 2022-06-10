/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author diegobarbosa
 */
public class Overloading {

    static int plusMethod(int x, int y, int z){
        return x+y+z;
    }
    static double plusMethod(double x, double y, double z){
        return x+y+z;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        int res=plusMethod(2,1,4);
        double res1=plusMethod(2.1,1.8,4.2);
        System.out.println(res);
        System.out.println(res1);
        // TODO code application logic here
    }
}

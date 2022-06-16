/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author diegobarbosa
 */
public class Suma {

    public int sum(int x, int y){
        return (x+y);
    }
    
    public int sum(int x, int y, int z){
        return (x+y+z);
    }
    public double sum(double x, double y){
        return (x+y);
    }
            
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Suma s=new Suma();
        System.out.println(s.sum(10,20));
        System.out.println(s.sum(10, 20,30));
        System.out.println(s.sum(10.5,20.5));
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author diegobarbosa
 */
public class Recursion {

    public static int sum(int start, int end){
        if(end>start){
            return end+sum(start,end-1);
        }
        else{
            return end;
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        int result =sum(5,10);
        System.out.println(result);
    }
}

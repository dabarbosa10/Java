/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author diegobarbosa
 */
public class Strings {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        String greeting="Hello"; //String in Java is an object
        //lenght of a string:
        String txt= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the text is: " + txt.length());
        
        String ttx="Hello World";
        System.out.println(ttx);
        System.out.println(ttx.toUpperCase());
        System.out.println(ttx.toLowerCase());
        
        //The indexOf() method return the index(position)of the first occurrence.
        String txt1="Please locate where 'locate' occurs!";
        System.out.println(txt1.indexOf("locate"));
        
        
    }
}

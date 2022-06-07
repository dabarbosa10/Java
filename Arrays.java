/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author diegobarbosa
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        String[] cars= {"Mercedes", "Scania", "Volvo", "Isuzu"};
        System.out.println(cars[0]);
        //change an array element
        System.out.println("Changing the value of an array");
        cars[0]="Volkswagen";
        System.out.println(cars[0]);
        //Now counting the number of elements
        System.out.println(cars.length);
        //Looping throungh an Array:
        System.out.println("Let's create a loop through an Array");
        for(int i=0;i<cars.length;i++){
            System.out.println(cars[i]);
            
        }
        //another way to loop through an array
        int j=0;
        for(String i: cars){
            System.out.println("looping: "+j+" "+i);
            j++;
        }
                
    }
}

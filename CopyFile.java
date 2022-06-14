/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author diegobarbosa
 */
import java.io.*;
public class CopyFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException{
        // TODO code application logic here
        FileInputStream in=null;
        FileOutputStream out=null;
        try{
            in=new FileInputStream("input.txt");
            out=new FileOutputStream("output.txt");
            int c;
            while((c=in.read())!=-1){
                out.write(c);
            }
        }
        finally{
            if(in!=null){
                in.close();
            }
            if(out!=null){
                out.close();
            }
        }
        
    }
}

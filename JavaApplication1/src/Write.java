
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laboratorio
 */
public class Write {
    public static void writefile(String nome, String email){
      try {
        File myObj = new File(nome+".txt");
        if (myObj.createNewFile()) {
            System.out.println("File created: " + myObj.getName());
        } else {
            System.out.println("File already exists.");
        }
      } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
      
        }
      try {
        FileWriter myWriter = new FileWriter(nome+".txt");
        myWriter.write(" email:"+email+" nome:"+nome);
        myWriter.close();
        System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();  
        
        }
        
    }
    public static void writefile(String nome){
      try {
        File myObj = new File(nome+".txt");
        if (myObj.createNewFile()) {
            System.out.println("File created: " + myObj.getName());
        } else {
            System.out.println("File already exists.");
        }
       } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
      
        }
      try {
        FileWriter myWriter = new FileWriter(nome+".txt");
        myWriter.write(" nome:"+nome);
        myWriter.close();
        System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();  
        
        }
        
    }
}

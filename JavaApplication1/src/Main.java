//import java.io.File;
//import java.io.FileWriter;
//import java.io.IOException;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laboratorio
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("digite o seu nome");
        String email = JOptionPane.showInputDialog("digite o seu email");
        Pessoa pessoa = new Pessoa(nome,email);
        Write write = new Write();
        
        int valor = Integer.parseInt(JOptionPane.showInputDialog("cadastrar"+
                "apenas o nome digite 1 \n"+"para cadastrar o nome e o email"+
                " digte 2"));
        
        switch (valor){
            case 1:
                write.writefile(nome);
                System.out.println(nome+" foi cadastrado");
               
               
                break;
            case 2:
                write.writefile(nome,email);
                System.out.println(nome+" e "+email+" foram cadastrados");
        }
        
      
    }
    
}

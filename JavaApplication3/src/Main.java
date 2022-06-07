import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.Date;
import javax.swing.JOptionPane;
public class Main {

    
    public static void main(String[] args) {
        
        try {
            Socket client = new Socket("localhost",3000);
            ObjectInputStream entrada = new ObjectInputStream(client.getInputStream());
            Date data_atual = (Date) entrada.readObject();
            JOptionPane.showMessageDialog(null, "data recebida"+data_atual.toString());
            entrada.close();

        }catch(Exception e){
            System.out.println("erro 300");
        }
    }
    
}

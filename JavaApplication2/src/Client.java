import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       try {
           ServerSocket servidor = new ServerSocket(3000);
           while(true){
               Socket client = servidor.accept();
               System.out.println("cliente conectado: "+ client.getInetAddress().getAddress());
               ObjectOutputStream saida = new ObjectOutputStream(client.getOutputStream());
               saida.flush();
               saida.writeObject(new Date());
               saida.close();
               client.close();
           }
       }catch(Exception e){
           System.out.println("erro 300");
       }
    }
    
}

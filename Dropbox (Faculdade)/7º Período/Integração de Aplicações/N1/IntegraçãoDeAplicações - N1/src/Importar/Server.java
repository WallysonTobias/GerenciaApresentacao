package Importar;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Server extends Thread{

    private ServerSocket serverSocket;
    private static Server instance;

    public Server(int port){
        try {        
            serverSocket = new ServerSocket(port);
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void run() {
        while (true) {
            try {
                Socket socket = serverSocket.accept();
                Server(socket);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static Server getInstancia(int port) {
        if (instance == null) {
            instance = new Server(port);
        }
        return instance;
    }

    private void Server(Socket clientSock) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(clientSock.getInputStream());
        FileOutputStream fileOutputStream = new FileOutputStream("NovoXML.xml");
        byte[] bytes = new byte[4096];

        int count;
        while((count = dataInputStream.read(bytes)) > 0){
            fileOutputStream.write(bytes, 0, count);
        }
        
        fileOutputStream.close();
        dataInputStream.close();

        if (new File("NovoXML.xml").exists()) {
            JOptionPane.showMessageDialog(null, "O ARQUIVO FOI RECEBIDO DO CLIENTE", "OBSERVAÇÃO", JOptionPane.INFORMATION_MESSAGE);
        }

    }
        
}

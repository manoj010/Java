import java.io.IOException;
import java.net.ServerSocket;

public class Server {
    public static void main(String[] args) {
        System.out.println("Port 1234 is open for connection...");
        try {
            ServerSocket serverSocket = new ServerSocket(1234);
            serverSocket.accept();
            System.out.println("A new client is connected");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
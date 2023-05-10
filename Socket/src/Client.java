import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 1234);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
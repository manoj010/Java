import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 1234);

            InputStream inputStream = socket.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);

            while (true) {
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                System.out.println(bufferedReader.readLine());
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
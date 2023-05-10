import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {

        boolean sending = true;

        System.out.println("Port 1234 is open for connection...");
        try {

            ServerSocket serverSocket = new ServerSocket(1234);
            Socket socket = serverSocket.accept();

            System.out.println("A new client is connected");

            OutputStream outputStream = socket.getOutputStream();
            PrintWriter printWriter = new PrintWriter(outputStream, true);

            Scanner scanner = new Scanner(System.in);

            while(sending) {
                System.out.println("Enter a message: ");
                String message = scanner.nextLine();
                if (message == "stop") {
                    sending = false;
                } else {
                    printWriter.println(message);
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
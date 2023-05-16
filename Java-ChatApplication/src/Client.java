import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("172.25.20.119",9099);

            //asking user input with buffer
            BufferedReader userInputBuffer = new BufferedReader(new InputStreamReader(System.in));

            //taking data from socket buffer
            BufferedReader socketBuffer = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            OutputStream outputStream = socket.getOutputStream();
            PrintWriter printWriter = new PrintWriter(outputStream);

            String sendingMessage ,receivingMessage;

            while(true){
                receivingMessage = socketBuffer.readLine();
                System.out.println("server :" + receivingMessage);

                sendingMessage = userInputBuffer.readLine();
                printWriter.println(sendingMessage);
                printWriter.flush();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}

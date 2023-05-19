import java.net.MalformedURLException;
import java.rmi.*;

public class Client {
    public static void main(String[] args) throws MalformedURLException, NotBoundException, RemoteException {
        //172.25.21.200
        HelloService obj = (HelloService) Naming.lookup("rmi://localhost:5009/sum");
        System.out.println(obj.add(5, 3));
    }
}

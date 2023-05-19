import java.rmi.Remote;
import java.rmi.RemoteException;

public interface HelloService extends Remote {
    public String add(int x, int y) throws RemoteException;
}

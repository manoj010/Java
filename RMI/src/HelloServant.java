import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloServant extends UnicastRemoteObject implements HelloService {
    protected HelloServant() throws RemoteException {
        super();
    }

    @Override
    public String add(int x, int y) throws RemoteException {
        return ("Sum = " + (x + y));
    }
}

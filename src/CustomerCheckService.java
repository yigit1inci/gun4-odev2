import jdk.jshell.spi.ExecutionControl;
import org.apache.axis.AxisFault;

import javax.xml.rpc.ServiceException;
import java.net.MalformedURLException;
import java.rmi.RemoteException;

public interface CustomerCheckService {

    boolean CheckIfRealPerson(Customer customer) throws RemoteException, MalformedURLException, ServiceException;



}

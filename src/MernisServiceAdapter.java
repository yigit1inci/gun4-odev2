import coffeepackage.KPSPublicLocator;
import coffeepackage.KPSPublicSoap_BindingStub;
import coffeepackage.KPSPublicSoap_PortType;
import org.apache.axis.AxisFault;

import javax.xml.rpc.ServiceException;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

public class MernisServiceAdapter implements CustomerCheckService {
    private KPSPublicSoap_PortType port;
    @Override
    public boolean CheckIfRealPerson(Customer customer) throws AxisFault, MalformedURLException, ServiceException {
        KPSPublicLocator locator = new KPSPublicLocator();
        final URL url = new URL("https://tckimlik.nvi.gov.tr/Service/KPSPublic.asmx?wsdl");
        port = locator.getKPSPublicSoap(url);
        boolean result=true;

        try {
            result = port.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),
                    customer.getFirstName(), customer.getLastName(), customer.dateOfBirth.getYear());

        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return result;

    }
}

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args)  {

    BaseCustomerManager customerManager = new NeroCustomerManager();
    Customer customer1 = new Customer(1,"İnci", "Yiğit", LocalDate.of(1993,7,17),"11395471428");

    BaseCustomerManager customerManager2= new StarbucksCustomerManager(new MernisServiceAdapter());
    Customer customer2=new Customer(2,"Işıl","Yiğit",LocalDate.of(2001,11,10),"45029408898");

        try {
            customerManager.save(customer1);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            customerManager2.save(customer1);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }
}

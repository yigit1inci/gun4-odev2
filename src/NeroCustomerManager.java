public class NeroCustomerManager extends BaseCustomerManager {
    @Override
    public void save(Customer customer) {
        System.out.println("Save to db: " + customer.getFirstName());
    }
}

public class StarbucksCustomerManager extends BaseCustomerManager {

    private CustomerCheckService customerService;

    public StarbucksCustomerManager(CustomerCheckService customerService) {
        this.customerService = customerService;
    }

    @Override
    public void save(Customer customer) throws Exception {

        if (customerService.CheckIfRealPerson(customer)) {
            super.save(customer);
            System.out.println("Müşteri kaydedildi "+customer.getFirstName());
        } else {
            throw new Exception("Not a valid person");
        }
    }


}

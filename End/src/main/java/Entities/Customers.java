package Entities;
import java.util.ArrayList;
import java.util.List;
public interface Customers {
    public Customer getAddMoney(Double money,String ID);
    List<Customer> getAllCustomers();
    public Customer getCustomer(String ID);

    ArrayList<Category> getInterestingproductanalyzer();
}

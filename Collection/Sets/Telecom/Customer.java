package Collection.Sets.Telecom;

import java.util.ArrayList;
import java.util.List;

import Oops.Abstraction.TelecomServiceManagement.TelecomService;

public class Customer {

    private String customerName;
    private String customerId;

    private List<TelecomService> servicesAvailed;

    public Customer(String customerName, String customerId) {
        this.customerName = customerName;
        this.customerId = customerId;
        servicesAvailed = new ArrayList<>();
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public List<TelecomService> getServicesAvailed() {
        return servicesAvailed;
    }

    public void setServicesAvailed(List<TelecomService> servicesAvailed) {
        this.servicesAvailed = servicesAvailed;
    }

    public void addService(TelecomService service) {
        servicesAvailed.add(service);
    }

    @Override
    public String toString() {
        return "Customer [customerName=" + customerName + ", customerId=" + customerId + ", servicesAvailed="
                + servicesAvailed + "]";
    }

    

}

package Oops.Abstraction.TelecomServiceManagement;

import Oops.Abstraction.TelecomServiceManagement.Exceptions.InvalidServiceDurationException;
import Oops.Abstraction.TelecomServiceManagement.Interfaces.RenewableInterface;

public class PostpaidService extends TelecomService implements RenewableInterface {
    
    public PostpaidService(String serviceName, double serviceCost, int serviceDuration, double monthlyLimit) throws Exception {
        super(serviceName, serviceCost, serviceDuration);
        if(serviceDuration < 0) {
            throw new InvalidServiceDurationException("Service duration must be positive");
        }
        this.monthlyLimit = monthlyLimit;
    }

    private double monthlyLimit;    

    @Override
    public double calculateTotalCost(int days) {
        double totalCost = this.getServiceCost() * days;
        if(days > monthlyLimit) totalCost += 20;
        return totalCost;
    }

    
    @Override
    public String getServiceDetail() {
        return "PostpaidService [monthly Limit: " + monthlyLimit + ", Service Name: " + getServiceName()
                + ",Service Cost: " + getServiceCost() + ",Service Duration: " + getServiceDuration() + "]";
    }

    


    @Override
    public String toString() {
        return "PostpaidService [monthlyLimit=" + monthlyLimit + ", getServiceDetail()=" + getServiceDetail()
                + ", getServiceName()=" + getServiceName() + ", getServiceCost()=" + getServiceCost()
                + ", getServiceDuration()=" + getServiceDuration() + "]";
    }


    @Override
    public void renewService(int additionalDays) throws InvalidServiceDurationException {
        if(additionalDays < 0) 
            throw new InvalidServiceDurationException("Service duration must be positive");
        int newDuration = this.getServiceDuration() + additionalDays;
        System.out.println("Cost: " + calculateTotalCost(additionalDays));
        this.setServiceDuration(newDuration);
    }
    
}

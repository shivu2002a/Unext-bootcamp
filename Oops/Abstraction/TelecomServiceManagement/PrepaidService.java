package Oops.Abstraction.TelecomServiceManagement;

import Oops.Abstraction.TelecomServiceManagement.Interfaces.RenewableInterface;

public class PrepaidService extends TelecomService implements RenewableInterface {
    
    public PrepaidService(String serviceName, double serviceCost, int serviceDuration, double dataBalance) {
        super(serviceName, serviceCost, serviceDuration);
        this.dataBalance = dataBalance;
    }

    private double dataBalance;    

    @Override
    public double calculateTotalCost(int days) {
        double totalCost = this.getServiceCost() * days;
        if(dataBalance < 1) totalCost += 10;
        return totalCost;
    }

    
    @Override
    public String getServiceDetail() {
        return "PrepaidService [dataBalance: " + dataBalance + ", Service Name: " + getServiceName()
                + ",Service Cost: " + getServiceCost() + ",Service Duration: " + getServiceDuration() + "]";
    }

    


    @Override
    public String toString() {
        return "PrepaidService [dataBalance=" + dataBalance + ", getServiceDetail()=" + getServiceDetail()
                + ", getServiceName()=" + getServiceName() + ", getServiceCost()=" + getServiceCost()
                + ", getServiceDuration()=" + getServiceDuration() + "]";
    }


    @Override
    public void renewService(int additionalDays) {
        System.out.println("Total cost: " + calculateTotalCost(additionalDays));
        int newDuration = this.getServiceDuration() + additionalDays;
        this.setServiceDuration(newDuration);
    }

    
    
}

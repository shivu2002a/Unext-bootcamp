package Oops.Abstraction.TelecomServiceManagement;

import Oops.Abstraction.TelecomServiceManagement.Exceptions.InvalidDiscountException;

public abstract class TelecomService {
    
    private String serviceName;
    private double serviceCost;
    private int serviceDuration;
    

    public TelecomService(String serviceName, double serviceCost, int serviceDuration) {
        this.serviceName = serviceName;
        this.serviceCost = serviceCost;
        this.serviceDuration = serviceDuration;
    }
    
    public abstract double calculateTotalCost(int days);
    public abstract String getServiceDetail();

    public double applyDiscount(double discountPercentage) throws InvalidDiscountException {
        if(discountPercentage < 0 || discountPercentage > 100) {
            throw new InvalidDiscountException("Discount must be within [0, 100]");
        }
        serviceCost = serviceCost - serviceCost * ( discountPercentage * 0.01 );
        return serviceCost;
    }
    public String getServiceName() {
        return serviceName;
    }
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }
    public double getServiceCost() {
        return serviceCost;
    }
    public void setServiceCost(double serviceCost) {
        this.serviceCost = serviceCost;
    }
    public int getServiceDuration() {
        return serviceDuration;
    }
    public void setServiceDuration(int serviceDuration) {
        this.serviceDuration = serviceDuration;
    }

    @Override
    public String toString() {
        return "TelecomService [serviceName=" + serviceName + ", serviceCost=" + serviceCost + ", serviceDuration="
                + serviceDuration + "]";
    }

    
    
}

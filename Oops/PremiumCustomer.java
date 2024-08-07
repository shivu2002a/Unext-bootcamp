package Oops;

public class PremiumCustomer extends Customer {
    
    private double discountRate;
    private String premiumLevel;

    PremiumCustomer(double dr, String premLevel){
        super();
        this.discountRate = dr;
        this.premiumLevel = premLevel;
    }

    public static void main(String args[]) {
        PremiumCustomer pCustomer = new PremiumCustomer(20, "Gold");
        pCustomer.setFname("Nandan");


    }

}

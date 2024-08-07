package Oops.Abstraction.Assignment;

public abstract class PrepaidCard {
    
    int cardNo;
    double availableBalance;
    abstract boolean swipeCard(double amount);

    public PrepaidCard(int cardNo, double balance) {
        this.cardNo = cardNo;
        this.availableBalance = balance;
    }

    public void rechargeCard(double amount) {
        this.availableBalance += amount;

    }
    
    @Override
    public String toString() {
        return "[ CardNo : " + cardNo + ", available balance: " + availableBalance + "]";
    }
    
}

class TravelCard extends PrepaidCard {

    public int rewardPoints;

    public TravelCard(int cardNo, double balance) {
        super(cardNo, balance);
    }

    @Override
    boolean swipeCard(double amount) {
        amount *= 80;
        double processingfee = .05 * amount;
        if(amount <= (this.availableBalance + processingfee)) {
            availableBalance -= (amount + processingfee);
            rewardPoints += (amount / 100) * 5;
            return true;
        }
        return false;
    }

    



}

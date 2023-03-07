import hb.PaymentMethod;

public class PayBuddyMethod implements PaymentMethod {

    private String email;

    public PayBuddyMethod(String email) {
        this.email = email;
    }

    @Override
    public boolean pay(double amt) {
        System.out.println("Confirming payment through PayBuddy");
        System.out.println("Amount: " + amt);
        System.out.println("Using email: " + email);
        return true;
    }
}


public class pmFactory {

    public PaymentMethod createPM(String choice) throws IllegalArgumentException {
        PaymentMethod pm;
        switch (choice) {
            case "c":
                pm = new creditCardMethod();
                break;
            case "z":
                pm = new zenMoMethod();
                break;
            case "p":
                pm = new PayBuddyMethod("example@paybuddy.com");
                break;
            default:
                throw new IllegalArgumentException("Invalid payment method code");
        }

        return pm;
    }
}


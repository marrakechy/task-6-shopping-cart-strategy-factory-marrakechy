public class pmFactory {

    public PaymentMethod createPM(String choice){
        PaymentMethod pm;
        if (choice.equals("z")){
            pm = new zenMoMethod();
        }
        else{
            pm = new creditCardMethod();
        }
        return pm;
    }
}

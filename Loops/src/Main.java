public class Main {
    public static void main(String[] args) {
        for(double rate  = 7.5; rate <= 10.0; rate += 0.25){
            double interestAmount = calculateInterest(100.00 , rate);
            if(interestAmount > 8.5){
                break;
            }
            System.out.println(" $100,00 at " + rate + "% interest = $ " + interestAmount);
        }

    }

    public static double calculateInterest(double amount, double interesRate){
        return (amount * (interesRate / 100));
    }
}
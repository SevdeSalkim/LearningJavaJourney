public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlace(3.1756, 3.175));
        System.out.println(areEqualByThreeDecimalPlace(3.0, 3.0));
    }


    public static boolean areEqualByThreeDecimalPlace(double number1 , double number2){
        int intNum1 = (int) (number1 * 1000);
        int intNum2 = (int) (number2 * 1000);

        return intNum1 == intNum2;

    }
}

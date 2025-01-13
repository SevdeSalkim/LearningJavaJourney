public class WeekChallenge {
    public static void main(String[] args) {
        printDayOfWeek(0);
        printDayOfWeek(2);
        printDayOfWeek(5);
        printDayOfWeek(8);



    }
    public static void printDayOfWeek(int day) {

        String dayOfWeek = switch (day){
            case 0 -> { yield "Sunday";}
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default ->  "Invalid Day";
        };

        System.out.println(day + " stands for " + dayOfWeek);

    }
}

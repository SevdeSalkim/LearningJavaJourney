public class Main {
    public static void main(String[] args) {
        int value = 3;

        //Traditional Switch Statement
        /*
        switch (value){
            case 1 :
                System.out.println("Value was 1");
                break;
            case 2 :
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Was a 3, a 4, or a 5");
                System.out.println("Actually it was a " + value);
                break;
            default:
                System.out.println("Was not 1 , 2, 3, 4, or 5");
                break;
        }*/

        // Enhanced Switch Statement
        switch (value) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Was a 3, a 4, or a 5");
                System.out.println("Actually it was a " + value);
            }
            default -> System.out.println("Was not 1 , 2, 3, 4, or 5");
        }
        // Valid Switch Value Type:
        // Byte,short,int,char
        // Cannot use long,float,double or boolean or their wrappers

        System.out.println(getQuarter("December"));
    }

    public static  String getQuarter(String month){
        /*switch (month){
            case "January":
            case "February":
            case "March":
                return "1st";
            case "April":
            case "May":
            case "June":
                return "2nd";
            case "July":
            case "Augst":
            case "September":
                return "3rd";
            case "October":
            case "November":
            case "December":
                return "4th";
        }
        return "bad";
    }*/

        return switch (month) {
            case "January", "February", "March" -> "1st";
            case "April", "May", "June" -> "2nd";
            case "July", "Augst", "September" -> "3rd";
            case "October", "November", "December" -> "4th";
            default -> "bad";
        };
    }
}
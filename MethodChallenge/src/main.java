public class main {
    public static void main(String[] args) {
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim",highScorePosition);

        highScorePosition = calculateHighScorePosition(450);
        displayHighScorePosition("Bob",highScorePosition);

    }

    public static void displayHighScorePosition(String playerName , int highScorePosition) {
        System.out.println(playerName + " managed to get position "
                + highScorePosition + " on the high score list");

    }

    public static int calculateHighScorePosition(int playerScore){
        if (playerScore >= 1000){
            return 1;
        } else if (playerScore >= 500){
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        }
        return 4;
    }
}

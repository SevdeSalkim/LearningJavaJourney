public class Challenge {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelComplated = 5;
        int bonus = 100;

        int highScore = newCalculateScore(gameOver,score,levelComplated,bonus);
        System.out.println("The highScore is: " + highScore);

       calculateScore(true,1000,8,2);

    }

    public static void calculateScore(boolean gameOver,int score,int levelCompleted, int bonus) {

        int finalScore = score;

        if (gameOver){
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was: " + finalScore);
        }

    }

    public static int newCalculateScore(boolean gameOver,int score,int levelCompleted, int bonus) {

        int finalScore = score;

        if (gameOver){
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
        }
        return finalScore;
    }
}

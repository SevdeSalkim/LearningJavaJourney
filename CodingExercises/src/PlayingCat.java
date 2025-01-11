public class PlayingCat {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));

    }
    public static boolean isCatPlaying(boolean summer, int temperature) {
        // Yaz mevsimindeysek üst sınır 45, değilsek 35
        int upperLimit = summer ? 45 : 35;

        // Sıcaklık 25 ile üst sınır arasında ise true döndür
        return temperature >= 25 && temperature <= upperLimit;
    }
}

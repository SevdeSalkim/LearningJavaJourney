public class Main {
    public static void main(String[] args) {
        int highScore = 50;
        if (highScore > 25){
            highScore = highScore + 1000;
            System.out.println(highScore);
        }

        int health = 100;

        if((health < 120) && (highScore > 1000)){
            highScore = highScore - 1000;
            System.out.println(highScore);
        }
        /* Bu Java programı, anahtar kelimeler ve mantıksal ifadelerin kullanımını göstermektedir.
         Programda değişkenler, koşullu ifadeler ve mantıksal operatörler kullanılarak belirli koşullara dayalı basit aritmetik işlemler yapılmaktadır.*/
    }
}

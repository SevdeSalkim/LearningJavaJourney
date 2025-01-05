import java.util.Scanner;

public class CiftSayiKontrolu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;

        System.out.println("A tam sayısını giriniz: ");
        a = input.nextInt();

        System.out.println("B tam sayısını giriniz:  ");
        b = input.nextInt();

        if(a % 2 == 0 && b % 2 == 0){
            System.out.println("Her iki sayı da çift.");
        } else {
            System.out.println("En az bir sayı tek.");
        }

        input.close();
    }
}

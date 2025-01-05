import java.util.Scanner;

public class KullanıcıDegerAlma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;

        System.out.println("A sayısını giriniz : ");
        a = input.nextInt();

        System.out.println("B sayısını giriniz : ");
        b = input.nextInt();

        if(a >= 0 && b >= 0){
            System.out.println("Her iki sayı da pozitiftir.");
        }else{
            System.out.println("Her iki sayı da pozitif değildir.");
        }
        input.close();
    }
}

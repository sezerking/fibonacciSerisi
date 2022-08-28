import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 0 1 1 2 3 5 8 13 21 34
        Scanner scn=new Scanner(System.in);
        System.out.println("Kaçıncı defaya kadar bulunsun?: ");
        int defa=scn.nextInt();
        int sayi=1,geciciSayi=0,gecici2=0;

        for (int i = 1; i <=defa ; i++) {

            gecici2=geciciSayi;
            geciciSayi=sayi;

            System.out.println("Toplam: "+sayi);
            sayi=geciciSayi+gecici2;
        }
    }
}

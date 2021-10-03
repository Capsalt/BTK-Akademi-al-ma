package MiniProjeler;

import java.util.Scanner;

public class Proje03 {
    public static void main(String[] args) {
        //Mükemmel Sayılar
        System.out.println("Bir sayı Giriniz");
        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();
        int toplam = 0;

        for (int i=1; i<number; i++){
            if (number%i==0){
                toplam+=i;
            }
        }

        if (toplam==number){
            System.out.println("Girdiğiniz sayı mükemmel sayıdır.");
        }else{
            System.out.println("Girdiğiniz sayı mükemmel sayı değildir.");
        }
    }
}

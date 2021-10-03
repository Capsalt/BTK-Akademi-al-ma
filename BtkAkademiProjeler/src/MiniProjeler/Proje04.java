package MiniProjeler;

import java.util.Scanner;

public class Proje04 {
    public static void main(String[] args) {
        //Sayı Bulma
        System.out.println("Bir sayı Giriniz");
        Scanner scan = new Scanner(System.in);

        int [] numbers = new int[] {3,43,1,5,51,12,9,53,23};
        int aranacak = scan.nextInt();

        boolean varMi = false;

        for (int each:numbers) {
        if (each==aranacak){
            varMi = true;
            break;
        }else {
            varMi = false;
        }
        }

        if (varMi){
            System.out.println("Girdiğiniz sayı mevcuttur.");
        }else{
            System.out.println("Girdiğiniz sayı mevcut değildir.");

        }



    }
}

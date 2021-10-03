package MiniProjeler;

import java.util.Scanner;

public class Proje02 {
    public static void main(String[] args) {
        //Kalın sesli ince sesli harf

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir harf giriniz...");

        String harf = scan.next().toLowerCase();


        if (harf.length()>1){
            System.out.println("Hatalı Giriş");
        }else {

            switch (harf) {
                case "a":
                case "ı":
                case "o":
                case "u":
                    System.out.println("Kalın Sesli Harfdir");
                    break;
                case "e":
                case "i":
                case "ö":
                case "ü":
                    System.out.println("İnce Sesli Harfdir");
                    break;
                default:
                    System.out.println("Girdiğiniz Harf Sessiz Harfdir");
            }
        }

    }
}

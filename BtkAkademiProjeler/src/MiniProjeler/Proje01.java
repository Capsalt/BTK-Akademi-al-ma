package MiniProjeler;

import java.util.Scanner;

public class Proje01 {

    public static void main(String[] args) {
	// Asal sayı
        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();
        int x = 0;

        for (int i=2;i < number; i++ ){
            if (number % i == 0){
                x++;
            }
        }
        if (x==0){
            System.out.println("Girdiğiniz sayı asaldır.");
        }else{
            System.out.println("Girdiğiniz sayı asal değildir.");
        }
    }
}

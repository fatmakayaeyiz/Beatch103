package day04ifstatement;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        //Kullanicidan ilk, orta ve soy ismini aliniz ve asagidaki formatta ekrana yazdiriniz
       // Ali Mert Can
        //123456789
        //1. yol
        Scanner input = new Scanner(System.in);
//        System.out.println("ilk isminizi giriniz...");
//        String ilkİsim = input.next();
//
//        System.out.println("Orta isminizi giriniz...");
//        String ortaİsim = input.next();
//
//        System.out.println("Soy isminizi giriniz...");
//        String soİsim = input.next();
//
//        System.out.println("kimlik numarasi giriniz...");
//        String kimlikNo = input.next();
//
//        System.out.println(ilkİsim + " " + ortaİsim + " " + soİsim);
//        System.out.println(kimlikNo);
//
//        //2. yol
//        System.out.println("ilk orta ve soy isminizi giriniz...");
//        String ilk = input.next();
//        String orta =input.next();
//        String soy =input.next();
//        String kimlik = input.next();
//
//
//        System.out.println(ilk+ " " + orta +" " + soy);
//        System.out.println(kimlik);
            /*
            next() ile nextline() in farki nedir?
            next() methodu kullanicidan gelen stringin sadece ilk kelimesini alir.
            nextLine() methodu kullanicidan gelen Strin'in tamamini alir.
             */
        //3. yol
        System.out.println("ilk, orta ve soy isminizi giriniz");
        String tamİsim = input.nextLine();


        System.out.println("kimlik numaranizi giriniz...");
        String kimlikNumarasi =input.next();

        System.out.println(tamİsim);
        System.out.println(kimlikNumarasi);




    }


}

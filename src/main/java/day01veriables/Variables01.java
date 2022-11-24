package day01veriables;

public class Variables01 {

    //Variable nasıl olusturulur?
    //1)Accses Modifier 2) Data Type 3. Variable ismi 4)= 5)deger
    //Java'da  ";" İngilizce'deki "." gibidir
    //İngilizce'de "cumle" deri, Java'da "statement" deriz

    //"=" sembolu "Assigment Operator(atama operatoru)" olarak adlandirilir
    //"Assigment(atama)operator" sagdaki degeri alir soldaki variable'in icine koyar

    public int age =13;

    public int height = 183;

                  //Java'da Data Type'leri

    /*
                        Primitive Data Types (ilkel data tipleri )
         1)İnt: Integer'in kisaltmasi. Integer tam sayı demektir.32 bit kullanır
            Matematik'de tamsayıların basi vesonru yoktur fakat Java'da tamsayilarin basi ve sonu vardir.
            En kucuk int = -2,147483.648
            En buyuk int = 2,147,483,647

        2)byte: Tamsayılar icin kullanilir. 8 bit kullanır
            En kucuk byte= -128
            En buyuk byte= 127

        3)short: Tamsayilar icin. 16 bit kullanır
                En kucuk short = -32768
                En buyuk short = 32767
.
        4) Long: Tamsayilar icin. 64 bit kullanir.
                en kucuk long =-923.372.836.854.755.808
                en Buyuk long = 923.372.836.854.755.808

        5) float: Ondalikli sayilar icindir. 32 bit kullanir
        "float" virgulden sonra 7 basamak icerebilir
        "fload" degerlerinde sona "f" veya "F" koymaniz gerekir

        6) double: Ondalikli sayilar icindir. 64 bit kullanir
                   "double" virgulden sonra 16 basamak icerebilir

        7) boolean; "true" veya "false" degerleri icin kullanilir. 1 bit kullanilir.

        8) char: Tek karakterler icin kullanilir. 16 bit kullanilir.
              A, c, 2, ?, _,=,
              Note:"char'lara deger verirken, degeri tek tirnak arasina koyunuz. Yoksa hata verir."

              Note: Java buyuk ve kuuk harflere duyarlidir.
                    Java icin TRUE ile true tamamen farklidir.

         Note: Numeric Data Types: byte < short < int < long < float < double
                Numeric Olmayan Data Types: Boolean - char


                            Non-Primitive data Taypes
            String: İsim, adres, kimlik numarasi gibi bir veya birden fazla karakter iceren degerlerde kullanilir.
            String degerelri mutlaka cift tirnak arasina konulmalidir.
            String non-primitive dir. Yani bir String olusturdugunuzda java size bir suru method verir.

            Primitive ile Non-Primitive lerin farki nedir?

     */

    public byte price = 12;

    public short populationOfVillage = 23000;

    public float priceOfShirt = 13.99f;

    public double weightOfCell = 0.000012845;
     // siz "long demenize ragmen Java verilen sayiyi "int" kabul eder
    //Bu yüzden, long bir variable'a "int" araliginin disinda bir sayi verirseniz mutlaka sonuna "L" veya "l" koyunuz

    public long populationOfWorld = 7000000000L;

    //Burda "L" koymadigimiz halde problem yok cunku "1234" int araligina uyar.
    public long x = 1234;

    public boolean isOld = true;
    public boolean isRich = false;

    public char initial ='S';


    public String name ="Tom Hanks";

        //Note: main method arabanin motoru gibidir.
        //main method calismadan hicbirsey calismaz

    public static void main(String[] args) {



    }


}







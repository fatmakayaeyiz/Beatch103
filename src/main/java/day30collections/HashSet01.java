package day30collections;

import java.util.HashSet;

public class HashSet01 {
    /*
        Hash bir tekniktir, birbirine benzemeyen code'lar uretir bu code'lar data'yi uniwue yapar.
         Set'lere, coklu ama tekrarsiz data depolamak istedigimizde ihtiyac duyariz.(ogrenci numaralari gibi)4

        HashSet'ler eklenen elemanlarin siralamasi ile ugrasmaz. Siralama ile alakali zaman harcamaz bu yuzden cok hizli calisir.
        HashSet'ler index kullanmazlar rastgele siralama yaparlar.

        HashSetler:
1)Tekrarsiz elemanlarda
2)Sırlama onemli degilse
3)Hız cok önemliyse
4)Indeks kullanmazlar


         */
    public static void main(String[] args) {

        HashSet<String> emails = new HashSet<>();
        emails.add("Apple");
        emails.add("Mango");
        emails.add("Orange");
        emails.add("Apricot");
        emails.add("Fig");
        System.out.println(emails);//[Apple, Fig, Mango, Apricot, Orange]

        //Set' lere var olan elemani eklerseniz hata vermez, son ekleneni var olan datanin ustune yazar.(Overwrite) denir.
        emails.add("Mango");
        System.out.println();//[Apple, Fig, Mango, Apricot, Orange]

        emails.add(null);
        emails.add(null);
        emails.add(null);
        System.out.println(emails);



    }
}


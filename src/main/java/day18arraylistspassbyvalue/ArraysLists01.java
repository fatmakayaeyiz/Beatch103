package day18arraylistspassbyvalue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArraysLists01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Example 1 : Bir Integer Arraylist deki 7 haric tum elemanlari 2 arttiriniz

        List<Integer> ages = new ArrayList<>(); // ages (yaslar) ismini verirken genelde coklu isim veririz
        ages.add(12);
        ages.add(7);
        ages.add(21);
        ages.add(78);
        ages.add(9);
        // tekrarli islerde for ages loop kullanilir.
        for (Integer w : ages) {

            if (w == 7) {
                continue;// bosveeer
            }
            //w = w + 2;  ==> Listler boyle update edilimezler bu integerleri degistirmek icindir list i degistirmez

            ages.set(ages.indexOf(w), w + 2);
            // Hey java ages(isim)`git w`nun indexini bul sonrada w`i 2 artir.

        }                          // [12, 7, 21, 78, 9 ]
        System.out.println(ages);  // [14, 7, 23, 80, 11]


        //Example 2: Size verilen ArrayList de 8(inclusive: dahil) ve 8 den onceki tum elamanlari 2 katina cikariniz

        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(7);
        nums.add(21);
        nums.add(8);
        nums.add(9);

        for (Integer w : nums) {

            nums.set(nums.indexOf(w), w * 2);//8 dahilse sout if in ustune haric durumunda if in altina yazilir
            if (w == 8) {  // Hey java w`nun icine konan 8`i gorursen
                break;     // digerleriyle ugrasma birak loop`u kir demek
            }
            // [12, 7,  21, 8, 9]
            System.out.println(nums);   // [24, 14, 42, 16, 9]
        }

    }
}
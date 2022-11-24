package day18arraylistspassbyvalue;

public class Verargs01 {

        /*  ==>  Inteviw varargs nedir? baska parametre kullanabilirmiyiz? evet varargs`i en sona koymak sartiyla kullanabiliriz

            1)Farkli sayilardaki parametrelerle calisabilen bir method olusturmak isterseniz "varargs" kullanmalisiniz.

            2)"varargs" arka tarafta "Array" kullanir. Bu yuzden varargslarla calisirken, Arraylerle calisiyormus gibi davranabilirsiniz.

            3)"varargs" olusturmak icin "<data type> ...<varargs ismi>", "<data type>... <varargs ismi>" bu sekildede olur

            4)Bir method'da varargsin yanında baska bir parametre, varargs en sonda olmak sartıyla kullanilabilir.

            5)Bir methodda birden fazla varargs kullanilamaz.Cunku varargs en sonda olmak zorundadır.Birden fazla
              kullanildiginda en az bir varargs en sonda olmayacaktır. Bu da 4. madde ile celisir.

         */
        public static void main(String[] args) {

            // Example 5 : Istedigimiz kadar sayiyi toplayabilecegimiz bir kod yazini
            int r1= add(2,3);
            System.out.println(r1);//5

            int r2= add(2,3,4);
            System.out.println(r2);

            int r3= add(2,3,4,5,6,7,8,9);
            System.out.println(r3);//44

            int r4= add(2,3,4,5,6,7,8,9,10,11);
            System.out.println(r4); // 65

        }

        //Exaple 1: iki sayinin toplamini return eden bir method olusturunuz
//    public static int add(int a, int b){
//        return a+b;
//    }

        // Example 2 : uc sayinin toplamini return eden bir method olusturunuz

//    public static int add(int a, int b, int c){
//        return a+b+c;
//    }

        // Example 3 :Dort sayinin toplamini return eden bir method olusturunuz

//    public static int add(int a, int b, int c, int d){
//        return a+b+c+d;
//    }


        // Example 4 : Istedigimiz kadar sayiyi toplayabilecegimiz method olusturunuz
        public static int add(int... a){   // burasi bir -->(int... a)"varargs"dir.
            //(int... a) gonderilen her data bu parametrenin icine yani buraya gider dipsiz kuyu gibi ve
            // java 2. kisma ulasilmayan kod denir
            int sum =0;
            for (int w:a){
                sum = sum+w;
            }
            return sum;  // data tipi void degilse return kullaniyoruz
        }



    }


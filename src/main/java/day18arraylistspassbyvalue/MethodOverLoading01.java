package day18arraylistspassbyvalue;

public class MethodOverLoading01 {


        /*
        Method Overloading nasıl yapılır?
      1)Method isimleri aynı olmalıdır
      2)Method parametreleri farklı olmalıdır
           i)Parametre sayılarını değiştirilebilir
           ii)Parametrelerin data tiplerini değiştirebilirsiniz
           iii)Parametrelerin yerlerini değiştirebilirsiniz ancak
               data tipleri farklı ise aynı ise değiştirmenin bir anlamı yoktur zaten
      3)Method İsmi + Parametreler = Method Signature (Methodun İmzasıdır)
        Method Signature dışında ne değiştirirseniz değiştirin Java o methodları farklı kabul etmez..
    */
        public static void main(String[] args) {
            add(3,5);
            add(3, 5.0);
        }
        public static void add(int a, int b){  //  2/5 java mutlu
            System.out.println(a+b);
        }

        public static void add(int a, int b, int c){  //  2/5 java mutlu degil
            System.out.println(a+b+c);
        }
        public static void add(int a, double b){  // 2/5 java mutlu degil ama autowaidining double ileyapar
            System.out.println(a+b);
        }

        public static void add(double a, int b){  //  2/5 java mutlu degil
            System.out.println(a+b);
        }
    }


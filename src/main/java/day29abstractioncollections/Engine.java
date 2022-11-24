package day29abstractioncollections;

public interface Engine extends Vehicle{

   //Child        Parent
    //Class ---> Inteerface    ==> implements
    //Class --> Class          ==> extends
    //Iterface --> Interface   ==> extends
    //Iterface--> Class        ==>Mumkun degil

    //interface'lerdeki tum veriable'lar otomatik (default) olarak "public" dir.
    //interface'lerdeki tum veriable'lar otomatik (default) olarak "final" dir.
    //interface'lerdeki tum veriable'lar otomatik (default) olarak "static" dir.

    int price = 2000;
    double weight = 23.5;

    void run();

}

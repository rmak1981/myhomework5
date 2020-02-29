package FifteenFebruaryJava;

import java.util.concurrent.Callable;

public class ClassTwo {

    int a = 10;
    static int b = 20;
    static int c = 50;

    public static void main(String[] args) {
        ClassTwo fm = new ClassTwo();
        fm.firstMethod();
        System.out.println(ClassTwo.b);

            }


    public void firstMethod() {
        int d = 20;
        System.out.println(a);
        System.out.println(ClassTwo.b);
    }

    public static void secondMethod() {
        System.out.println(b);
        System.out.println(c);

    }

}


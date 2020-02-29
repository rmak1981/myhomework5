package FifteenFebruaryJava;

// with return type no parameter

public class Fifth {
    public static void main(String[] args) {
        Fifth mp1 = new Fifth(); // obejct created for method multiply
        int result = mp1.multiply();
        System.out.println(result); // print result in console
    }
    public int multiply() {
        int a = 12;
        int b = 5;
        int result = a * b;
        return result;
    }
}

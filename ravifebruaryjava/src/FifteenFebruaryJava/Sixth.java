package FifteenFebruaryJava;
// with return type with parameter method

public class Sixth {
    public static void main(String[] args) {
        Sixth dv1 = new Sixth(); // object created for division method
        // division method calling to main method fand return int value
        int ravi = dv1.division(500,5);
        System.out.println(ravi);
    }
    public int division(int x, int y){
        int ravi = x/y;
        return ravi;

    }
}

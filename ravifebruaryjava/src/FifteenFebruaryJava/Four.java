package FifteenFebruaryJava;
// No return type with parameters

public class Four {

    public static void main(String[] args) {
        Four sb1 = new Four(); // object created
        sb1.subtract(10,5);// method calling to main method
    }

    // no return type with parameter method
    public void subtract(int a, int b)  {

        System.out.println(a - b);
    }


}

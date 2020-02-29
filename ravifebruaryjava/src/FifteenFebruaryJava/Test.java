package FifteenFebruaryJava;

public class Test {
    public static void main(String[] args) {
        Test t = new Test();
        t.myFirstmethod();
        t.mySecondmethod(5, 6);
        int value = myThirdmethod();
        //System.out.println(5+myThirdmethod());
        t.myFourthmethod("prime","testing",10,20);
    }

    //with no return with no parameters , method name is myFirstmethod
    public void myFirstmethod() {
        int a = 100;
        int b = 200;
        int result = a + b;
        System.out.println(result);

    }
    // with no return with parameters,  method name is mySedondmethod

    private void mySecondmethod(int c, int d) {
        int result = c + d;
        System.out.println(result);
    }
    // with return type no parameters , method name is myThirdmethod

    protected static int myThirdmethod(){
        int a = 1;
        int b = 2;
        int result = a+b;
        String name = "dilip";
        return result;
    }
    // with return type with parameters , method name is myFourthmethod
    //this method is default
    String myFourthmethod (String firstName, String secondName, int a,int b){
        firstName = "prime";
        secondName = "testing";
        String fullName = firstName+secondName;
        int result = a+b;
        return fullName;

    }
}
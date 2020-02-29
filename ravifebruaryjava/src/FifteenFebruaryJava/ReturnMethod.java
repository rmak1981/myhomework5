package FifteenFebruaryJava;

public class ReturnMethod {
    String a = "ravi";
    String b = "makwana";
    int c = 100;
    int d = 300;
    int e ;
    int f ;
    public static void main(String[] args) {
        ReturnMethod add = new ReturnMethod();
        add.addition("vinnay", "aarav");
        add.substraction();
        add.multiplication(10.65,12.5);
        add.division();
    }
    public void addition(String a,String b){

        String result = a + b; // this is no return with parameter method
        System.out.println(result);
        }
    public void substraction(){
        String result1 = a + b;
        System.out.println(result1); // this is no return no parameter method;
    }
    public double multiplication(double a,double b){
        double result = a * b;
        System.out.println(result); // this is return with parameter method
        return result;
    }

    public int division (){
        int result = d/c;
        System.out.println(result);
        return  result;

    }

}









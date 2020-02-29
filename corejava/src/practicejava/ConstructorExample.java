package practicejava;

public class ConstructorExample {
    // user define zero arg constructor
    public ConstructorExample() {
        int a = 10;
        int b = 20;
        System.out.println(a + b);
    }
    // user define parameterize constructor
    public ConstructorExample(int a, int b) {
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        ConstructorExample ce = new ConstructorExample();
        ConstructorExample constructorExample = new ConstructorExample(5,6);

    }
}

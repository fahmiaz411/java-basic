package src;

public class Method {
    public static void main(String[] args) {
        sayHello();
        int total = sum(1, 2);
        System.out.println(total);
    }

    // function only
    static void sayHello() {
        System.out.println("Hello World");
    }

    // with return value
    static int sum(int value1, int value2) {
        return value1 + value2;
    }
}

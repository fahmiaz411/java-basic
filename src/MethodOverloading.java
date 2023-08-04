package src;

public class MethodOverloading {
    public static void main(String[] args) {
        sayHello(1);
    }   
    
    static void sayHello() {
        System.out.println("Hello");
    }

    static void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    static void sayHello(int value) {
        System.out.println("Hello " + value);
    }
}

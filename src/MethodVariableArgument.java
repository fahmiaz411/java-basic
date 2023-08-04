package src;

public class MethodVariableArgument {
    public static void main(String[] args) {
        say(1, 2, 3);
    }

    // optional argument
    static void say(int... values) {
       for (int v: values) {
        System.out.println(v);
       }
    }
}

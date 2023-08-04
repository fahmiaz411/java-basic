package src;

public class MethodRecursive {
    public static void main(String[] args) {
        int total = factorialRecursive(5);
        System.out.println(total);
    }

    /**
     * 
     * @param value
     * @return
     */
    // recursive is not recommended. will cause stack overflow
    static int factorialRecursive(int value) {    
        return value > 1 ? value * factorialRecursive(value-1) : 1;
    }
}

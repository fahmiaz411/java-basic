package src;

public class WhileLoop {
    public static void main(String[] args) {
        var counter = 1;

        while (counter <= 10) {
            System.out.println(counter);
            counter++;
        }

        // Do While

        var counter2 = 10;

        do {
            System.out.println(counter2);
            counter2++;
        } while (counter2 <= 10);
    }   
}

package src;

public class BreakContinue {
    public static void main(String[] args) {
        var counter = 0;

        while (true) {
            if (counter >= 10) {
                break;
            }
            
            if (counter == 5) {
                counter++;
                continue;
            }

            System.out.println(counter);

            counter++;
        }
    }
}

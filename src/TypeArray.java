package src;

public class TypeArray {
    public static void main(String[] args) {
        String[] arrStr = new String[2];
        arrStr[0] = "Fahmi";
        arrStr[1] = "Aziz";

        System.out.println(arrStr[0]);
        System.out.println(arrStr[1]);

        int[] arrInt = new int[]{
            1,
            2,
        };

        System.out.println(arrInt.length);

        String[][] arrOfArr = new String[][]{
            {
                "A",
                "B",
            },
            {
                "C",
            }
        };

        System.out.println(arrOfArr[0][0]);
    }    
}

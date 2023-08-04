package src;

public class NonPrimitiveType {
    public static void main(String[] args) {
        Integer iniInteger = 100;
        Long iniLong = 10000l;

        Byte iniByte = null;

        System.out.println(iniByte);

        iniByte = 127;

        System.out.println(iniByte);

        // Conversion

        int iniInt = 100;

        Integer iniInteger2 = iniInt;

        byte iniByte2 = iniInteger2.byteValue();
        short iniShort2 = iniInteger2.shortValue();
    }
}

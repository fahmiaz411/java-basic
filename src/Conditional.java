package src;

public class Conditional {
    public static void main(String[] args) {
        var nilai = 75;
        var absen = 45;

        if(nilai >= 75 && absen >= 75){
            System.out.println("Lulus");
        } else if (nilai >= 50 && absen >= 50) {
            System.out.println("Dipertimbangkan");
        } else {
            System.out.println("Tidak lulus");
        }

        switch (nilai) {
            case 75:
                System.out.println("Lulus");
                break;
            case 50:
                System.out.println("Dipertimbangkan");
                break;
            default:
                System.out.println("Tidak Lulus");
                break;
        }

        // Switch Lambda
        switch (nilai) {
            case 75 -> System.out.println("Lulus");
            case 50, 65 -> System.out.println("Dipertimbangkan");
            default -> System.out.println("Tidak Lulus");
        }

        String ucapan = switch (nilai) {
            case 75: yield "Lulus";
            case 50, 65: yield "Dipertimbangkan";
            default: yield "Tidak Lulus";
        };

        System.out.println(ucapan);
    }
}

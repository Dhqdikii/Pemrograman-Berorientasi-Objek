package Pert4;

public class BilanganPrima {
    public static void main(String[] args) {
        int batasBawah = 2, batasAtas = 30;

        System.out.print("\033[H\033[2J");
        System.out.println("Bilangan prima antara " + batasBawah + " dan " + batasAtas + " adalah: ");

        // Looping untuk tiap bilangan dalam rentang yang ditentukan
        for (int i = batasBawah; i <= batasAtas; i++) {
            boolean prima = true;

            // Looping untuk cek apakah bilangan i adalah bilangan prima
            if (i > 1) { // Bilangan prima harus lebih dari 1
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        prima = false;
                        break;
                    }
                }

                // Jika prima, tampilkan bilangan tersebut
                if (prima) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}

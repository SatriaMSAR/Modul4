import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=== Calculator ===");
            System.out.println("1. Akar Kuadrat");
            System.out.println("2. Pangkat");
            System.out.println("3. Logaritma");
            System.out.println("4. Faktorial");
            System.out.println("5. Keluar");
            System.out.print("Pilih operasi (1/2/3/4/5): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan angka: ");
                    double sqrtNum = scanner.nextDouble();
                    double sqrtResult = Math.sqrt(sqrtNum);
                    System.out.println("Hasil: " + sqrtResult);
                    break;
                case 2:
                    System.out.print("Masukkan basis: ");
                    double base = scanner.nextDouble();
                    System.out.print("Masukkan pangkat: ");
                    double power = scanner.nextDouble();
                    double powResult = Math.pow(base, power);
                    System.out.println("Hasil: " + powResult);
                    break;
                case 3:
                    System.out.print("Masukkan angka: ");
                    double logNum = scanner.nextDouble();
                    double logResult = Math.log(logNum);
                    System.out.println("Hasil: " + logResult);
                    break;
                case 4:
                    System.out.print("Masukkan angka untuk faktorial: ");
                    int factNum = scanner.nextInt();
                    long factResult = factorial(factNum);
                    System.out.println("Hasil: " + factResult);
                    break;
                case 5:
                    System.out.println("Terima kasih. Program selesai.");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih kembali.");
            }
        }
    }

    private static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
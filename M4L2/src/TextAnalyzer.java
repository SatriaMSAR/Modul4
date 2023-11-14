import java.util.Scanner;

public class TextAnalyzer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = "";

        while (true) {
            System.out.println("=== MENU TEKS ANALYZER ===");
            System.out.println("1. Masukkan Teks");
            System.out.println("2. Hitung Jumlah Karakter");
            System.out.println("3. Hitung Jumlah Kata");
            System.out.println("4. Cari Kata dalam Teks");
            System.out.println("5. Keluar");
            System.out.print("Pilihan Anda: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Masukkan teks: ");
                    text = scanner.nextLine();
                    break;
                case 2:
                    int charCount = countCharacters(text);
                    System.out.println("Jumlah karakter: " + charCount);
                    break;
                case 3:
                    int wordCount = countWords(text);
                    System.out.println("Jumlah kata: " + wordCount);
                    break;
                case 4:
                    System.out.print("Masukkan kata yang ingin dicari: ");
                    String searchWord = scanner.nextLine();
                    int occurrences = findWord(text, searchWord);
                    System.out.println("Kata '" + searchWord + "' ditemukan sebanyak: " + occurrences);
                    break;
                case 5:
                    System.out.println("Terima kasih. Program selesai.");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih kembali.");
            }
        }
    }

    private static int countCharacters(String text) {
        return text.length();
    }

    private static int countWords(String text) {
        if (text.isEmpty()) {
            return 0;
        } else {
            String[] words = text.split("\\s+");
            return words.length;
        }
    }

    private static int findWord(String text, String searchWord) {
        if (text.isEmpty()) {
            return 0;
        } else {
            String[] words = text.split("\\s+");
            int count = 0;

            for (String word : words) {
                if (word.equalsIgnoreCase(searchWord)) {
                    count++;
                }
            }

            return count;
        }
    }
}
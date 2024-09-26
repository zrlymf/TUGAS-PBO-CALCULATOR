import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        // Membuat objek dari kelas Calculator
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);

        // Variabel untuk input pengguna
        double num1, num2;
        int choice;
        double result = 0;

        // Menu kalkulator
        System.out.println("Selamat datang di Kalkulator Sederhana");
        System.out.println("Pilih operasi:");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");

        // Menerima pilihan operasi dari pengguna
        System.out.print("Masukkan pilihan (1-4): ");
        choice = scanner.nextInt();

        // Menerima input dua angka dari pengguna
        System.out.print("Masukkan angka pertama: ");
        num1 = scanner.nextDouble();
        
        System.out.print("Masukkan angka kedua: ");
        num2 = scanner.nextDouble();

        // Menjalankan operasi berdasarkan pilihan
        switch (choice) {
            case 1:
                result = calc.add(num1, num2);
                break;
            case 2:
                result = calc.subtract(num1, num2);
                break;
            case 3:
                result = calc.multiply(num1, num2);
                break;
            case 4:
                result = calc.divide(num1, num2);
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                return; // Keluar dari program jika pilihan tidak valid
        }

        // Menampilkan hasil operasi
        System.out.println("Hasil: " + result);
    }
}

public class Calculator {

    // Metode untuk penjumlahan
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    // Metode untuk pengurangan
    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Metode untuk perkalian
    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Metode untuk pembagian
    public double divide(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error: Pembagian dengan nol tidak diizinkan.");
            return 0; // Kembalikan nilai default jika terjadi error
        }
    }
}

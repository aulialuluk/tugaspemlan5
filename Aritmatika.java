public class Aritmatika {
    public void hitungPenjumlahan(int a, int b) {
        int nilai = a + b;
        System.out.println("Nilai penjumlahan adalah: " + nilai);

        // Memanggil method static hitungPerkalian
        hitungPerkalian(a, b);
    }

    public static void hitungPerkalian(int a, int b) {
        int nilai = a * b;
        System.out.println("Nilai perkalian adalah: " + nilai);
        }

    public static void hitungPengurangan(int a, int b) {
        int nilai = a - b;
        System.out.println("Nilai pengurangan adalah: " + nilai);
    }
    public double hitungPembagian(String a, String b) {
        double angka1 = Double.parseDouble(a);
        double angka2 = Double.parseDouble(b);
        double nilai = angka1 / angka2;
        System.out.println("Nilai pembagian adalah: " + nilai);
        return nilai;
    }
}
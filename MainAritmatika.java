import java.util.Scanner;

public class MainAritmatika {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Memasukkan nilai untuk pengurangan
        System.out.print("Masukkan nilai 1 untuk pengurangan: ");
        int nil1 = in.nextInt();
        System.out.print("Masukkan nilai 2 untuk pengurangan: ");
        int nil2 = in.nextInt();
        // Memanggil method static
        Aritmatika.hitungPengurangan(nil1, nil2);

        // Memasukkan nilai untuk perkalian
        System.out.print("Masukkan nilai 1 untuk perkalian: ");
        nil1 = in.nextInt();
        System.out.print("Masukkan nilai 2 untuk perkalian: ");
        nil2 = in.nextInt();
        // Memanggil method static
        Aritmatika.hitungPerkalian(nil1, nil2);

        // Memasukkan nilai untuk penjumlahan
        System.out.print("Masukkan nilai 1 untuk penjumlahan: ");
        int value1 = in.nextInt();
        System.out.print("Masukkan nilai 2 untuk penjumlahan: ");
        int value2 = in.nextInt();
        // Memanggil method NON-static melalui objek
        Aritmatika a = new Aritmatika();
        a.hitungPenjumlahan(value1, value2);

        System.out.print("masukkan nilai 1 untuk pembagian:");
        String strNil1 = in.next();
        System.out.print("masukkan nilai 2 untuk pembagian:");
        String strNil2 = in.next();
        double hasilPembagian = a.hitungPembagian(strNil1, strNil2);
       // Menutup scanner
        in.close();
    }
}

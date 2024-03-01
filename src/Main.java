import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama Anda: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan jenis kelamin Anda (P/L): ");
        String jenisKelamin = scanner.nextLine();

        if (jenisKelamin.equalsIgnoreCase("P")) {
            jenisKelamin = "Perempuan";
        } else if (jenisKelamin.equalsIgnoreCase("L")) {
            jenisKelamin = "Laki-laki";
        } else {
            System.out.println("Jenis kelamin yang Anda masukkan tidak valid.");
            return;
        }

        System.out.print("Masukkan tanggal lahir Anda (yyyy-mm-dd): ");
        String tanggalLahirString = scanner.nextLine();
        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirString);

        LocalDate sekarang = LocalDate.now();
        Period umur = Period.between(tanggalLahir, sekarang);

        System.out.println("\nData diri Anda:");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis kelamin: " + jenisKelamin);
        System.out.println("Tanggal lahir: " + tanggalLahir);
        System.out.println("Umur: " + umur.getYears() + " tahun");
    }
}
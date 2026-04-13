import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        DataKereta.initData();
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("=== DAFTAR KERETA ===");
            for (String namaKereta : DataKereta.daftarKereta.keySet()) {
                System.out.println("- " + namaKereta);
            }

            System.out.print("Pilih Kereta: ");
            String pilihan = input.nextLine();

            Kereta keretaDipilih = DataKereta.daftarKereta.get(pilihan);

            if (keretaDipilih == null) {
                System.out.println("Maaf, kereta tidak ditemukan.");
                return;
            }

            System.out.print("Masukkan Nama Penumpang: ");
            String nama = input.nextLine();

            System.out.println("Pilih Kelas:");
            System.out.println("1. Ekonomi");
            System.out.println("2. Bisnis");

            int kelas;

            try {
                kelas = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Maaf, terjadi kesalahan. Silakan masukkan angka!");
                return;
            }

            Tiket tiket;

            if (kelas == 1) {
                tiket = new TiketEkonomi(nama, keretaDipilih.getRute(), keretaDipilih.getHarga());
            } else if (kelas == 2) {
                tiket = new TiketBianis(nama, keretaDipilih.getRute(), keretaDipilih.getHarga());
            } else {
                System.out.println("Maaf, pilihan kelas tidak valid.");
                return;
            }

            System.out.println("\n=== DETAIL TIKET ===");
            System.out.println("Nama: " + tiket.getNamaPenumpang());
            System.out.println("Rute: " + tiket.getTujuan());
            System.out.println("Total Harga: Rp " + tiket.hitungHarga());

            Pembayaran bayar = new PembayaranTransfer();
            bayar.prosesPembayaran(tiket.hitungHarga());

        } catch (Exception e) {
            System.out.println("Maaf, terjadi kesalahan. Silakan coba lagi.");
        } finally {
            input.close();
        }
    }
}
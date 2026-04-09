import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Inisialisasi data kereta
        DataKereta.initData();

        Scanner input = new Scanner(System.in);

        System.out.println("=== DAFTAR KERETA ===");
        for (String nama : DataKereta.daftarKereta.keySet()) {
            System.out.println("- " + nama);
        }

        // Input pilihan user
        System.out.print("Pilih Kereta: ");
        String pilihan = input.nextLine();

        // Ambil data dari Map
        Kereta keretaDipilih = DataKereta.daftarKereta.get(pilihan);

        // Validasi
        if (keretaDipilih == null) {
            System.out.println("Kereta tidak ditemukan!");
            return;
        }

        // Input nama penumpang
        System.out.print("Masukkan Nama Penumpang: ");
        String nama = input.nextLine();

        // Pilih jenis tiket
        System.out.println("Pilih Kelas: ");
        System.out.println("1. Ekonomi");
        System.out.println("2. Bisnis");
        int kelas = input.nextInt();

        Tiket tiket;

        if (kelas == 1) {
            tiket = new TiketEkonomi(nama, keretaDipilih.getRute(), keretaDipilih.getHarga());
        } else {
            tiket = new TiketBianis(nama, keretaDipilih.getRute(), keretaDipilih.getHarga());
        }

        // Output tiket
        System.out.println("\n=== DETAIL TIKET ===");
        System.out.println("Nama: " + tiket.getNamaPenumpang());
        System.out.println("Rute: " + tiket.getTujuan());
        System.out.println("Total Harga: " + tiket.hitungHarga());

        // Pembayaran
        Pembayaran bayar = new PembayaranTransfer();
        bayar.prosesPembayaran(tiket.hitungHarga());
    }
}
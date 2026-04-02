public class Main {
    public static void main(String[] args) {

        Tiket t1 = new TiketEkonomi("Nurul", "Jakarta", 100000);
        Tiket t2 = new TiketBianis("Nurul", "Bandung", 150000);

        System.out.println("=== Tiket Ekonomi ===");
        System.out.println(t1.getNamaPenumpang());
        System.out.println(t1.getTujuan());
        System.out.println(t1.hitungHarga());

        System.out.println("=== Tiket Bisnis ===");
        System.out.println(t2.getNamaPenumpang());
        System.out.println(t2.getTujuan());
        System.out.println(t2.hitungHarga());

        Pembayaran bayar = new PembayaranTransfer();
        bayar.prosesPembayaran(t2.hitungHarga());
    }
}
public class PembayaranTransfer implements Pembayaran {

    @Override
    public void prosesPembayaran(double jumlah) {
        System.out.println("Pembayaran Rp " + jumlah + " via transfer berhasil.");
    }
}
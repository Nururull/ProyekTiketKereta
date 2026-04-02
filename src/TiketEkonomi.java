public class TiketEkonomi extends Tiket {

    public TiketEkonomi(String nama, String tujuan, double harga) {
        super(nama, tujuan, harga);
    }

    @Override
    public double hitungHarga() {
        return getHarga();
    }
}
    public class TiketBianis extends Tiket {

    public TiketBianis(String nama, String tujuan, double harga) {
        super(nama, tujuan, harga);
    }

    @Override
    public double hitungHarga() {
        return getHarga() + 50000;
    }
}

public abstract class Tiket {
    private String namaPenumpang;
    private String tujuan;
    private double harga;

    public Tiket(String namaPenumpang, String tujuan, double harga) {
        this.namaPenumpang = namaPenumpang;
        this.tujuan = tujuan;
        this.harga = harga;
    }

    public String getNamaPenumpang() {
        return namaPenumpang;
    }

    public String getTujuan() {
        return tujuan;
    }

    public double getHarga() {
        return harga;
    }

    public abstract double hitungHarga();
}
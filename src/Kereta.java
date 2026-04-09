class Kereta {
    private String namaKereta;
    private String rute;
    private double harga;

    public Kereta(String namaKereta, String rute, double harga) {
        this.namaKereta = namaKereta;
        this.rute = rute;
        this.harga = harga;
    }

    public String getNamaKereta() {
        return namaKereta;
    }

    public String getRute() {
        return rute;
    }

    public double getHarga() {
        return harga;
    }
}
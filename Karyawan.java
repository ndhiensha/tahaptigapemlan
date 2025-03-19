package model;

public class Karyawan {
    private String nama;
    private double gajiPokok;
    private Perusahaan perusahaan;

    public Karyawan (String nama, double gajiPokok, Perusahaan perusahaan) {
        setNama(nama);
        this.gajiPokok = gajiPokok;
        this.perusahaan = perusahaan;
    }
    public void setNama(String nama) {
        if (nama.length() < 4) {
            System.out.println("nama tidak valid");
        }
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }
    public double getGajiPokok() {
        return gajiPokok;
    }
    
    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }
    
    public Perusahaan getPerusahaan() {
        return perusahaan;
    }
    
    public void setPerusahaan(Perusahaan perusahaan) {
        this.perusahaan = perusahaan;
    }
    public double hitungGaji() {
        return gajiPokok;
    }
    public void info() {
        System.out.println("Informasi Karyawan:");
        System.out.println("Nama: " + nama);
        System.out.println("Gaji Pokok: Rp " + Util.formatRupiah(gajiPokok));
        System.out.println("Perusahaan: " + perusahaan.getNamaPerusahaan());
        System.out.println();
    }
    public void infoGaji() {
        System.out.println("Nama Karyawan: " + nama);
        System.out.println("Total Gaji: " + Util.formatRupiah(hitungGaji()));
        System.out.println();
    }
}
package model;

public class Programmer extends Karyawan {
    private double bonus;

    public Programmer(String nama, double gajiPokok, Perusahaan perusahaan, double bonus) {
        super(nama, gajiPokok, perusahaan);
        this.bonus = bonus;
}
public double getBonus() {
    return bonus;
}

public void setBonus(double bonus) {
    this.bonus = bonus;
}

@Override
public double hitungGaji() {
    return getGajiPokok() + bonus;
}

@Override
public void info() {
    System.out.println("Informasi Programmer:");
    System.out.println("Nama: " + getNama());
    System.out.println("Gaji Pokok: Rp " + Util.formatRupiah(getGajiPokok()));
    System.out.println("Bonus: Rp " + Util.formatRupiah(bonus));
    System.out.println("Total Gaji: " + Util.formatRupiah(hitungGaji()));
    System.out.println("Perusahaan: " + getPerusahaan().getNamaPerusahaan());
    System.out.println();
}
}

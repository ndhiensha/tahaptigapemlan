package model;

public class Utama {
    public static void main(String[] args) {
        Perusahaan perusahaan = new Perusahaan("PT. Nusantara Abadi");

        Karyawan karyawan1 = new Karyawan("Budi Santoso", 5000000, perusahaan);
        Programmer programmer1 = new Programmer("Dewi Anggraini", 5500000, perusahaan, 1000000);
        Manager manager1 = new Manager("Ahmad Fauzi", 4800000, perusahaan, 2000000, "IT");
        
        karyawan1.info();
        programmer1.info();
        manager1.info();

        karyawan1.infoGaji();
        programmer1.infoGaji();
        manager1.infoGaji();
    
    }
}

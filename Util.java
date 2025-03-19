package model;

public class Util {
    public static String formatRupiah(double amount) {
        return String.format("Rp%,.2f", amount);
    }
}

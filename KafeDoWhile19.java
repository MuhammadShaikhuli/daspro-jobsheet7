import java.util.Scanner;
public class KafeDoWhile19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int kopi, teh, roti;
        String namaPelanggan;
        int totalHarga, hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;

        do {
            System.out.print("Masukkan Nama Pelanggan (Ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();

            if (namaPelanggan.equalsIgnoreCase("batal")){
                System.out.println("Transaksi Dibatalkan.");
                break;
            }

            System.out.print("Jumlah Kopi: ");
            kopi = sc.nextInt();
            System.out.print("Jumlah Teh: ");
            teh = sc.nextInt();
            System.out.print("Jumlah Roti: ");
            roti = sc.nextInt();

            totalHarga = (kopi*hargaKopi) + (teh*hargaTeh) + (roti*hargaRoti);
            System.out.println("Jumlah Harga yang Harus dibayar: Rp." +totalHarga);
            sc.nextLine();
        }
            while (true);
    }
}
        
    

        
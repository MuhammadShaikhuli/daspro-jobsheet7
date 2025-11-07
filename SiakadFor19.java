import java.util.Scanner;
public class SiakadFor19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double nilai, tertinggi = 0, terrendah = 100;
        int lulus = 0, tdklulus = 0;

        for (int i = 1; i <= 10; i++){
            System.out.print("Masukkan Nilai Manasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi){
                tertinggi = nilai;
            }
            if (nilai < terrendah){
                terrendah = nilai;
            }
            if (nilai >= 60){
                lulus++;
            } else {
                tdklulus++;
            }
        }
    System.out.print("Nilai Tertinggi: " +tertinggi +"\n");
    System.out.println("Nilai Terrendah: " +terrendah);
    System.out.println("Jumlah Mahasiswa yang lulus: " +lulus);
    System.out.println("Jumlah Mahasiswa yang Lulus: " +tdklulus);
    }
}
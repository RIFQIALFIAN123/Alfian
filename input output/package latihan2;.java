package latihan2;
import java.util.Scanner;
public class inputtext {
    public static void main (String[] args) {
        String namaDepan;
        String namaBelakang;
        Scanner text = new Scanner (System.in);
        
        System.out.print("Masukkan nama Depan \t= ");
        namaDepan = text.nextLine();
        System.out.print("Masukkan nama Belakang \t= ");
        namaBelakang = text.nextLine();
        
        System.out.println("=======================================");
        System.out.println("Nama Lengkap \t\t= " + namaDepan + " " + namaBelakang);
        System.out.println("=======================================");
       
    }
    
}
/**
 * Pemilihan2Percobaan203
 */
import java.util.Scanner;
 public class Pemilihan2Percobaan203 {

    public static void main(String[] args) {
        Scanner input03 = new Scanner(System.in);
        System.out.print("Masukkan Sudut 1: ");
        float sudut1 = input03.nextFloat();
        System.out.print("Masukkan Sudut 2: ");
        float sudut2 = input03.nextFloat();
        System.out.print("Masukkan Sudut 3: ");
        float sudut3 = input03.nextFloat();
        float totalSudut;
        totalSudut = sudut1 + sudut2 + sudut3;

        if (totalSudut == 180) {
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90))
                System.out.println("Segitiga tersebut adalah segitiga siku-siku");
            else if ((sudut1 == sudut2) && (sudut2 == sudut3))
                System.out.println("Segitiga sama sisi");
            else if ((sudut1 == sudut2) || (sudut2 == sudut3) || (sudut1 == sudut3))
                System.out.println("Segitiga sama kaki");
            else
                System.out.println("Segitiga sembarang");
        } else 
            System.out.println("Bukan Segitiga");
    }
}
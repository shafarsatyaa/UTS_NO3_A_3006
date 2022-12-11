/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package mulaimodulpr.uts_no3_05a_3006;

/**
 *
 * @author acer
 */
public class UTS_NO3_05A_3006 {

   public static void main(String[] args) {
        Asprak_3006 A = new Asprak_3006("21103006", "Shafar Sitokhang", "Sistem Informasi", 4, "Pemrograman Objek", 6);
        A.tampilDataMhs();
        System.out.println("Total : " + A.totalPendapatan_3006());
        System.out.println("");

        StudentStaff_3006 B = new StudentStaff_3006("5582392", "Abdullah Batman", "Teknik Informatika", 3, 4, 5);
        B.tampilDataMhs();
        System.out.println("Total : " + B.totalPendapatan_3006());
        System.out.println("");
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mulaimodulpr.uts_no3_05a_3006;

/**
 *
 * @author acer
 */
public class StudentStaff_3006 extends Mahasiswa_3006 implements iPendapatan_3006 {

    int unitKerja_3006;
    int jamKerja_3006;
    double totalPendapatan_3006;

    public StudentStaff_3006() {

    }

    public StudentStaff_3006(String nim, String nama, String Jurusan, int ipk,
            int unitKerja, int jamKerja) {
        super(nim, nama, Jurusan, ipk);
        this.unitKerja_3006 = unitKerja_3006;
        this.jamKerja_3006 = jamKerja_3006;
    }
    
    public void tampilDataMhs(){
        super.tampilDataMhs();
        infostuden();
    }
    
    public void infostuden(){
        System.out.println("unitKerja : " + unitKerja_3006);
        System.out.println("jamKerja : " + jamKerja_3006);
    }

    @Override
    public double totalPendapatan_3006() {
        return totalPendapatan_3006 = (int) (jamKerja_3006 * 30000);
    }
}
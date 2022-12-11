/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mulaimodulpr.uts_no3_05a_3006;

/**
 *
 * @author acer
 */
public class Mahasiswa_3006 {
    String nim_3006;
    String nama_3006;
    String Jurusan_3006;
    int ipk_3006;
    
    public Mahasiswa_3006(){
        
    }
    
    public Mahasiswa_3006(String nim_3006, String nama_3006, String Jurusan_3006, int ipk_3006){
        this.nim_3006 = nim_3006;
        this.nama_3006 = nama_3006;
        this.Jurusan_3006 = Jurusan_3006;
        this.ipk_3006 = ipk_3006;
    }
    
    public void tampilDataMhs(){
        System.out.println("nim : " + nim_3006);
        System.out.println("nama: " + nama_3006);
        System.out.println("Jurusan : " + Jurusan_3006);
        System.out.println("ipk : " + ipk_3006);
    }

}
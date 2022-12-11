/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mulaimodulpr.uts_no3_05a_3006;

/**
 *
 * @author acer
 */
public class Asprak_3006 extends Mahasiswa_3006 implements iPendapatan_3006{
    String MKasistensi_3006;
    int jmlhPertemuan_3006;
    double totalPendapatan_3006;

    public Asprak_3006(){
        
    }
    
    public Asprak_3006(String nim, String nama, String Jurusan, int ipk, 
            String MKasistensi, int jmlhPertemuan){
        super(nim,nama,Jurusan,ipk);
        this.MKasistensi_3006 = MKasistensi_3006;
        this.jmlhPertemuan_3006 = jmlhPertemuan_3006;
        
    }
    
    public void infoAsprak(){
        System.out.println("MKasistensi : " + MKasistensi_3006);
        System.out.println("jmlhPertemuan : " + jmlhPertemuan_3006);
    }
    
    public void tampilDataMhs(){
        super.tampilDataMhs();
        infoAsprak();
    }
    
    public double totalPendapatan_3006(){
        return totalPendapatan_3006 = (double) (jmlhPertemuan_3006 * 50000);
    }
}
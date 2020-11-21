/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119015.latihan51.gajikaryawan;

/**
 *
 * @author Agy
 * NAMA     : Agi Sutrisna
 * KELAS    : IF-1
 * NIM      : 10119015
 */
public class Manager extends Karyawan {
    private int kehadiran;
    private float tunjanganGolongan;
    private float tunjanganJabatan;
    private float tunjanganKehadiran;
    
    public int getKehadiran(){
        return kehadiran;
    }
    
    public void setKehadiran(int kehadiran){
        this.kehadiran = kehadiran;
    }
    
    public float tunjanganKehadiran(int hadir){
        return tunjanganKehadiran = hadir * 10000;
    }
    
    public float tunjanganJabatan(String jabatan){
        if ("Manager".equals(jabatan)){
            return tunjanganJabatan = 2000000;
        }if ("Kabag".equals(jabatan)){
            return tunjanganJabatan = 1000000;
        }else{
            return tunjanganJabatan = 0;
        }
    }
    
    public float tunjanganGolongan(int golongan){
        if (golongan == 1){
            return tunjanganGolongan = 500000;
        }if (golongan == 2){
            return tunjanganGolongan = 1000000;
        }if (golongan == 3){
            return tunjanganGolongan = 1500000;
        }else{
            return tunjanganGolongan = 0;
        }
    }
    
    public float gajiTotal(){
        return tunjanganJabatan + tunjanganGolongan + tunjanganKehadiran;
    }
}

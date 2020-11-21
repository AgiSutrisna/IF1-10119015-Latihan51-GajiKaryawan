/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119015.latihan51.gajikaryawan;

import java.util.Scanner;

/**
 *
 * @author Agy
 * NAMA     : Agi Sutrisna
 * KELAS    : IF-1
 * NIM      : 10119015
 */
public class IF110119015Latihan51GajiKaryawan extends Karyawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Karyawan o1 = new Karyawan();
        Manager o2 = new Manager();
        
        System.out.println("=====PROGRAM PERHITUNGAN GAJI KARYAWAN=====");
        System.out.print("Masukan NIK : ");
        o1.setNik(input.nextLine());
        System.out.print("Masukan Nama : ");
        o1.setNama(input.nextLine());
        System.out.print("Masukan Golongan (1/2/3) : ");
        o1.setGolongan(input.nextInt());
        System.out.print("Masukan Jabatan (Manager/Kabag) : ");
        o1.setJabatan(input.next());
        System.out.print("Masukan jumlah Kehadiran : ");
        o2.setKehadiran(input.nextInt());
        
        String nik = o1.getNik();
        String nama = o1.getNama();
        int golongan = o1.getGolongan();
        String jabatan = o1.getJabatan();
        float tunjanganGolongan = o2.tunjanganGolongan(golongan);
        float tunjanganJabatan = o2.tunjanganJabatan(jabatan);
        int hadir = o2.getKehadiran();
        float tunjanganKehadiran = o2.tunjanganKehadiran(hadir);
        float gajiTotal = o2.gajiTotal();
        
        System.out.println();
        System.out.println("=====HASIL PERHITUNGAN=====");
        System.out.println("NIK\t\t: " + nik);
        System.out.println("NAMA\t\t: " + nama);
        System.out.println("GOLONGAN\t: " + golongan);
        System.out.println("JABATAN\t\t: " + jabatan);
        System.out.println();
        System.out.println("TUNJANGAN GOLONGAN\t: Rp." + tunjanganGolongan);
        System.out.println("TUNJANGAN JABATAN\t: Rp." + tunjanganJabatan);
        System.out.println("TUNJANGAN KEHADIRAN\t: Rp." + tunjanganKehadiran);
        System.out.println();
        System.out.println("GAJI TOTAL\t: Rp." + gajiTotal);
        
    }
    
}

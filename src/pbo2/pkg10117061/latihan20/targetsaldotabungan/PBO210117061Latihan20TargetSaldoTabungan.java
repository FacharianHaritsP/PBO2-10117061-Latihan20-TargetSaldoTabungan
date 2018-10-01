/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117061.latihan20.targetsaldotabungan;

/**
 * Nama :Fachrian Harits Pratama NIM :10117061 kelas :if2 Deskripsi program
 * :menampilkan saldo target selama 8 bulan
 */
public class PBO210117061Latihan20TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double j, saldo;
        saldo = 3500000;

        for (int i = 1; i <= 8; i++) {
            j = (int) saldo * 0.08;
            saldo = saldo + j;
            System.out.println("Saldo bulan ke-" + i + " Rp." + saldo);

        }
    }

}

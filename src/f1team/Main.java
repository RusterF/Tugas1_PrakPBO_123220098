/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package f1team;

/**
 *
 * @author LENOVO
 */
public class Main {

    public static void main(String[] args) {
        TimF1[] daftarTim = new TimF1[5];

        daftarTim[0] = new Pembalap("Mercedes", "Brackley", "George Russell");
        daftarTim[1] = new Mesin("Mercedes", "Brackley", "Mercedes-AMG F1 M14 E Performance");
        daftarTim[2] = new Pembalap("Red Bull Racing", "Milton Keynes", "Max Verstappen");
        daftarTim[3] = new Mesin("Red Bull Racing", "Milton Keynes", "Honda RBPTH001");
        daftarTim[4] = new TimF1("McLaren ", "Woking");

        for (int i = 0; i < daftarTim.length; i++) {
            daftarTim[i].infoTim();
            System.out.println();
        }
    }
}

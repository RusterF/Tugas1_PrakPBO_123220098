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
public class TimF1 {

    private String namaTim;
    private String markas;

    public TimF1(String namaTim, String basis) {
        this.namaTim = namaTim;
        this.markas = basis;
    }

    public String getNamaTim() {
        return namaTim;
    }

    public void setNamaTim(String namaTim) {
        this.namaTim = namaTim;
    }

    public String getBasis() {
        return markas;
    }

    public void setBasis(String basis) {
        this.markas = basis;
    }

    public void infoTim() {
        System.out.println("Nama Tim \t: " + namaTim);
        System.out.println("Markas \t\t: " + markas);
    }
}

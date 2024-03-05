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
public class Pembalap extends TimF1 {

    private String namaPembalap;

    public Pembalap(String namaTim, String basis, String namaPembalap) {
        super(namaTim, basis);
        this.namaPembalap = namaPembalap;
    }

    public String getNamaPembalap() {
        return namaPembalap;
    }

    public void setNamaPembalap(String namaPembalap) {
        this.namaPembalap = namaPembalap;
    }

    @Override
    public void infoTim() {
        super.infoTim();
        System.out.println("Nama Pembalap \t: " + namaPembalap);
    }
}

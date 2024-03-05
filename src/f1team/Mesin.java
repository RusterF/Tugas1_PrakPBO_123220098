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
public class Mesin extends TimF1 {

    private String jenisMesin;

    public Mesin(String namaTim, String basis, String jenisMesin) {
        super(namaTim, basis);
        this.jenisMesin = jenisMesin;
    }

    public String getJenisMesin() {
        return jenisMesin;
    }

    public void setJenisMesin(String jenisMesin) {
        this.jenisMesin = jenisMesin;
    }

    @Override
    public void infoTim() {
        super.infoTim();
        System.out.println("Jenis Mesin \t: " + jenisMesin);
    }
}

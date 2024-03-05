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
    private String basis;
    
    public TimF1(String namaTim, String basis) {
        this.namaTim = namaTim;
        this.basis = basis;
    }
    
    public String getNamaTim() {
        return namaTim;
    }
    
    public void setNamaTim(String namaTim) {
        this.namaTim = namaTim;
    }
    
    public String getBasis() {
        return basis;
    }
    
    public void setBasis(String basis) {
        this.basis = basis;
    }
    
    public void infoTim() {
        System.out.println("Nama Tim: " + namaTim);
        System.out.println("Basis: " + basis);
    }
}

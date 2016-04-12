/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kandidat;

import java.util.LinkedList;

/**
 *
 * @author NEVEN
 */
public class Kandidat {
    private String brPrijave;
    private String sifraZadatka;
    private LinkedList<Object> resenja;
    public Kandidat(){
        resenja=new LinkedList<>();
    }

    public String getBrPrijave() {
        return brPrijave;
    }

    public void setBrPrijave(String brPrijave) {
        this.brPrijave = brPrijave;
    }

    public String getSifraZadatka() {
        return sifraZadatka;
    }

    public void setSifraZadatka(String sifraZadatka) {
        this.sifraZadatka = sifraZadatka;
    }

    

    public LinkedList<Object> getResenja() {
        return resenja;
    }

    public void setResenja(LinkedList<Object> resenja) {
        this.resenja = resenja;
    }

    @Override
    public String toString() {
        return "Kandidat{" + "brPrijave=" + brPrijave + ", sifraZadatka=" + sifraZadatka + ", resenja=" + resenja + '}';
    }
    
}

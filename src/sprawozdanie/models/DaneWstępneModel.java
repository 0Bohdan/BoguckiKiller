/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sprawozdanie.models;

/**
 *
 * @author bohda
 */
public class DaneWstępneModel {
    private String szkoła;
    private String temat;
    private String imię;
    private String nazwisko;
    private String nrWDzienniku;
    private String klasa;
    private String grupa;
    private String dataĆw;
    private String dataSpr;
    /*SETHERS*/
    public void setSzkoła(String szkoła) {
        this.szkoła = szkoła;
    }
    public void setTemat(String temat) {
        this.temat = temat;
    }
    public void setImię(String imię) {
        this.imię = imię;
    }
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
    public void setNrWDzienniku(String nrWDzienniku) {
        this.nrWDzienniku = nrWDzienniku;
    }
    public void setKlasa(String klasa) {
        this.klasa = klasa;
    }
    public void setGrupa(String grupa) {
        this.grupa = grupa;
    }
    public void setDataĆw(String dataĆw) {
        this.dataĆw = dataĆw;
    }
    public void setDataSpr(String dataSpr) {
        this.dataSpr = dataSpr;
    }
    /*GEtHERS*/
    public String getSzkoła() {
        return szkoła;
    }
    public String getTemat() {
        return temat;
    }
    public String getImię() {
        return imię;
    }
    public String getNazwisko() {
        return nazwisko;
    }
    public String getNrWDzienniku() {
        return nrWDzienniku;
    }
    public String getKlasa() {
        return klasa;
    }
    public String getGrupa() {
        return grupa;
    }
    public String getDataĆw() {
        return dataĆw;
    }
    public String getDataSpr() {
        return dataSpr;
    }
}

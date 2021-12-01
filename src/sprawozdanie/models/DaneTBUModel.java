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
public class DaneTBUModel {
    private String nazwaULE = "";
    private final String[] titles = {"Oznaczenie", "Nazwa", "Wartość"};
    private String[][] Parametry = new String[0][titles.length];
    public void setNazwaULE(String nazwaULE) {
        this.nazwaULE = nazwaULE;
    }
    public void setParametry(String[][] Parametry) {
        this.Parametry = Parametry;
    }
    
    public String getNazwaULE() {
        return nazwaULE;
    }
    public String[][] getParametry() {
        return Parametry;
    }
    public String[] getTitles() {
        return titles;
    }
    
}

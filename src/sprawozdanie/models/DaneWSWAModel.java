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
public class DaneWSWAModel {
    private final String[] titles = {"Typ", "Zakres", "Nr", "Ilość"};
    private String[][] WSWA = new String[0][titles.length];
    public void setWSWA(String[][] WSWA) {
        this.WSWA = WSWA;
    } 
    public String[][] getWSWA() {
        return WSWA;
    }
    public String[] getTitles() {
        return titles;
    }
}

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
public class DaneWDZModel {
    private final String[] titles = {"Działanie"};
    private String[][] WDZ = new String[0][titles.length];
    public void setWDZ(String[][] WDZ) {
        this.WDZ = WDZ;
    } 
    public String[][] getWDZ() {
        return WDZ;
    }
    public String[] getTitles() {
        return titles;
    }
}

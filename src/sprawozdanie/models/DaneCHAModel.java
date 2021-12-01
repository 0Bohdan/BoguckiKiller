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
public class DaneCHAModel {
    private final String[] titles = {"Charakterystyka"};
    private String[][] CHA = new String[0][titles.length];
    public void setCHA(String[][] CHA) {
        this.CHA = CHA;
    } 
    public String[][] getCHA() {
        return CHA;
    }
    public String[] getTitles() {
        return titles;
    }
}

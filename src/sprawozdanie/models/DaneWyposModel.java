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
public class DaneWyposModel {
    public static final String[] titles = {"Typ", "Zakres", "Nr", "Ilość"};
    private String[] wyposWAKP;
    public void setNazwyChar(String[] wyposWAKP) {
        this.wyposWAKP = wyposWAKP;
    }
    public String[] getNazwyChar() {
        return wyposWAKP;
    }
}

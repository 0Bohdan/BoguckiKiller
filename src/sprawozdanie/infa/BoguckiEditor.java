/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sprawozdanie.infa;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.TableModel;
import org.openide.util.Exceptions;

/**
 *
 * @author bohda
 */
public interface BoguckiEditor {
    public void save();
    public void load();
    public void setTable(String[] titles, String[][] values);
    public void setSizes();
    default String[][] toArr(TableModel model) {
        String[][] result = new String[model.getRowCount()][model.getColumnCount()];
        
        for(int i = 0; i < model.getRowCount(); i++) {
            for(int j = 0; j < model.getColumnCount(); j++) {
                Object value = model.getValueAt(i, j);
                if(value != null) {
                    result[i][j] = value.toString();
                }
                else {
                    result[i][j] = "Brak";
                }
            }
        }
        
        return result;
    }
    default void setLook() {
        try {
            javax.swing.UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            Exceptions.printStackTrace(ex);
        }
    }
}

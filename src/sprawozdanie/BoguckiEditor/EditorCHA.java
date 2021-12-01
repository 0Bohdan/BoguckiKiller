/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sprawozdanie.BoguckiEditor;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import static javax.swing.WindowConstants.HIDE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import sprawozdanie.SprawoMessia;
import sprawozdanie.infa.BoguckiEditor;

/**
 *
 * @author bohda
 */
public class EditorCHA extends javax.swing.JFrame implements BoguckiEditor {

    /**
     * Creates new form EditorCHA
     */
    public EditorCHA() {
        setLook();
        initComponents();
        
        setLocationRelativeTo(null);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                save();
            }
    });
        setDefaultCloseOperation(HIDE_ON_CLOSE);
    }
    
    @Override
    public void save() {
        SprawoMessia.getDane().getDaneCHA().setCHA(toArr(jTable1.getModel()));
    }
    @Override
    public void load() {
        setTable(SprawoMessia.getDane().getDaneCHA().getTitles(),
                SprawoMessia.getDane().getDaneCHA().getCHA()
        );
    }
    @Override
    public void setTable(String[] titles, String[][] values) {
        DefaultTableModel newModel = new DefaultTableModel(values, titles);
        jTable1.setModel(newModel);
        setSizes();
    }
    @Override
    public void setSizes() {
        
    }
    
    public void dodajChara() {
        
        String[][] newValues = new String[jTable1.getRowCount()+1][jTable1.getColumnCount()];
        for(int i = 0; i < jTable1.getRowCount(); i++) {
            for(int j = 0; j < jTable1.getColumnCount(); j++) {
                newValues[i][j] = jTable1.getModel().getValueAt(i, j)+"";
            }
        }
        for(int i = jTable1.getRowCount(); i < newValues.length; i++) {
            for(int j = 0; j < jTable1.getColumnCount(); j++) {
                newValues[i][j] = "";
            }
        }
        
        setTable(SprawoMessia.getDane().getDaneCHA().getTitles(),
                newValues);
        setSizes();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        org.openide.awt.Mnemonics.setLocalizedText(jButton1, org.openide.util.NbBundle.getMessage(EditorCHA.class, "EditorCHA.jButton1.text")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setShowGrid(true);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dodajChara();
    }//GEN-LAST:event_jButton1ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}

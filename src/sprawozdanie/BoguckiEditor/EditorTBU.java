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
import javax.swing.table.TableModel;
import sprawozdanie.SprawoMessia;
import sprawozdanie.infa.BoguckiEditor;
import sprawozdanie.models.DaneTBUModel;

/**
 *
 * @author bohda
 */
public class EditorTBU extends javax.swing.JFrame implements BoguckiEditor {

    /**
     * Creates new form EditorTBU
     */
    
    public EditorTBU() {
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
    
    public String getULE() {
        return jTextField1.getText();
    }
    @Override
    public void setSizes() {
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(75);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(75);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(75);
            jTable1.getColumnModel().getColumn(2).setMinWidth(100);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(100);
}
    }
    @Override
    public void save() {
        String[][] tabela = toArr(jTable1.getModel());
        SprawoMessia.getDane().getDaneTBU().setNazwaULE(getULE());
        SprawoMessia.getDane().getDaneTBU().setParametry(tabela);
        
    }
    @Override
    public void load() {
        DaneTBUModel daneTBU = SprawoMessia.getDane().getDaneTBU();
        jTextField1.setText(daneTBU.getNazwaULE());
        setTable(daneTBU.getTitles(), daneTBU.getParametry());
        
    }
    @Override
    public void setTable(String[] titles, String[][] values) {
        
        jTable1.setModel(new DefaultTableModel(values, titles));
        for(int i = 0; i < titles.length; i++) {
            System.out.println(titles[i]);
        }
        setSizes();
    }
    
    public void dodajParametr() {
        var oldModel = jTable1.getModel();
        String title1 = jTable1.getColumnName(0);
        String title2 = jTable1.getColumnName(1);
        String title3 = jTable1.getColumnName(2);
        String[] titles = {title1, title2, title3};
        TableModel newModel = new DefaultTableModel(titles,oldModel.getRowCount() + 1);
        for(int i = 0; i < oldModel.getRowCount(); i++) {
            newModel.setValueAt(oldModel.getValueAt(i, 0), i, 0);
            newModel.setValueAt(oldModel.getValueAt(i, 1), i, 1);
            newModel.setValueAt(oldModel.getValueAt(i, 2), i, 2);
        }
        jTable1.setModel(newModel);
        setSizes();
    }
    
    
    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(EditorTBU.class, "EditorTBU.jLabel1.text")); // NOI18N

        jTextField1.setForeground(new java.awt.Color(60, 63, 65));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText(org.openide.util.NbBundle.getMessage(EditorTBU.class, "EditorTBU.jTextField1.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jToggleButton1, org.openide.util.NbBundle.getMessage(EditorTBU.class, "EditorTBU.jToggleButton1.text")); // NOI18N
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(EditorTBU.class, "EditorTBU.jLabel2.text")); // NOI18N

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setForeground(new java.awt.Color(60, 63, 65));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Oznaczenie", "Nazwa", "Wartość"
            }
        ));
        jTable1.setToolTipText(org.openide.util.NbBundle.getMessage(EditorTBU.class, "EditorTBU.jTable1.toolTipText")); // NOI18N
        jTable1.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jTable1.setShowGrid(true);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(75);
            jTable1.getColumnModel().getColumn(0).setHeaderValue(org.openide.util.NbBundle.getMessage(EditorTBU.class, "EditorTBU.jTable1.columnModel.title0")); // NOI18N
            jTable1.getColumnModel().getColumn(1).setHeaderValue(org.openide.util.NbBundle.getMessage(EditorTBU.class, "EditorTBU.jTable1.columnModel.title1")); // NOI18N
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(2).setHeaderValue(org.openide.util.NbBundle.getMessage(EditorTBU.class, "EditorTBU.jTable1.columnModel.title2")); // NOI18N
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField1)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addComponent(jToggleButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        dodajParametr();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}

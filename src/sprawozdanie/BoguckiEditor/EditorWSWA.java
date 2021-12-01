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
import sprawozdanie.models.DaneWSWAModel;

/**
 *
 * @author bohda
 */
public class EditorWSWA extends javax.swing.JFrame implements BoguckiEditor{

    /**
     * Creates new form EditorWSWA
     */
    public EditorWSWA() {
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
    public void setSizes() {
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(160);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(160);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(160);
            jTable1.getColumnModel().getColumn(1).setMinWidth(150);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(150);
            jTable1.getColumnModel().getColumn(2).setMinWidth(35);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(35);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(35);
            jTable1.getColumnModel().getColumn(3).setMinWidth(50);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(3).setMaxWidth(50);
        }
    }
    @Override
    public void save() {
        String[][] tabela = toArr(jTable1.getModel());
        SprawoMessia.getDane().getDaneWSWA().setWSWA(tabela);
        
    }
    @Override
    public void load() {
        DaneWSWAModel daneWSWA = SprawoMessia.getDane().getDaneWSWA();
        setTable(daneWSWA.getTitles(), daneWSWA.getWSWA());
        
    }
    @Override
    public void setTable(String[] titles, String[][] values) {
        
        jTable1.setModel(new DefaultTableModel(values, titles));
        setSizes();
    }
    
    public void dodajWyposażenie() {
        var oldModel = jTable1.getModel();
        String title1 = jTable1.getColumnName(0);
        String title2 = jTable1.getColumnName(1);
        String title3 = jTable1.getColumnName(2);
        String title4 = jTable1.getColumnName(3);
        String[] titles = {title1, title2, title3, title4};
        TableModel newModel = new DefaultTableModel(titles,oldModel.getRowCount() + 1);
        for(int i = 0; i < oldModel.getRowCount(); i++) {
            newModel.setValueAt(oldModel.getValueAt(i, 0), i, 0);
            newModel.setValueAt(oldModel.getValueAt(i, 1), i, 1);
            newModel.setValueAt(oldModel.getValueAt(i, 2), i, 2);
            newModel.setValueAt(oldModel.getValueAt(i, 3), i, 3);
        }
        jTable1.setModel(newModel);
        setSizes();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        org.openide.awt.Mnemonics.setLocalizedText(jButton1, org.openide.util.NbBundle.getMessage(EditorWSWA.class, "EditorWSWA.jButton1.text")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(EditorWSWA.class, "EditorWSWA.jLabel1.text")); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Typ", "Zakres", "Nr", "Ilość"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(160);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(160);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(160);
            jTable1.getColumnModel().getColumn(0).setHeaderValue(org.openide.util.NbBundle.getMessage(EditorWSWA.class, "EditorWSWA.jTable1.columnModel.title0")); // NOI18N
            jTable1.getColumnModel().getColumn(1).setMinWidth(150);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(150);
            jTable1.getColumnModel().getColumn(1).setHeaderValue(org.openide.util.NbBundle.getMessage(EditorWSWA.class, "EditorWSWA.jTable1.columnModel.title1")); // NOI18N
            jTable1.getColumnModel().getColumn(2).setMinWidth(35);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(35);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(35);
            jTable1.getColumnModel().getColumn(2).setHeaderValue(org.openide.util.NbBundle.getMessage(EditorWSWA.class, "EditorWSWA.jTable1.columnModel.title2")); // NOI18N
            jTable1.getColumnModel().getColumn(3).setMinWidth(50);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(3).setMaxWidth(50);
            jTable1.getColumnModel().getColumn(3).setHeaderValue(org.openide.util.NbBundle.getMessage(EditorWSWA.class, "EditorWSWA.jTable1.columnModel.title3")); // NOI18N
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dodajWyposażenie();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}

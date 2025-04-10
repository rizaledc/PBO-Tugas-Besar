/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package AplikasiPenjualan;

import java.io.File;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


/**
 *
 * @author rwp44
 */
public class DataForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form DataForm
     */
    public DataForm() {
    initComponents();
    loadTableData();
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableData = new javax.swing.JTable();
        UtamaButton = new javax.swing.JButton();
        totalHouseTxt = new javax.swing.JTextField();
        totalIncomeTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        deleteAllButton = new javax.swing.JButton();
        eksportButton = new javax.swing.JButton();

        tableData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nomor Pesanan", "Nama Pemesan", "Area", "Tipe Rumah", "Luas Tanah", "Harga", "Lama Cicilan", "Cicilan/Bulan"
            }
        ));
        jScrollPane1.setViewportView(tableData);

        UtamaButton.setText("Menu Utama");
        UtamaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UtamaButtonActionPerformed(evt);
            }
        });

        totalIncomeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalIncomeTxtActionPerformed(evt);
            }
        });

        jLabel1.setText("Jumlah Rumah Terjual");

        jLabel2.setText("Total Penjualan");

        deleteAllButton.setText("Hapus Seluruh Data");
        deleteAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAllButtonActionPerformed(evt);
            }
        });

        eksportButton.setText("Eksport Data");
        eksportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eksportButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 794, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(eksportButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(totalHouseTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(deleteAllButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(totalIncomeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(UtamaButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(UtamaButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalHouseTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(eksportButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalIncomeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(deleteAllButton))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void UtamaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UtamaButtonActionPerformed
        OptionMenu optionMenu = new OptionMenu();
        optionMenu.setVisible(true);
        this.getDesktopPane().add(optionMenu);
        this.dispose();
    }//GEN-LAST:event_UtamaButtonActionPerformed

    private void totalIncomeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalIncomeTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalIncomeTxtActionPerformed

    private void deleteAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteAllButtonActionPerformed
        int confirm = JOptionPane.showConfirmDialog(null,
            "Apakah Anda yakin ingin menghapus semua data di tabel rumah?",
            "Konfirmasi Hapus Data", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            try {
                java.sql.Connection conn = ConnectionDb.connectDatabase();

                String sql = "DELETE FROM rumah";
                java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                pst.executeUpdate();
                // Reset nilai order_id ke 1
                String resetAutoIncrement = "ALTER SEQUENCE rumah_order_id_seq RESTART WITH 1;";
                java.sql.PreparedStatement pst2 = conn.prepareStatement(resetAutoIncrement);
                pst2.executeUpdate();

                JOptionPane.showMessageDialog(null, "Semua data berhasil dihapus!");

                // Refresh tampilan tabel
                loadTableData();

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Gagal menghapus data: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_deleteAllButtonActionPerformed

    private void eksportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eksportButtonActionPerformed
              JFileChooser fileChooser = new JFileChooser();
    int userSelection = fileChooser.showSaveDialog(this);

    if (userSelection == JFileChooser.APPROVE_OPTION) {
        File fileToSave = fileChooser.getSelectedFile();
        exportDataToFile(fileToSave); // Panggil method baru
        JOptionPane.showMessageDialog(this, "Data berhasil diekspor ke: " + fileToSave.getAbsolutePath());
    }
    }//GEN-LAST:event_eksportButtonActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton UtamaButton;
    private javax.swing.JButton deleteAllButton;
    private javax.swing.JButton eksportButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableData;
    private javax.swing.JTextField totalHouseTxt;
    private javax.swing.JTextField totalIncomeTxt;
    // End of variables declaration//GEN-END:variables

    public final void loadTableData() {
        try {
        Connection conn = ConnectionDb.connectDatabase();
        try (java.sql.Statement stat = conn.createStatement()) {
            String sql = "SELECT * FROM public.rumah";
            try (ResultSet rs = stat.executeQuery(sql)) {
                DefaultTableModel tableModel = (DefaultTableModel) tableData.getModel();
                tableModel.setRowCount(0);
                
                int totalRumah = 0;
                int totalPenjualan = 0;
                
                while (rs.next()) {
                    int harga = rs.getInt("harga_rumah");
                    int lamaCicilan = rs.getInt("lama_cicilan");
                    
                    tableModel.addRow(new Object[] {
                        rs.getInt("order_id"),
                        rs.getString("name"),
                        rs.getString("area"),
                        rs.getString("tipe"),
                        rs.getDouble("luas"),
                        harga,
                        lamaCicilan,
                        rs.getString("bayar_bulan")
                    });
                    
                    totalRumah++;
                    totalPenjualan += harga;
                }
                
                totalHouseTxt.setText(String.valueOf(totalRumah));
                totalIncomeTxt.setText("Rp " + totalPenjualan);
            }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Gagal memuat data: " + e.getMessage());
    }
}

    private void exportDataToFile(File fileToSave) {
        FileExporter exporter = new RumahFileExporter(); // class turunan dari abstract
        exporter.export(fileToSave, tableData.getModel());
    }
    
}

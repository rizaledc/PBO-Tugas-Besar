/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AplikasiPenjualan;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class RumahFileExporter extends FileExporter {
    @Override
    public void export(File file, javax.swing.table.TableModel model) {
        try (FileWriter writer = new FileWriter(file)) {
            int rowCount = model.getRowCount();
            int colCount = model.getColumnCount();

            for (int i = 0; i < colCount; i++) {
                writer.write(model.getColumnName(i) + "\t");
            }
            writer.write("\n");

            for (int i = 0; i < rowCount; i++) {
                for (int j = 0; j < colCount; j++) {
                    writer.write(model.getValueAt(i, j).toString() + "\t");
                }
                writer.write("\n");
            }

            writer.flush();
        } catch (IOException e) {
            System.out.println("Gagal menulis file: " + e.getMessage());
        }
    }
}


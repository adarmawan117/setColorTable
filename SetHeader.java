public class setHeader {
  // ganti 149, 223, 252 (biru muda) sabagai warna background
  // dan 0, 0, 0 (hitam) sebagai warna text
  tabelPokemon.getTableHeader().setDefaultRenderer(new MyRenderer(new java.awt.Color(149, 223, 252), new java.awt.Color(0, 0, 0)));
}


import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

class MyRenderer extends DefaultTableCellRenderer {

    Color bg, fg;

    public MyRenderer(Color bg, Color fg) {
        super();
        this.bg = bg;
        this.fg = fg;
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        
        Component cell = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        
        cell.setBackground(bg);
        cell.setForeground(fg);
        cell.setFont(new Font("Roboto", Font.BOLD, 12));

        return cell;
    }
}

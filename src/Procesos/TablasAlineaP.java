
package Procesos;

import java.awt.Component;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;


public class TablasAlineaP extends DefaultTableCellRenderer{
    DefaultTableCellRenderer CellRenderer =new DefaultTableCellRenderer();
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,boolean hasFocus,int row,int Column){
      // setHorizontalAlignment(SwingConstants.CENTER); //centrar todas las celdas
        CellRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        table.getColumnModel().getColumn(0).setCellRenderer(CellRenderer);
        table.getColumnModel().getColumn(2).setCellRenderer(CellRenderer);
        table.getColumnModel().getColumn(3).setCellRenderer(CellRenderer);
        table.getColumnModel().getColumn(4).setCellRenderer(CellRenderer);
        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, Column);
    }
    

}

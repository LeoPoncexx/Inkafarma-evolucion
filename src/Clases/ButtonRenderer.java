package Clases;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class ButtonRenderer extends DefaultTableCellRenderer {
    private final JButton button;

    public ButtonRenderer(int i) {
        switch (i) {
            case 1:
                button = new JButton("Eliminar");
                button.addActionListener(e -> {
                    JOptionPane.showMessageDialog(null, "Producto Eliminado");
                });
                break;
            case 2:
                button = new JButton("Editar");
                button.addActionListener(e -> {
                    JOptionPane.showMessageDialog(null, "Producto Editado");
                });
                break;
            default:
                button = new JButton("Error");
                break;
        }
        button.setFocusPainted(false);
        button.setContentAreaFilled(false);
        button.setBorderPainted(false);
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        return button;
    }

}


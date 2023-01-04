package com.biblioteca.util;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author joseluiz
 */
@SuppressWarnings("serial")
public class ColorirLinhaLocatario extends DefaultTableCellRenderer {

    private final int colunaLocatario;

    public ColorirLinhaLocatario(int colunaTabela) {
        this.colunaLocatario = colunaTabela;
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean Selected, boolean hasFocus,
            int row, int col) {
        Font font = new Font("DejaVu Sans", Font.BOLD, 16);
        switch (table.getValueAt(row, colunaLocatario).toString()) {

            case "ATIVO":
                setForeground(Color.white);
                setBackground(new java.awt.Color(0, 110, 109));
                setFont(font);
                setHorizontalAlignment(CENTER);
                break;

            case "SUSPENSO":
                setForeground(Color.white);
                setBackground(new java.awt.Color(255,127,0));
                setFont(font);
                setHorizontalAlignment(CENTER);
                break;

            case "BLOQUEADO":
                setForeground(Color.white);
                setBackground(Color.RED);
                setFont(font);
                setHorizontalAlignment(CENTER);
                break;

            default:
                setForeground(Color.white);
                setBackground(Color.BLACK);
                setHorizontalAlignment(CENTER);
                break;
        }
        super.getTableCellRendererComponent(table, value, Selected, hasFocus, row, col);
        return this;
    }
}

package com.example;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Sistema de Manutenção");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 600);
            frame.setLayout(new BorderLayout());

            // Cria a barra de menu
            JMenuBar menuBar = new JMenuBar();
            JMenu menu = new JMenu("Opções");
            JMenuItem addMaintenance = new JMenuItem("Adicionar Manutenção");
            JMenuItem listMaintenance = new JMenuItem("Listar Manutenções");
            menu.add(addMaintenance);
            menu.add(listMaintenance);
            menuBar.add(menu);
            frame.setJMenuBar(menuBar);

            // Painel principal
            JPanel mainPanel = new JPanel();
            frame.add(mainPanel, BorderLayout.CENTER);

            // Exibe a janela
            frame.setVisible(true);
        });
    }
}






package com.mycompany.arbolavl;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class ArbolAVL {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                JFrame frame = new GraficaArbolAVL();
                frame.setSize(400, 400);
                frame.setVisible(true);
            }

        });

    }
}

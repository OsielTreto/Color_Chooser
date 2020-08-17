package color.chooser;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ColorChooser extends JFrame implements ActionListener {

    JButton btnColor;
    Color color;
    JPanel panel;

    public ColorChooser() {
        setTitle("JColorChooser");
       
        panel = new JPanel();
        panel.setLayout(new FlowLayout());
        btnColor = new JButton("Seleccionar Color");
        btnColor.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JColorChooser Selectorcolor = new JColorChooser();
                color = Selectorcolor.showDialog(null, "Seleccione un Color", Color.BLUE);
                panel.setBackground(color);
            }
        });

        panel.add(btnColor);
        add(panel);
    }

    public static void main(String[] args) {
        ColorChooser obj = new ColorChooser();
        obj.setVisible(true);
        obj.setBounds(0, 0, 1280, 720);
        obj.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

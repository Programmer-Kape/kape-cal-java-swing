package org.kapevsc;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class KapeCalMain {

  public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
      try {
        var frame = new JFrame("Kape Calendar");
        var panel = new CalendarFrame();
        frame.setContentPane(panel.getMainPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
      }
      catch (Exception ex) {
        System.err.println(ex.getMessage());
        System.exit(1);
      }
    });
  }
}

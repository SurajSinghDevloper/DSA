package JDBC;

import java.sql.Connection;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author suraj
 */
public class ShowImg extends javax.swing.JFrame {

    /**
     * Creates new form ShowImg
     */
    public ShowImg() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        field = new javax.swing.JTextField();
        button = new javax.swing.JButton();
        image_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        button.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        button.setText("Show Image");
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(253, 253, 253)
                                                .addComponent(field, javax.swing.GroupLayout.PREFERRED_SIZE, 167,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(26, 26, 26)
                                                .addComponent(button))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(147, 147, 147)
                                                .addComponent(image_label, javax.swing.GroupLayout.PREFERRED_SIZE, 534,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(135, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(field)
                                        .addComponent(button, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(88, 88, 88)
                                .addComponent(image_label, javax.swing.GroupLayout.PREFERRED_SIZE, 304,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(36, Short.MAX_VALUE)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_buttonActionPerformed
        // Getting connection from connection class:
        Conn c = new Conn();
        Connection con = c.con();

        // getting text from text field
        String str = field.getText();

        // converting into int
        int id = Integer.parseInt(str);

        // passing id and connection to the getImageIconById method and storing in awt
        // image type
        ImageIcon icon = Helper.getImageIconById(id, con);

        if (icon == null) {
            JOptionPane.showMessageDialog(null, "No Image Found...!");
        } else {
            image_label.setIcon(icon);
        }
    }// GEN-LAST:event_buttonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ShowImg f = new ShowImg();
                f.setLocationRelativeTo(null);
                f.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button;
    private javax.swing.JTextField field;
    private javax.swing.JLabel image_label;
    // End of variables declaration//GEN-END:variables
}

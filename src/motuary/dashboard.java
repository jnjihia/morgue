/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package motuary;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Range_Rover_Sport
 */
public class dashboard extends javax.swing.JFrame {

    /**
     * Creates new form dashboard
     */
    public dashboard() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        holder = new javax.swing.JPanel();
        deceased_name_panel = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        personalpanel = new javax.swing.JPanel();
        personalinfopanel = new javax.swing.JPanel();
        deceasedlabel = new javax.swing.JLabel();
        dprsonaldtails = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        id_panel_txt = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        agetxtcpanel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        sexcpanel = new javax.swing.JLabel();
        residencecpanel = new javax.swing.JLabel();
        residencecppanel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        countycpanel = new javax.swing.JLabel();
        kininfopanel = new javax.swing.JPanel();
        deathpanel = new javax.swing.JPanel();
        print_bt = new javax.swing.JButton();
        edit_bt = new javax.swing.JButton();
        savebt = new javax.swing.JButton();

        jButton3.setText("jButton3");

        jButton4.setText("jButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        deceased_name_panel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        deceasedlabel.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        deceasedlabel.setText("Deceased");

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel1.setText("I.D");

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        jLabel3.setText("Age");

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        jLabel4.setText("Sex");

        residencecpanel.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        residencecpanel.setText("Residence");

        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        jLabel5.setText("County");

        javax.swing.GroupLayout personalinfopanelLayout = new javax.swing.GroupLayout(personalinfopanel);
        personalinfopanel.setLayout(personalinfopanelLayout);
        personalinfopanelLayout.setHorizontalGroup(
            personalinfopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personalinfopanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(personalinfopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(personalinfopanelLayout.createSequentialGroup()
                        .addComponent(deceasedlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dprsonaldtails, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(personalinfopanelLayout.createSequentialGroup()
                        .addGroup(personalinfopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(residencecpanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(personalinfopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(personalinfopanelLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap(284, Short.MAX_VALUE))
                            .addGroup(personalinfopanelLayout.createSequentialGroup()
                                .addGroup(personalinfopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(id_panel_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(personalinfopanelLayout.createSequentialGroup()
                                        .addComponent(agetxtcpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(sexcpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(personalinfopanelLayout.createSequentialGroup()
                                        .addComponent(residencecppanel, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(countycpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        personalinfopanelLayout.setVerticalGroup(
            personalinfopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personalinfopanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(personalinfopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deceasedlabel)
                    .addComponent(dprsonaldtails, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(personalinfopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(id_panel_txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(personalinfopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(personalinfopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(personalinfopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3)
                        .addGroup(personalinfopanelLayout.createSequentialGroup()
                            .addComponent(agetxtcpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(1, 1, 1)))
                    .addComponent(jLabel4)
                    .addComponent(sexcpanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(personalinfopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(personalinfopanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(personalinfopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(residencecpanel)
                            .addComponent(residencecppanel)
                            .addComponent(jLabel5)))
                    .addGroup(personalinfopanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(countycpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(74, 74, 74))
        );

        javax.swing.GroupLayout personalpanelLayout = new javax.swing.GroupLayout(personalpanel);
        personalpanel.setLayout(personalpanelLayout);
        personalpanelLayout.setHorizontalGroup(
            personalpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personalpanelLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(personalinfopanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(158, Short.MAX_VALUE))
        );
        personalpanelLayout.setVerticalGroup(
            personalpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personalpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(personalinfopanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Personal Details", personalpanel);

        javax.swing.GroupLayout kininfopanelLayout = new javax.swing.GroupLayout(kininfopanel);
        kininfopanel.setLayout(kininfopanelLayout);
        kininfopanelLayout.setHorizontalGroup(
            kininfopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );
        kininfopanelLayout.setVerticalGroup(
            kininfopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 311, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Kin Information", kininfopanel);

        javax.swing.GroupLayout deathpanelLayout = new javax.swing.GroupLayout(deathpanel);
        deathpanel.setLayout(deathpanelLayout);
        deathpanelLayout.setHorizontalGroup(
            deathpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );
        deathpanelLayout.setVerticalGroup(
            deathpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 311, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Death Information", deathpanel);

        print_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PRINT.PNG"))); // NOI18N
        print_bt.setText("Print");

        edit_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MODIFY.PNG"))); // NOI18N
        edit_bt.setText("Edit");
        edit_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_btActionPerformed(evt);
            }
        });

        savebt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BKup.png"))); // NOI18N
        savebt.setText("Save");
        savebt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout holderLayout = new javax.swing.GroupLayout(holder);
        holder.setLayout(holderLayout);
        holderLayout.setHorizontalGroup(
            holderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(holderLayout.createSequentialGroup()
                .addGroup(holderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deceased_name_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1))
                .addContainerGap())
            .addGroup(holderLayout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(print_bt)
                .addGap(60, 60, 60)
                .addComponent(edit_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(savebt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        holderLayout.setVerticalGroup(
            holderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(holderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(deceased_name_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(holderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(print_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edit_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(savebt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(holder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(holder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void edit_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_btActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edit_btActionPerformed

    private void savebtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_savebtActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel agetxtcpanel;
    private javax.swing.JLabel countycpanel;
    private javax.swing.JPanel deathpanel;
    private javax.swing.JLabel deceased_name_panel;
    private javax.swing.JLabel deceasedlabel;
    private javax.swing.JLabel dprsonaldtails;
    private javax.swing.JButton edit_bt;
    private javax.swing.JPanel holder;
    private javax.swing.JLabel id_panel_txt;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel kininfopanel;
    private javax.swing.JPanel personalinfopanel;
    private javax.swing.JPanel personalpanel;
    private javax.swing.JButton print_bt;
    private javax.swing.JLabel residencecpanel;
    private javax.swing.JLabel residencecppanel;
    private javax.swing.JButton savebt;
    private javax.swing.JLabel sexcpanel;
    // End of variables declaration//GEN-END:variables
    private String tname, tmname, tlaname, names, id, age, sex, residence, county;

    private void getservices() {

        try {
            String strSQL = "SELECT * from deceased_tb where AdminNo";
            ResultSet rs;
            DBConnection getCn = new DBConnection();
            Connection cn = getCn.getConnection();
            Statement st = cn.createStatement();

            rs = st.executeQuery(strSQL);

            int count = 0;

            while (rs.next()) {
                count = count + 1;

                tname = rs.getString(1);
                tmname = rs.getString(2);
                tlaname = rs.getString(3);
                id = rs.getString(4);
                age = rs.getString(5);
                sex = rs.getString(6);
                residence = rs.getString(7);
                county = rs.getString(8);
                
               deceased_name_panel.setText(tname + tmname + tlaname);
               id_panel_txt.setText(id);
               
               
               
                

            }

        } catch (Exception e) {
            System.out.println(e);

        }

    }

}
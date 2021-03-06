/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrontEnd;
import BackEnd.System1;
public class Patrimony extends javax.swing.JFrame {

    private System1 system;
    public Patrimony(System1 system) {
        initComponents();
        this.system = system;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        JPanel = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        JPanel1 = new javax.swing.JPanel();
        patrimony = new javax.swing.JButton();
        entityes = new javax.swing.JButton();
        complaint = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        jLabel2.setText("Utilizador:");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        JPanel.setBackground(new java.awt.Color(255, 255, 255));
        JPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registar Património", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        JPanel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        JPanel.setOpaque(false);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setText("Registar Ativos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton3.setText("Registar Passivos");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(255, 255, 255));
        jButton9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton9.setText("Fechar");
        jButton9.setOpaque(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPanelLayout = new javax.swing.GroupLayout(JPanel);
        JPanel.setLayout(JPanelLayout);
        JPanelLayout.setHorizontalGroup(
            JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelLayout.createSequentialGroup()
                .addGap(347, 347, 347)
                .addComponent(jButton9)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelLayout.createSequentialGroup()
                .addContainerGap(300, Short.MAX_VALUE)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelLayout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(290, 290, 290))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelLayout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(279, 279, 279))))
        );
        JPanelLayout.setVerticalGroup(
            JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(57, 57, 57)
                .addComponent(jButton9)
                .addGap(43, 43, 43))
        );

        getContentPane().add(JPanel, java.awt.BorderLayout.CENTER);

        JPanel1.setBackground(new java.awt.Color(255, 255, 255));
        JPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Páginas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        JPanel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        JPanel1.setOpaque(false);

        patrimony.setBackground(new java.awt.Color(255, 255, 255));
        patrimony.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        patrimony.setText("Registar Património");
        patrimony.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patrimonyActionPerformed(evt);
            }
        });

        entityes.setBackground(new java.awt.Color(255, 255, 255));
        entityes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        entityes.setText("Registar entidades intervenientes");
        entityes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entityesActionPerformed(evt);
            }
        });

        complaint.setBackground(new java.awt.Color(255, 255, 255));
        complaint.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        complaint.setText("Registar reclamações de crédito");
        complaint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                complaintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPanel1Layout = new javax.swing.GroupLayout(JPanel1);
        JPanel1.setLayout(JPanel1Layout);
        JPanel1Layout.setHorizontalGroup(
            JPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(patrimony)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addComponent(entityes)
                .addGap(31, 31, 31)
                .addComponent(complaint)
                .addContainerGap())
        );
        JPanel1Layout.setVerticalGroup(
            JPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(JPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(complaint)
                    .addComponent(entityes)
                    .addComponent(patrimony))
                .addContainerGap())
        );

        getContentPane().add(JPanel1, java.awt.BorderLayout.PAGE_START);
        getContentPane().add(jLabel5, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       Add_Asset add = new Add_Asset(system);
        add.setVisible(true);
      
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Add_Debt d = new Add_Debt(system);
        d.setVisible(true);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void patrimonyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patrimonyActionPerformed
        Patrimony p = new Patrimony(system);
        p.setVisible(true);
    }//GEN-LAST:event_patrimonyActionPerformed

    private void entityesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entityesActionPerformed
        Add_Entity e=new Add_Entity(system);
        e.setVisible(true);
    }//GEN-LAST:event_entityesActionPerformed

    private void complaintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_complaintActionPerformed
        Complaint c = new Complaint(system);
        c.setVisible(true);
    }//GEN-LAST:event_complaintActionPerformed

    /**
     * @param args the command line arguments
     */
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanel;
    private javax.swing.JPanel JPanel1;
    private javax.swing.JButton complaint;
    private javax.swing.JButton entityes;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton patrimony;
    // End of variables declaration//GEN-END:variables
}

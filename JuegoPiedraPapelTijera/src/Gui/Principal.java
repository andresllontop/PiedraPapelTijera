package Gui;

import javax.swing.JOptionPane;

/**
 *
 * @author Absolute
 */
public class Principal extends javax.swing.JFrame {

    int cont1 = 0, cont2 = 0;

    public Principal() {

        initComponents();
        setResizable(false);
        setSize(1280, 720);
        this.setLocationRelativeTo(null);
        score.setText("0");
        score2.setText("0");

        rocaJugadaUsuario.setVisible(false);
        papelJugadaUsuario.setVisible(false);
        tijeraJugadaUsuario.setVisible(false);

        rocaJugadaComputer.setVisible(false);
        papelJugadaComputer.setVisible(false);
        tijeraJugadaComputer.setVisible(false);

        labelUsuario.setVisible(false);
        labelComputer.setVisible(false);

    }

    public void IA() {
        rocaComputer.setEnabled(true);
        papelComputer.setEnabled(true);
        tijeraComputer.setEnabled(true);

        int computer = (int) (Math.random() * 3);
        String cadena = String.valueOf(computer);
        labelComputer.setText(cadena);

        if (computer == 0) {
            rocaComputer.setEnabled(false);
        } else if (computer == 1) {
            papelComputer.setEnabled(false);
        } else if (computer == 2) {
            tijeraComputer.setEnabled(false);
        }
    }

    public void game() {

        int computer = Integer.parseInt(labelComputer.getText());

        if (labelUsuario.getText() == "0" && computer == 0) {

            rocaJugadaUsuario.setVisible(true);
            papelJugadaUsuario.setVisible(false);
            tijeraJugadaUsuario.setVisible(false);

            rocaJugadaComputer.setVisible(true);
            papelJugadaComputer.setVisible(false);
            tijeraJugadaComputer.setVisible(false);

            NOTE.setText("EMPATE!");

        } else if (labelUsuario.getText() == "0" && computer == 1) {

            rocaJugadaUsuario.setVisible(true);
            papelJugadaUsuario.setVisible(false);
            tijeraJugadaUsuario.setVisible(false);

            rocaJugadaComputer.setVisible(false);
            papelJugadaComputer.setVisible(true);
            tijeraJugadaComputer.setVisible(false);

            NOTE.setText("COMPUTER WIN!");
            cont2 = cont2 + 1;

        } else if (labelUsuario.getText() == "0" && computer == 2) {

            rocaJugadaUsuario.setVisible(true);
            papelJugadaUsuario.setVisible(false);
            tijeraJugadaUsuario.setVisible(false);

            rocaJugadaComputer.setVisible(false);
            papelJugadaComputer.setVisible(false);
            tijeraJugadaComputer.setVisible(true);

            NOTE.setText("PLAYER WIN!");
            cont1 = cont1 + 1;

        } else if (labelUsuario.getText() == "0" && computer == 3) {

            rocaJugadaUsuario.setVisible(true);
            papelJugadaUsuario.setVisible(false);
            tijeraJugadaUsuario.setVisible(false);

            rocaJugadaComputer.setVisible(false);
            papelJugadaComputer.setVisible(false);
            tijeraJugadaComputer.setVisible(false);

            NOTE.setText("PLAYER WIN!");
            cont1 = cont1 + 1;

        } else if (labelUsuario.getText() == "0" && computer == 4) {

            rocaJugadaUsuario.setVisible(true);
            papelJugadaUsuario.setVisible(false);
            tijeraJugadaUsuario.setVisible(false);

            rocaJugadaComputer.setVisible(false);
            papelJugadaComputer.setVisible(false);
            tijeraJugadaComputer.setVisible(false);

            NOTE.setText("COMPUTER WIN!");
            cont2 = cont2 + 1;

///////////////////////////////////////////////////////////////
        } else if (labelUsuario.getText() == "1" && computer == 0) {

            rocaJugadaUsuario.setVisible(false);
            papelJugadaUsuario.setVisible(true);
            tijeraJugadaUsuario.setVisible(false);

            rocaJugadaComputer.setVisible(true);
            papelJugadaComputer.setVisible(false);
            tijeraJugadaComputer.setVisible(false);

            NOTE.setText("PLAYER WIN!");
            cont1 = cont1 + 1;

        } else if (labelUsuario.getText() == "1" && computer == 1) {

            rocaJugadaUsuario.setVisible(false);
            papelJugadaUsuario.setVisible(true);
            tijeraJugadaUsuario.setVisible(false);

            rocaJugadaComputer.setVisible(false);
            papelJugadaComputer.setVisible(true);
            tijeraJugadaComputer.setVisible(false);

            NOTE.setText("EMPATE!");

        } else if (labelUsuario.getText() == "1" && computer == 2) {

            rocaJugadaUsuario.setVisible(false);
            papelJugadaUsuario.setVisible(true);
            tijeraJugadaUsuario.setVisible(false);

            rocaJugadaComputer.setVisible(false);
            papelJugadaComputer.setVisible(false);
            tijeraJugadaComputer.setVisible(true);

            NOTE.setText("COMPUTER WIN!");
            cont2 = cont2 + 1;

        } else if (labelUsuario.getText() == "1" && computer == 3) {

            rocaJugadaUsuario.setVisible(false);
            papelJugadaUsuario.setVisible(true);
            tijeraJugadaUsuario.setVisible(false);

            rocaJugadaComputer.setVisible(false);
            papelJugadaComputer.setVisible(false);
            tijeraJugadaComputer.setVisible(false);

            NOTE.setText("COMPUTER WIN!");
            cont2 = cont2 + 1;

        } else if (labelUsuario.getText() == "1" && computer == 4) {

            rocaJugadaUsuario.setVisible(false);
            papelJugadaUsuario.setVisible(true);
            tijeraJugadaUsuario.setVisible(false);

            rocaJugadaComputer.setVisible(false);
            papelJugadaComputer.setVisible(false);
            tijeraJugadaComputer.setVisible(false);

            NOTE.setText("PLAYER WIN!");
            cont1 = cont1 + 1;

            ////////////////////////////////////////////
        } else if (labelUsuario.getText() == "2" && computer == 0) {

            rocaJugadaUsuario.setVisible(false);
            papelJugadaUsuario.setVisible(false);

            tijeraJugadaUsuario.setVisible(true);
            rocaJugadaComputer.setVisible(true);
            papelJugadaComputer.setVisible(false);
            tijeraJugadaComputer.setVisible(false);

            NOTE.setText("COMPUTER WIN!");
            cont2 = cont2 + 1;

        } else if (labelUsuario.getText() == "2" && computer == 1) {

            rocaJugadaUsuario.setVisible(false);
            papelJugadaUsuario.setVisible(false);
            tijeraJugadaUsuario.setVisible(true);

            rocaJugadaComputer.setVisible(false);
            papelJugadaComputer.setVisible(true);
            tijeraJugadaComputer.setVisible(false);

            NOTE.setText("PLAYER WIN!");
            cont1 = cont1 + 1;

        } else if (labelUsuario.getText() == "2" && computer == 2) {

            rocaJugadaUsuario.setVisible(false);
            papelJugadaUsuario.setVisible(false);
            tijeraJugadaUsuario.setVisible(true);

            rocaJugadaComputer.setVisible(false);
            papelJugadaComputer.setVisible(false);
            tijeraJugadaComputer.setVisible(true);

            NOTE.setText("EMPATE!");

        } else if (labelUsuario.getText() == "2" && computer == 3) {

            rocaJugadaUsuario.setVisible(false);
            papelJugadaUsuario.setVisible(false);
            tijeraJugadaUsuario.setVisible(true);

            rocaJugadaComputer.setVisible(false);
            papelJugadaComputer.setVisible(false);
            tijeraJugadaComputer.setVisible(false);

            NOTE.setText("PLAYER WIN!");
            cont1 = cont1 + 1;

        } else if (labelUsuario.getText() == "2" && computer == 4) {

            rocaJugadaUsuario.setVisible(false);
            papelJugadaUsuario.setVisible(false);
            tijeraJugadaUsuario.setVisible(true);

            rocaJugadaComputer.setVisible(false);
            papelJugadaComputer.setVisible(false);
            tijeraJugadaComputer.setVisible(false);

            NOTE.setText("COMPUTER WIN!");
            cont2 = cont2 + 1;

////////////////////////////////////////
        }

        score2.setText(cont2 + "");
        score.setText(cont1 + "");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        rocaUsuario = new javax.swing.JButton();
        papelUsuario = new javax.swing.JButton();
        tijeraUsuario = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tijeraComputer = new javax.swing.JButton();
        papelComputer = new javax.swing.JButton();
        rocaComputer = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelComputer = new javax.swing.JLabel();
        labelUsuario = new javax.swing.JLabel();
        score = new javax.swing.JLabel();
        score2 = new javax.swing.JLabel();
        NOTE = new javax.swing.JLabel();
        rocaJugadaUsuario = new javax.swing.JButton();
        papelJugadaUsuario = new javax.swing.JButton();
        tijeraJugadaUsuario = new javax.swing.JButton();
        rocaJugadaComputer = new javax.swing.JButton();
        papelJugadaComputer = new javax.swing.JButton();
        tijeraJugadaComputer = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 153, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rocaUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/rock (1).png"))); // NOI18N
        rocaUsuario.setBorderPainted(false);
        rocaUsuario.setContentAreaFilled(false);
        rocaUsuario.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsM/rock (1).png"))); // NOI18N
        rocaUsuario.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsG/rock (1).png"))); // NOI18N
        rocaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rocaUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(rocaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 160, 160));

        papelUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/paper.png"))); // NOI18N
        papelUsuario.setBorderPainted(false);
        papelUsuario.setContentAreaFilled(false);
        papelUsuario.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsM/paper.png"))); // NOI18N
        papelUsuario.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsG/paper.png"))); // NOI18N
        papelUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                papelUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(papelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 279, 180, 170));

        tijeraUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/scissors.png"))); // NOI18N
        tijeraUsuario.setBorderPainted(false);
        tijeraUsuario.setContentAreaFilled(false);
        tijeraUsuario.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsM/scissors.png"))); // NOI18N
        tijeraUsuario.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsG/scissors.png"))); // NOI18N
        tijeraUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tijeraUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(tijeraUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 279, 170, 180));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/VS.png"))); // NOI18N
        jLabel1.setText("\n\n");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, -1, -1));

        tijeraComputer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/scissors2.png"))); // NOI18N
        tijeraComputer.setBorderPainted(false);
        tijeraComputer.setContentAreaFilled(false);
        tijeraComputer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tijeraComputerActionPerformed(evt);
            }
        });
        jPanel1.add(tijeraComputer, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 300, 140, -1));

        papelComputer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/paper2.png"))); // NOI18N
        papelComputer.setBorderPainted(false);
        papelComputer.setContentAreaFilled(false);
        papelComputer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                papelComputerActionPerformed(evt);
            }
        });
        jPanel1.add(papelComputer, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 300, 140, -1));

        rocaComputer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/rock2.png"))); // NOI18N
        rocaComputer.setBorderPainted(false);
        rocaComputer.setContentAreaFilled(false);
        rocaComputer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rocaComputerActionPerformed(evt);
            }
        });
        jPanel1.add(rocaComputer, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 300, 130, 130));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 460, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, 150, 440));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 280, 460, 20));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 280, 20, 440));

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Computer");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Player ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        labelComputer.setText("jLabel4");
        jPanel1.add(labelComputer, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 140, -1, -1));

        labelUsuario.setText("jLabel4");
        jPanel1.add(labelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, -1, -1));

        score.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 36)); // NOI18N
        score.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(score, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 5, -1, -1));

        score2.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 36)); // NOI18N
        score2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(score2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 5, -1, -1));

        NOTE.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 48)); // NOI18N
        NOTE.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(NOTE, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 310, 60));

        rocaJugadaUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/rock (1).png"))); // NOI18N
        rocaJugadaUsuario.setBorderPainted(false);
        rocaJugadaUsuario.setContentAreaFilled(false);
        rocaJugadaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rocaJugadaUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(rocaJugadaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 130, 130));

        papelJugadaUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/paper.png"))); // NOI18N
        papelJugadaUsuario.setBorderPainted(false);
        papelJugadaUsuario.setContentAreaFilled(false);
        papelJugadaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                papelJugadaUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(papelJugadaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 160, -1));

        tijeraJugadaUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/scissors.png"))); // NOI18N
        tijeraJugadaUsuario.setBorderPainted(false);
        tijeraJugadaUsuario.setContentAreaFilled(false);
        tijeraJugadaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tijeraJugadaUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(tijeraJugadaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 140, -1));

        rocaJugadaComputer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/rock2.png"))); // NOI18N
        rocaJugadaComputer.setBorderPainted(false);
        rocaJugadaComputer.setContentAreaFilled(false);
        rocaJugadaComputer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rocaJugadaComputerActionPerformed(evt);
            }
        });
        jPanel1.add(rocaJugadaComputer, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 80, 130, 130));

        papelJugadaComputer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/paper2.png"))); // NOI18N
        papelJugadaComputer.setBorderPainted(false);
        papelJugadaComputer.setContentAreaFilled(false);
        papelJugadaComputer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                papelJugadaComputerActionPerformed(evt);
            }
        });
        jPanel1.add(papelJugadaComputer, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 70, 180, -1));

        tijeraJugadaComputer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/scissors2.png"))); // NOI18N
        tijeraJugadaComputer.setBorderPainted(false);
        tijeraJugadaComputer.setContentAreaFilled(false);
        tijeraJugadaComputer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tijeraJugadaComputerActionPerformed(evt);
            }
        });
        jPanel1.add(tijeraJugadaComputer, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 70, 140, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/fondo.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, -6, 1280, 730));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rocaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rocaUsuarioActionPerformed
        // TODO add your handling code here:
        System.out.print("\n click ROCA ");
        labelUsuario.setText("0");
        IA();
        game();

    }//GEN-LAST:event_rocaUsuarioActionPerformed

    private void papelUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_papelUsuarioActionPerformed
        // TODO add your handling code here:
        System.out.print("\n click PAPEL  ");
        labelUsuario.setText("1");
        IA();
        game();
    }//GEN-LAST:event_papelUsuarioActionPerformed

    private void tijeraUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tijeraUsuarioActionPerformed
        // TODO add your handling code here:
        System.out.print("\n click TIJERA ");
        labelUsuario.setText("2");
        IA();
        game();
    }//GEN-LAST:event_tijeraUsuarioActionPerformed

    private void rocaComputerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rocaComputerActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_rocaComputerActionPerformed

    private void papelComputerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_papelComputerActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_papelComputerActionPerformed

    private void tijeraComputerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tijeraComputerActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_tijeraComputerActionPerformed

    private void rocaJugadaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rocaJugadaUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rocaJugadaUsuarioActionPerformed

    private void papelJugadaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_papelJugadaUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_papelJugadaUsuarioActionPerformed

    private void tijeraJugadaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tijeraJugadaUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tijeraJugadaUsuarioActionPerformed

    private void rocaJugadaComputerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rocaJugadaComputerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rocaJugadaComputerActionPerformed

    private void papelJugadaComputerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_papelJugadaComputerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_papelJugadaComputerActionPerformed

    private void tijeraJugadaComputerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tijeraJugadaComputerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tijeraJugadaComputerActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NOTE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel labelComputer;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JButton papelComputer;
    private javax.swing.JButton papelJugadaComputer;
    private javax.swing.JButton papelJugadaUsuario;
    private javax.swing.JButton papelUsuario;
    private javax.swing.JButton rocaComputer;
    private javax.swing.JButton rocaJugadaComputer;
    private javax.swing.JButton rocaJugadaUsuario;
    private javax.swing.JButton rocaUsuario;
    private javax.swing.JLabel score;
    private javax.swing.JLabel score2;
    private javax.swing.JButton tijeraComputer;
    private javax.swing.JButton tijeraJugadaComputer;
    private javax.swing.JButton tijeraJugadaUsuario;
    private javax.swing.JButton tijeraUsuario;
    // End of variables declaration//GEN-END:variables
}

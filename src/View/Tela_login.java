/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Conec;
import Model.Usuario;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author rodri
 */
public class Tela_login extends javax.swing.JFrame {

    /**
     * Creates new form Tela_login
     */
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public Tela_login() {
        initComponents();
        this.setTitle("RC MILK - LOGIN");
        try {
            con = Conec.Conectar();
        } catch (ClassNotFoundException e) {
            Logger.getLogger(Tela_login.class.getName()).log(Level.SEVERE, null, e);
        }
        setIcon();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sair = new javax.swing.JButton();
        usuarioD = new javax.swing.JTextField();
        usuarioL = new javax.swing.JLabel();
        senhaL = new javax.swing.JLabel();
        senhaD = new javax.swing.JPasswordField();
        logo_LoginL = new javax.swing.JLabel();
        esqueceuD = new javax.swing.JToggleButton();
        esqueceL = new javax.swing.JLabel();
        ConfigD = new javax.swing.JToggleButton();
        configL = new javax.swing.JLabel();
        entrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                formComponentRemoved(evt);
            }
        });
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                maximizar(evt);
            }
        });

        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });

        usuarioD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioDActionPerformed(evt);
            }
        });
        usuarioD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usuarioDKeyPressed(evt);
            }
        });

        usuarioL.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        usuarioL.setText("Usuário:");

        senhaL.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        senhaL.setText("Senha:");

        senhaD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                senhaDKeyPressed(evt);
            }
        });

        logo_LoginL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Logo_login.png"))); // NOI18N

        esqueceuD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/esqueci.png"))); // NOI18N
        esqueceuD.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        esqueceuD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esqueceuDActionPerformed(evt);
            }
        });

        esqueceL.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        esqueceL.setText("Esqueceu a senha?");

        ConfigD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/configuracao.png"))); // NOI18N
        ConfigD.setBorder(null);

        configL.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        configL.setText("Configuração");

        entrar.setText("Entrar");
        entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarActionPerformed(evt);
            }
        });
        entrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                entrarKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo_LoginL, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(senhaL)
                            .addComponent(usuarioL))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(senhaD)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(usuarioD)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 50, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(esqueceL, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(configL, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(ConfigD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(esqueceuD, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(usuarioL, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(usuarioD, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(senhaL, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(senhaD, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(esqueceL, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(esqueceuD, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(configL)
                            .addComponent(ConfigD, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(logo_LoginL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_sairActionPerformed

    private void usuarioDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioDActionPerformed

    private void formComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_formComponentRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentRemoved

    private void maximizar(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_maximizar
        this.setResizable(false);        // TODO add your handling code here:
    }//GEN-LAST:event_maximizar

    private void usuarioDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usuarioDKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            senhaD.requestFocus();
        }
    }//GEN-LAST:event_usuarioDKeyPressed
    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagens/4.png")));

    }
    private void esqueceuDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esqueceuDActionPerformed
        String sql = "select nome_usuario,telefone,email from tb_usuario where id_usuario = 1";
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            rs.next();
            Icon figura = new ImageIcon(getToolkit().createImage(getClass().getResource("/Imagens/suporte.png")));
            JOptionPane.showMessageDialog(null, "Entre em contato com:\nSuporte: " + rs.getString("nome_usuario")
                    + "\nTelefone: " + rs.getString("telefone") + "\nE-mail: "
                    + rs.getString("email"), "RC MILK - SUPORTE", JOptionPane.PLAIN_MESSAGE, figura);
        } catch (SQLException E) {
            JOptionPane.showMessageDialog(null, E);
        }           // TODO add your handling code here:
    }//GEN-LAST:event_esqueceuDActionPerformed

    private void senhaDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_senhaDKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == evt.VK_ENTER) {
            entrar.requestFocus();
        }

    }//GEN-LAST:event_senhaDKeyPressed

    private void entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarActionPerformed

        Usuario user = new Usuario();
        user.setUser(usuarioD.getText());
        boolean aux_user = user.pesquisar();
        if (aux_user == true) {
            if (!user.getSenha().equals(senhaD.getText())) {
                JOptionPane.showMessageDialog(null, "Senha inválida");
                senhaD.setText("");
                senhaD.requestFocus();
                return;
            }
            if (user.getAtivo() == false) {
                JOptionPane.showMessageDialog(null, "Usuario: " + user.getUser() + " Inativo.");
                usuarioD.requestFocus();
                usuarioD.setText("");
                senhaD.setText("");
                return;
            } else {
                String fazenda = "";
                String prop = "";
                String sql = "SELECT nome_fazenda, nome_prop FROM tb_fazenda where id_fazenda = 1";
                try {
                    pst = con.prepareStatement(sql);
                    rs = pst.executeQuery();
                    rs.next();
                    fazenda = rs.getString("nome_fazenda");
                    prop = rs.getString("nome_prop");
                } catch (SQLException E) {
                    JOptionPane.showMessageDialog(null, E);
                }
                System.out.println(fazenda + prop);
                JOptionPane.showMessageDialog(null, "Bem Vindo,\n" + user.getNome() + ".");
                TelaPrincipal telaP = new TelaPrincipal();
                telaP.setVisible(true);
                telaP.setTitle("RC MILK");
                telaP.usuarioLogadoInfo.setText(user.getUser());
                telaP.fazendaLogada1.setText(fazenda);
                telaP.propLogado.setText(prop);
                this.dispose();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Usuario inválido");
        }
    }//GEN-LAST:event_entrarActionPerformed

    private void entrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_entrarKeyPressed
        Usuario user = new Usuario();
        user.setUser(usuarioD.getText());
        boolean aux_user = user.pesquisar();
        if (aux_user == true) {
            if (!user.getSenha().equals(senhaD.getText())) {
                JOptionPane.showMessageDialog(null, "Senha inválida");
                senhaD.setText("");
                senhaD.requestFocus();
                return;
            }
            if (user.getAtivo() == false) {
                JOptionPane.showMessageDialog(null, "Usuario: " + user.getUser() + " Inativo.");
                usuarioD.requestFocus();
                usuarioD.setText("");
                senhaD.setText("");
                return;
            } else {
                String fazenda = "";
                String prop = "";
                String sql = "SELECT nome_fazenda, nome_prop FROM tb_fazenda where id_fazenda = 1";
                try {
                    pst = con.prepareStatement(sql);
                    rs = pst.executeQuery();
                    rs.next();
                    fazenda = rs.getString("nome_fazenda");
                    prop = rs.getString("nome_prop");
                } catch (SQLException E) {
                    JOptionPane.showMessageDialog(null, E);
                }
                System.out.println("aqui ante");
                System.out.println(fazenda + prop);
                JOptionPane.showMessageDialog(null, "Bem Vindo,\n" + user.getNome() + ".");
                TelaPrincipal telaP = new TelaPrincipal();
                telaP.setVisible(true);
                telaP.setTitle("RC MILK");
                telaP.usuarioLogadoInfo.setText(user.getUser());
                telaP.fazendaLogada1.setText(fazenda);
                telaP.propLogado.setText(prop);
                this.dispose();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Usuario inválido");
        }
    }//GEN-LAST:event_entrarKeyPressed
    private void carregadadosfiliais() {

    }

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
            java.util.logging.Logger.getLogger(Tela_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Tela_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton ConfigD;
    private javax.swing.JLabel configL;
    private javax.swing.JButton entrar;
    private javax.swing.JLabel esqueceL;
    private javax.swing.JToggleButton esqueceuD;
    private javax.swing.JLabel logo_LoginL;
    private javax.swing.JButton sair;
    private javax.swing.JPasswordField senhaD;
    private javax.swing.JLabel senhaL;
    private javax.swing.JTextField usuarioD;
    private javax.swing.JLabel usuarioL;
    // End of variables declaration//GEN-END:variables

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author rodri
 */
public class TelaCadastroUsuario extends javax.swing.JFrame {

    int aux_inclu = 0;
    int aux_altera = 0;
    int aux_excluir = 0;

    /**
     * Creates new form TelaCadastroBovino
     */
    public TelaCadastroUsuario() {
        initComponents();
        this.desabilitaCampos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        alterarU = new javax.swing.JButton();
        inclusaoU = new javax.swing.JButton();
        excluirU = new javax.swing.JButton();
        pesquisarU = new javax.swing.JButton();
        listarB = new javax.swing.JButton();
        nomeUsuarioL = new javax.swing.JLabel();
        usuarioL = new javax.swing.JLabel();
        salvarU = new javax.swing.JButton();
        nomeUsuarioD = new javax.swing.JTextField();
        ativoD = new javax.swing.JCheckBox();
        senhaL = new javax.swing.JLabel();
        usuarioD = new javax.swing.JTextField();
        emailD = new javax.swing.JTextField();
        emailL = new javax.swing.JLabel();
        telefoneL = new javax.swing.JLabel();
        telefoneD = new javax.swing.JFormattedTextField();
        senhaD = new javax.swing.JPasswordField();
        codD = new javax.swing.JTextField();
        limparU = new javax.swing.JButton();
        cancelarU = new javax.swing.JButton();
        codUsuarioL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        alterarU.setText("Alterar");
        alterarU.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        alterarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarUActionPerformed(evt);
            }
        });

        inclusaoU.setText("Incluir");
        inclusaoU.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        inclusaoU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inclusaoUActionPerformed(evt);
            }
        });

        excluirU.setText("Excluir");
        excluirU.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        excluirU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirUActionPerformed(evt);
            }
        });

        pesquisarU.setText("Pesquisar");
        pesquisarU.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pesquisarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarUActionPerformed(evt);
            }
        });

        listarB.setText("Listar");
        listarB.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        listarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarBActionPerformed(evt);
            }
        });

        nomeUsuarioL.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nomeUsuarioL.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nomeUsuarioL.setText("Nome:");

        usuarioL.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        usuarioL.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        usuarioL.setText("Usuário:");

        salvarU.setText("Salvar");
        salvarU.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        salvarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarUActionPerformed(evt);
            }
        });

        nomeUsuarioD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeUsuarioDActionPerformed(evt);
            }
        });

        ativoD.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ativoD.setText("Ativo");
        ativoD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ativoDActionPerformed(evt);
            }
        });

        senhaL.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        senhaL.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        senhaL.setText("Senha:");

        usuarioD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioDActionPerformed(evt);
            }
        });

        emailL.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        emailL.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        emailL.setText("E-mail:");

        telefoneL.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        telefoneL.setText("Telefone:");

        try {
            telefoneD.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)# ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        telefoneD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefoneDActionPerformed(evt);
            }
        });

        codD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codDActionPerformed(evt);
            }
        });

        limparU.setText("Limpar");
        limparU.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        limparU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparUActionPerformed(evt);
            }
        });

        cancelarU.setText("Cancelar");
        cancelarU.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cancelarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarUActionPerformed(evt);
            }
        });

        codUsuarioL.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        codUsuarioL.setText("Código:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(emailL, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(emailD, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(cancelarU, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(limparU, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(salvarU, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nomeUsuarioL, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(nomeUsuarioD, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(ativoD))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(usuarioL, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)
                                        .addComponent(usuarioD))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(senhaL, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addComponent(senhaD, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(4, 4, 4)
                                        .addComponent(telefoneL)))
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(telefoneD, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(codUsuarioL)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(codD, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inclusaoU, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alterarU, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listarB, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pesquisarU, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(excluirU, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inclusaoU)
                            .addComponent(nomeUsuarioD, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(codD, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(codUsuarioL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(usuarioD, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(usuarioL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(telefoneD, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(telefoneL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(senhaD, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(senhaL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(emailD, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(emailL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cancelarU)
                                    .addComponent(limparU)
                                    .addComponent(salvarU)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(alterarU)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(listarB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pesquisarU)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(excluirU))))
                    .addComponent(nomeUsuarioL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ativoD, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void alterarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarUActionPerformed
        boolean aux;
        do {
            String imput;
            imput = (JOptionPane.showInputDialog(null, "Digite o Usuario:"));
            usuarioD.setText(imput);
            if (imput == null) {
                System.out.println("Cancel is pressed");
                break;
            }
            Usuario user = new Usuario();
            user.setUser(usuarioD.getText());
            aux = user.pesquisar();
            if (aux) {
                codD.setText(Integer.toString(user.getCodigo()));
                ativoD.setSelected(user.getAtivo());
                nomeUsuarioD.setText(user.getNome());
                usuarioD.setText(user.getUser());
                senhaD.setText(user.getSenha());
                telefoneD.setText(user.getTelefone());
                emailD.setText(user.getEmail());
                this.habilitaCampos();
                aux_altera = 1;
            }
        } while (!aux);
    }//GEN-LAST:event_alterarUActionPerformed

    private void listarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarBActionPerformed
        TelaListagemUsuario telaLU = new TelaListagemUsuario();
        telaLU.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_listarBActionPerformed

    private void salvarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarUActionPerformed
        // TODO add your handling code here:
        if (aux_inclu == 1) {
            Usuario user = new Usuario();
            user.setAtivo(ativoD.isSelected());
            user.setNome(nomeUsuarioD.getText());
            user.setUser(usuarioD.getText());
            user.setSenha(senhaD.getText());
            user.setTelefone(telefoneD.getText());
            user.setEmail(emailD.getText());
            boolean aux_user = user.pesquisar();
            if (nomeUsuarioD.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Campo Nome não pode ser vazio.");
            }
            if (usuarioD.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Campo Usuario não pode ser vazio.");
            }
            if (senhaD.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Campo Senha não pode ser vazio.");
            }
            if (aux_user == true) {
                JOptionPane.showMessageDialog(null, "Já existe um usuario com esse login.\nPor favor cadastre um outro login.");
            } else {
                user.cadastrar();
                this.desabilitaCampos();
                this.limpaCampos();
                aux_inclu = 0;
            }
        }
        if (aux_altera == 1) {
            Usuario user = new Usuario();
            user.setCodigo(Integer.parseInt(codD.getText()));
            user.setAtivo(ativoD.isSelected());
            user.setNome(nomeUsuarioD.getText());
            user.setUser(usuarioD.getText());
            user.setSenha(senhaD.getText());
            user.setTelefone(telefoneD.getText());
            user.setEmail(emailD.getText());
            if (nomeUsuarioD.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Campo Nome não pode ser vazio");
            }
            if (usuarioD.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Campo Usuario não pode ser vazio");
            }
            if (senhaD.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Campo Senha não pode ser vazio");
            } else {
                user.alterar();
                this.desabilitaCampos();
                aux_altera = 0;
                this.limpaCampos();
            }
        }
        if (aux_excluir == 1) {
            Usuario user = new Usuario();
            user.setCodigo(Integer.parseInt(codD.getText()));
            user.setAtivo(ativoD.isSelected());
            user.setNome(nomeUsuarioD.getText());
            user.setUser(usuarioD.getText());
            user.setSenha(senhaD.getText());
            user.setTelefone(telefoneD.getText());
            user.setEmail(emailD.getText());
            if (nomeUsuarioD.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Campo Nome não pode ser vazio");
            }
            if (usuarioD.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Campo Usuario não pode ser vazio");
            }
            if (senhaD.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Campo Senha não pode ser vazio");
            } else {
                user.excluir();
                this.desabilitaCampos();
                aux_altera = 0;
                this.limpaCampos();
            }
        }
    }//GEN-LAST:event_salvarUActionPerformed
    public void limpaCampos() {
        ativoD.setHideActionText(false);
        nomeUsuarioD.setText("");
        usuarioD.setText("");
        senhaD.setText("");
        telefoneD.setText("");
        emailD.setText("");
    }
    private void ativoDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ativoDActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_ativoDActionPerformed

    private void nomeUsuarioDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeUsuarioDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeUsuarioDActionPerformed

    private void telefoneDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefoneDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefoneDActionPerformed

    private void usuarioDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioDActionPerformed

    private void inclusaoUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inclusaoUActionPerformed
        this.habilitaCampos();
        aux_inclu = 1;
        // TODO add your handling code here:
    }//GEN-LAST:event_inclusaoUActionPerformed

    private void pesquisarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarUActionPerformed
        usuarioD.setText(JOptionPane.showInputDialog("Digite o Usuario:"));
        Usuario user = new Usuario();
        user.setUser(usuarioD.getText());
        boolean aux_user = user.pesquisar();
        if (aux_user == true) {
            JOptionPane.showMessageDialog(null, "Usuario Encontrado");
        } else {
            JOptionPane.showMessageDialog(null, "Usuario Não Encontrado");
        }
        codD.setText(Integer.toString(user.getCodigo()));
        ativoD.setSelected(user.getAtivo());
        nomeUsuarioD.setText(user.getNome());
        usuarioD.setText(user.getUser());
        senhaD.setText(user.getSenha());
        telefoneD.setText(user.getTelefone());
        emailD.setText(user.getEmail());

    }//GEN-LAST:event_pesquisarUActionPerformed

    private void limparUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparUActionPerformed
        // TODO add your handling code here:
        this.limpaCampos();
    }//GEN-LAST:event_limparUActionPerformed
    public void desabilitaCampos() {
        nomeUsuarioD.setEnabled(false);
        ativoD.setEnabled(false);
        codD.setEnabled(false);
        emailD.setEnabled(false);
        salvarU.setEnabled(false);
        senhaD.setEnabled(false);
        telefoneD.setEnabled(false);
        usuarioD.setEnabled(false);
        limparU.setEnabled(false);
        cancelarU.setEnabled(false);
    }

    public void habilitaCampos() {
        nomeUsuarioD.setEnabled(true);
        ativoD.setEnabled(true);
        emailD.setEnabled(true);
        salvarU.setEnabled(true);
        senhaD.setEnabled(true);
        telefoneD.setEnabled(true);
        usuarioD.setEnabled(true);
        limparU.setEnabled(true);
        cancelarU.setEnabled(true);
    }
    private void cancelarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarUActionPerformed
        // TODO add your handling code here:
        this.limpaCampos();
        aux_inclu = 0;
        aux_altera = 0;
        aux_excluir = 0;
        nomeUsuarioD.setEnabled(false);
        ativoD.setEnabled(false);
        codD.setEnabled(false);
        emailD.setEnabled(false);
        salvarU.setEnabled(false);
        senhaD.setEnabled(false);
        telefoneD.setEnabled(false);
        usuarioD.setEnabled(false);
        limparU.setEnabled(false);
        cancelarU.setEnabled(false);
    }//GEN-LAST:event_cancelarUActionPerformed

    private void codDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codDActionPerformed

    private void excluirUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirUActionPerformed
        boolean aux;
        do {
            String imput;
            imput = (JOptionPane.showInputDialog("Digite o Usuario:"));
            usuarioD.setText(imput);
            if (imput == null) {
                break;
            }
            Usuario user = new Usuario();
            user.setUser(usuarioD.getText());
            aux = user.pesquisar();
            if (aux) {
                codD.setText(Integer.toString(user.getCodigo()));
                ativoD.setSelected(user.getAtivo());
                nomeUsuarioD.setText(user.getNome());
                usuarioD.setText(user.getUser());
                senhaD.setText(user.getSenha());
                telefoneD.setText(user.getTelefone());
                emailD.setText(user.getEmail());
                this.habilitaCampos();
                aux_excluir = 1;
            }
        } while (!aux);        // TODO add your handling code here:
    }//GEN-LAST:event_excluirUActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterarU;
    private javax.swing.JCheckBox ativoD;
    private javax.swing.JButton cancelarU;
    private javax.swing.JTextField codD;
    private javax.swing.JLabel codUsuarioL;
    private javax.swing.JTextField emailD;
    private javax.swing.JLabel emailL;
    private javax.swing.JButton excluirU;
    private javax.swing.JButton inclusaoU;
    private javax.swing.JButton limparU;
    private javax.swing.JButton listarB;
    private javax.swing.JTextField nomeUsuarioD;
    private javax.swing.JLabel nomeUsuarioL;
    private javax.swing.JButton pesquisarU;
    private javax.swing.JButton salvarU;
    private javax.swing.JPasswordField senhaD;
    private javax.swing.JLabel senhaL;
    private javax.swing.JFormattedTextField telefoneD;
    private javax.swing.JLabel telefoneL;
    private javax.swing.JTextField usuarioD;
    private javax.swing.JLabel usuarioL;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Cio;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author rodri
 */
public class TelaParto extends javax.swing.JFrame {

    int aux_inclu = 0;
    int aux_altera = 0;

    /**
     * Creates new form TelaCadastroBovino
     */
    public TelaParto() {
        initComponents();
        this.desabilitaCampos();
        this.limpaCampos();
        this.desabilitaCampos();
        this.codVacaD.setEditable(false);
        this.nomeVacaD.setEditable(false);
        this.codTouroD.setEditable(false);
        this.nomeTouroD.setEditable(false);
        this.dataCioD.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inclusaoU = new javax.swing.JButton();
        salvarU = new javax.swing.JButton();
        limparU = new javax.swing.JButton();
        cancelarU = new javax.swing.JButton();
        codCioL = new javax.swing.JLabel();
        pesquisaCio = new javax.swing.JButton();
        codCioD = new javax.swing.JTextField();
        PainelExebicaodeCio = new javax.swing.JPanel();
        dataCioD = new com.toedter.calendar.JDateChooser();
        dataCioL = new javax.swing.JLabel();
        nomeTouroD = new javax.swing.JTextField();
        codTouroL = new javax.swing.JLabel();
        codVacaD = new javax.swing.JTextField();
        codVacaL = new javax.swing.JLabel();
        codTouroD = new javax.swing.JTextField();
        nomeVacaD = new javax.swing.JTextField();
        dataRepetiu = new com.toedter.calendar.JDateChooser();
        dataConfirmacaoL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        inclusaoU.setText("Incluir");
        inclusaoU.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        inclusaoU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inclusaoUActionPerformed(evt);
            }
        });

        salvarU.setText("Salvar");
        salvarU.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        salvarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarUActionPerformed(evt);
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

        codCioL.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        codCioL.setText("Cod. Cio:");

        pesquisaCio.setText("pesquisa");
        pesquisaCio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisaCioActionPerformed(evt);
            }
        });

        codCioD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codCioDActionPerformed(evt);
            }
        });

        PainelExebicaodeCio.setBackground(new java.awt.Color(204, 204, 204));

        dataCioL.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        dataCioL.setText("Data Do Cio");

        codTouroL.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        codTouroL.setText("Cod. Touro:");

        codVacaD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codVacaDActionPerformed(evt);
            }
        });

        codVacaL.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        codVacaL.setText("Cod. Vaca:");

        codTouroD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codTouroDActionPerformed(evt);
            }
        });

        nomeVacaD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeVacaDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelExebicaodeCioLayout = new javax.swing.GroupLayout(PainelExebicaodeCio);
        PainelExebicaodeCio.setLayout(PainelExebicaodeCioLayout);
        PainelExebicaodeCioLayout.setHorizontalGroup(
            PainelExebicaodeCioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelExebicaodeCioLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(PainelExebicaodeCioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(codTouroL, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dataCioL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codVacaL, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelExebicaodeCioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelExebicaodeCioLayout.createSequentialGroup()
                        .addGroup(PainelExebicaodeCioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(codTouroD, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(codVacaD, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PainelExebicaodeCioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nomeVacaD, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(nomeTouroD)))
                    .addComponent(dataCioD, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PainelExebicaodeCioLayout.setVerticalGroup(
            PainelExebicaodeCioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelExebicaodeCioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelExebicaodeCioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeVacaD, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codVacaD, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codVacaL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelExebicaodeCioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codTouroL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codTouroD, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeTouroD, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelExebicaodeCioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dataCioD, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataCioL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dataConfirmacaoL.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        dataConfirmacaoL.setText("Data de Novo Cio:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(codCioL)
                        .addGap(26, 26, 26)
                        .addComponent(codCioD, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(pesquisaCio, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PainelExebicaodeCio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dataConfirmacaoL, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dataRepetiu, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(inclusaoU, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(cancelarU, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(limparU, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(salvarU, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pesquisaCio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(codCioD)
                        .addComponent(codCioL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PainelExebicaodeCio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dataRepetiu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataConfirmacaoL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelarU)
                    .addComponent(limparU)
                    .addComponent(salvarU)
                    .addComponent(inclusaoU))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void salvarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarUActionPerformed
        if(aux_inclu==1){
            Cio cio = new Cio();
            if (this.codCioD.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Campo Cod Cio nao pode ser Vazio");
                aux_inclu = 0;
            }
            cio.setCodCio(Integer.parseInt(this.codCioD.getText())); 
            cio.setDataCio(this.dataCioD.getDate());
            cio.setCodVaca(Integer.parseInt(this.codVacaD.getText()));
            cio.setNomeVaca(this.nomeVacaD.getText());
            cio.setCodTouro(Integer.parseInt(this.codTouroD.getText()));
            cio.setNomeTouro(this.nomeTouroD.getText());
            cio.setRepetiuCio(true);
            if (this.dataRepetiu.getDate() == null) {
                JOptionPane.showMessageDialog(null, "Campo Data do novo Cio não pode ser Vazio");
                aux_inclu = 0;
            }
            if(aux_inclu == 1){
                
                int resposta;
                    resposta = JOptionPane.showConfirmDialog( null,"Confirma a que a vaca:  " +this.nomeVacaD.getText()+" repetiu o Cio no dia: " + dataRepetiu.getDate(), "Confirmacao de Cio Repetido",JOptionPane.YES_NO_OPTION);
                    System.out.println(resposta);
                if(resposta == 0){
                    cio.repetiu();
                    this.desabilitaCampos();
                    aux_inclu = 0;
                    this.limpaCampos();
                    TelaCadastroCio telaC = new  TelaCadastroCio();
                    telaC.setVisible(true);
                    telaC.setTitle("RC MILK - CIOS");
                    String cod,nome;
                    cod =this.codVacaD.getText();
                    nome=this.nomeVacaD.getText();
                    telaC.cadastraCioRepetido(Integer.toString(cio.getCodCio()),cio.getNomeVaca(),dataRepetiu.getDate());
 
                }

            }
        }
        
    }//GEN-LAST:event_salvarUActionPerformed
    public void limpaCampos() {
        this.codCioD.setText("");
        this.codVacaD.setText("");
        this.codTouroD.setText("");
        this.dataCioD.setDate(null);
        this.nomeTouroD.setText("");
        this.nomeVacaD.setText("");
    }

    
    public void desabilitaCampos() {
        this.codVacaD.setEnabled(false);
        this.pesquisaCio.setEnabled(false);
        this.codCioD.setEnabled(false);
        this.codTouroD.setEnabled(false);
        this.dataCioD.setEnabled(false);
        this.nomeTouroD.setEnabled(false);
        this.nomeVacaD.setEnabled(false);
        this.limparU.setEnabled(false);
        this.cancelarU.setEnabled(false);
        this.salvarU.setEnabled(false);
        this.dataRepetiu.setEnabled(false);
    }

    public void habilitaCampos() {
        this.codVacaD.setEnabled(true);
        this.pesquisaCio.setEnabled(true);
        this.codCioD.setEnabled(true);
        this.codTouroD.setEnabled(true);
        this.nomeTouroD.setEnabled(true);
        this.nomeVacaD.setEnabled(true);
        this.limparU.setEnabled(true);
        this.cancelarU.setEnabled(true);
        this.salvarU.setEnabled(true);
        this.dataRepetiu.setEnabled(true);
    }
    private void inclusaoUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inclusaoUActionPerformed
        this.habilitaCampos();
        aux_inclu = 1;
        // TODO add your handling code here:
    }//GEN-LAST:event_inclusaoUActionPerformed

    private void limparUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparUActionPerformed
        // TODO add your handling code here:
        this.limpaCampos();
    }//GEN-LAST:event_limparUActionPerformed

    private void cancelarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarUActionPerformed
        this.limpaCampos();
        this.desabilitaCampos();
    }//GEN-LAST:event_cancelarUActionPerformed

    private void nomeVacaDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeVacaDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeVacaDActionPerformed

    private void codVacaDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codVacaDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codVacaDActionPerformed

    private void codTouroDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codTouroDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codTouroDActionPerformed
    public void retornaValorCio(int codCio,Date dataCio,int codvaca, String nomevaca,int codTouro, String nomeTouro,Date dtConfirmado,Boolean confirmaC) {
        this.codCioD.setText(Integer.toString(codCio));
        this.codVacaD.setText(Integer.toString(codvaca));
        this.nomeVacaD.setText(nomevaca);
        this.codTouroD.setText(Integer.toString(codTouro));
        this.nomeTouroD.setText(nomeTouro);
        this.dataCioD.setDate(dataCio);
    }
    private void pesquisaCioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisaCioActionPerformed
        TelaPesquisaCiosRepetidos telaPB = new TelaPesquisaCiosRepetidos();
        telaPB.setTitle("RC MILK - PESQUISA DE CIOS");
        telaPB.IniciaTabela();
        telaPB.setVisible(true);

    }//GEN-LAST:event_pesquisaCioActionPerformed

    private void codCioDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codCioDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codCioDActionPerformed

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
            java.util.logging.Logger.getLogger(TelaParto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaParto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaParto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaParto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new TelaParto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelExebicaodeCio;
    private javax.swing.JButton cancelarU;
    private javax.swing.JTextField codCioD;
    private javax.swing.JLabel codCioL;
    private javax.swing.JTextField codTouroD;
    private javax.swing.JLabel codTouroL;
    private javax.swing.JTextField codVacaD;
    private javax.swing.JLabel codVacaL;
    private com.toedter.calendar.JDateChooser dataCioD;
    private javax.swing.JLabel dataCioL;
    private javax.swing.JLabel dataConfirmacaoL;
    private com.toedter.calendar.JDateChooser dataRepetiu;
    private javax.swing.JButton inclusaoU;
    private javax.swing.JButton limparU;
    private javax.swing.JTextField nomeTouroD;
    private javax.swing.JTextField nomeVacaD;
    private javax.swing.JButton pesquisaCio;
    private javax.swing.JButton salvarU;
    // End of variables declaration//GEN-END:variables
}

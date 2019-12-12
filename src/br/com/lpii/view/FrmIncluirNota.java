/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lpii.view;

import br.com.lpii.dao.AlunoDAO;
import br.com.lpii.dao.PropostaDAO;
import br.com.lpii.model.Aluno;
import br.com.lpii.model.Proposta;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Alexandre Lima
 */
public class FrmIncluirNota extends javax.swing.JFrame {
    
    
    Proposta proposta;
    Aluno aluno;

    public Proposta getProposta() {
        return proposta;
    }

    public void setProposta(Proposta proposta) {
        this.proposta = proposta;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    
    
    
    /**
     * Creates new form FrmIncluirNota
     */
    public FrmIncluirNota() {
        initComponents();
        txt_matricula.setEnabled(false);
        txt_aluno.setEnabled(false);
        txt_tema.setEnabled(false);
        txt_nota_orientador.setEnabled(false);
        txt_nota_banca1.setEnabled(false);
        txt_nota_banca2.setEnabled(false);
        btn_calcular.setEnabled(false);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_matricula = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_aluno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_tema = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_nota_orientador = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_nota_banca1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_nota_banca2 = new javax.swing.JTextField();
        btn_calcular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Incluir notas");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 153, 51));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 153, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Incluir notas do TC");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo-instituto.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 51));
        jLabel2.setText("Matrícula:");

        txt_matricula.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_matricula.setForeground(new java.awt.Color(0, 153, 51));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 51));
        jLabel3.setText("Aluno:");

        txt_aluno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_aluno.setForeground(new java.awt.Color(0, 153, 51));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 51));
        jLabel4.setText("Tema:");

        txt_tema.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_tema.setForeground(new java.awt.Color(0, 153, 51));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 51));
        jLabel5.setText("Nota Orientador");

        txt_nota_orientador.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_nota_orientador.setForeground(new java.awt.Color(0, 153, 51));
        txt_nota_orientador.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_nota_orientadorFocusLost(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 51));
        jLabel9.setText("Nota banca 1");

        txt_nota_banca1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_nota_banca1.setForeground(new java.awt.Color(0, 153, 51));
        txt_nota_banca1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_nota_banca1FocusLost(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 51));
        jLabel10.setText("Nota Banca 2");

        txt_nota_banca2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_nota_banca2.setForeground(new java.awt.Color(0, 153, 51));
        txt_nota_banca2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_nota_banca2FocusLost(evt);
            }
        });

        btn_calcular.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_calcular.setForeground(new java.awt.Color(0, 153, 51));
        btn_calcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/calculator_add.png"))); // NOI18N
        btn_calcular.setText("Calcular e Salvar");
        btn_calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_nota_orientador, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(53, 53, 53)
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_nota_banca1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(54, 54, 54)
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_nota_banca2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_aluno)
                                .addComponent(txt_matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_tema, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_matricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_aluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_tema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nota_orientador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txt_nota_banca1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txt_nota_banca2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(38, 38, 38)
                .addComponent(btn_calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // Carrega dados da proposta
        PropostaDAO dao = new PropostaDAO();
        proposta = dao.getProposta(proposta.getPropostaId());
        
        // Preenche os campos apenas como leitura
        txt_matricula.setText(String.valueOf(proposta.getPropostaId()));
        txt_matricula.setEditable(false);
        txt_aluno.setText(aluno.getNome());
        txt_aluno.setEditable(false);
        txt_tema.setText(proposta.getPropostaTitulo());
        txt_tema.setEditable(false);
        txt_nota_orientador.setEnabled(true);
        txt_nota_banca1.setEnabled(true);
        txt_nota_banca2.setEnabled(true);
        btn_calcular.setEnabled(true);
                
    }//GEN-LAST:event_formWindowActivated

    private void txt_nota_banca2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_nota_banca2FocusLost
        /// Valida para verificar se não há letras
        ValidaNumero(txt_nota_banca2);
    }//GEN-LAST:event_txt_nota_banca2FocusLost

    private void txt_nota_banca1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_nota_banca1FocusLost
       // Valida para verificar se não há letras
        ValidaNumero(txt_nota_banca1);
    }//GEN-LAST:event_txt_nota_banca1FocusLost

    private void txt_nota_orientadorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_nota_orientadorFocusLost
        /// Valida para verificar se não há letras
        ValidaNumero(txt_nota_orientador);
    }//GEN-LAST:event_txt_nota_orientadorFocusLost

    private void btn_calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calcularActionPerformed
        // Salva nota do aluno
        // Se alguma das notas estiverem em branco
        if (txt_nota_orientador.getText().equals("") || txt_nota_banca1.getText().equals("") || txt_nota_banca2.getText().equals("")) {
            // Informa que todas devem estar preenchidas
            JOptionPane.showMessageDialog(null, "Todas as notas devem estar preenchidas");
        } else {
            
            // Calcula a média final
            double notaFinal = (Double.valueOf(txt_nota_orientador.getText()) + 
                    Double.valueOf(txt_nota_banca1.getText()) +
                    Double.valueOf(txt_nota_banca2.getText())) / 3;
            
            DecimalFormat df = new DecimalFormat("###.##");

            
            // inclui a nota final
            AlunoDAO dao = new AlunoDAO();
            
            dao.incluirNotaFinal(df.format(notaFinal), proposta.getPropostaAlunoMatricula());
            
            this.dispose();
            
        }
        
    }//GEN-LAST:event_btn_calcularActionPerformed

    /**
     * Método para garantir que não vá número no campo matrícula
     */
    public void ValidaNumero(JTextField txt) {
        Double valor;
        if (txt.getText().length() != 0) {
            try {
                valor = Double.parseDouble(txt.getText());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Campos só aceita números\nSe estiver utilizando vírgula (,) substitua por (.)", "Informação", JOptionPane.INFORMATION_MESSAGE);
                txt.grabFocus();
                txt_matricula.setText("");
            }
        }
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmIncluirNota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmIncluirNota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmIncluirNota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmIncluirNota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmIncluirNota().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_calcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_aluno;
    private javax.swing.JTextField txt_matricula;
    private javax.swing.JTextField txt_nota_banca1;
    private javax.swing.JTextField txt_nota_banca2;
    private javax.swing.JTextField txt_nota_orientador;
    private javax.swing.JTextField txt_tema;
    // End of variables declaration//GEN-END:variables
}

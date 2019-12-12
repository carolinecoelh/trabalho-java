/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lpii.view;

import br.com.lpii.dao.AlunoDAO;
import br.com.lpii.dao.PropostaDAO;
import br.com.lpii.model.Aluno;
import br.com.lpii.model.Professor;
import br.com.lpii.model.Proposta;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author
 */
public class FrmGerenciarPropostas extends javax.swing.JFrame {

    private Proposta proposta;
    private Professor professor;
    private Aluno aluno;

    public Proposta getPropostas() {
        return proposta;
    }

    public void setPropostas(Proposta propostas) {
        this.proposta = propostas;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    /**
     * Métodos para gerenciar botões
     */
    public void gerenciaBotoes(boolean aprovar, boolean rejeitar, boolean detalhes, boolean notas) {
        btn_aprovar.setEnabled(aprovar);
        btn_rejeitar.setEnabled(rejeitar);
        btn_detalhes.setEnabled(detalhes);
        btn_notas.setEnabled(notas);
    }

    /**
     * Creates new form FrmGerenciarPropostas
     */
    public FrmGerenciarPropostas() {
        initComponents();
        gerenciaBotoes(false, false, false, false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_aprovar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_propostas = new javax.swing.JTable();
        btn_rejeitar = new javax.swing.JButton();
        btn_detalhes = new javax.swing.JButton();
        btn_notas = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciar Propostas de TC");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 153, 51));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 153, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Gerenciar Propostas");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo-instituto.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 195, Short.MAX_VALUE)
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

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btn_aprovar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btn_aprovar.setForeground(new java.awt.Color(0, 102, 51));
        btn_aprovar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/accept.png"))); // NOI18N
        btn_aprovar.setText("Aprovar Proposta");
        btn_aprovar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aprovarActionPerformed(evt);
            }
        });

        tbl_propostas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matrícula", "Cód. do Tema", "Tema", "Status", "Nota Final"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_propostas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_propostasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_propostas);
        if (tbl_propostas.getColumnModel().getColumnCount() > 0) {
            tbl_propostas.getColumnModel().getColumn(0).setPreferredWidth(30);
            tbl_propostas.getColumnModel().getColumn(1).setPreferredWidth(30);
            tbl_propostas.getColumnModel().getColumn(2).setPreferredWidth(250);
            tbl_propostas.getColumnModel().getColumn(3).setPreferredWidth(30);
            tbl_propostas.getColumnModel().getColumn(4).setPreferredWidth(30);
        }

        btn_rejeitar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_rejeitar.setForeground(new java.awt.Color(0, 102, 51));
        btn_rejeitar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancel.png"))); // NOI18N
        btn_rejeitar.setText("Rejeitar Proposta");
        btn_rejeitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_rejeitarActionPerformed(evt);
            }
        });

        btn_detalhes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_detalhes.setForeground(new java.awt.Color(0, 102, 51));
        btn_detalhes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/zoom.png"))); // NOI18N
        btn_detalhes.setText("Ver Detalhes");
        btn_detalhes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_detalhesActionPerformed(evt);
            }
        });

        btn_notas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_notas.setForeground(new java.awt.Color(0, 102, 51));
        btn_notas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/application_form_edit.png"))); // NOI18N
        btn_notas.setText("Incluir Notas");
        btn_notas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_notasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_aprovar)
                .addGap(54, 54, 54)
                .addComponent(btn_rejeitar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btn_detalhes, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(btn_notas, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btn_detalhes, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_rejeitar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_aprovar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_notas, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn_aprovar, btn_detalhes, btn_rejeitar});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_aprovarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aprovarActionPerformed

        // Edita Proposta aprovando projeto para o aluno
        // Crio uma proposta e uma proposta dao
        PropostaDAO daoProp = new PropostaDAO();
        Proposta proposta = daoProp.getProposta(this.proposta.getPropostaId());
        if (proposta.getPropostaAlunoMatricula() != 0) {
            proposta.setPropostaStatus("Aprovado");
            // Crio uma proposta e uma proposta dao
            PropostaDAO daoPropAltera = new PropostaDAO();
            daoPropAltera.alterarProposta(proposta);
            FrmLoading loading = new FrmLoading();
            loading.setLabel("Carregando propostas...");
            loading.setVisible(true);

            Thread t = new Thread() {
                public void run() {
                    // Ao carregar, bloqueia os botões
                    gerenciaBotoes(false, false, false, false);

                    // Lista todoas as propostas do professor
                    toList();
                    loading.dispose();
                }

            };

            t.start();
        } else {
            JOptionPane.showMessageDialog(null, "Ainda não há alunos vinculados");
        }

    }//GEN-LAST:event_btn_aprovarActionPerformed

    private void btn_rejeitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_rejeitarActionPerformed
        // Edita Proposta aprovando projeto para o aluno
        // Crio uma proposta e uma proposta dao
        PropostaDAO daoProp = new PropostaDAO();
        Proposta proposta = daoProp.getProposta(this.proposta.getPropostaId());
        if (proposta.getPropostaStatus().equals("Aguardando aprovação")) {
            proposta.setPropostaStatus("Em aberto");
            PropostaDAO daoPro = new PropostaDAO();
            daoPro.alterarProposta(proposta);
        } else {
            JOptionPane.showMessageDialog(null, "Esta proposta não pode ser rejeitada");
        }

    }//GEN-LAST:event_btn_rejeitarActionPerformed

    private void btn_detalhesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_detalhesActionPerformed
        // Mostra a tela ver mensagens
        FrmVerDetalhesTema tela = new FrmVerDetalhesTema();
        tela.setProposta(proposta);
        tela.setVisible(true);
    }//GEN-LAST:event_btn_detalhesActionPerformed

    private void btn_notasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_notasActionPerformed
        // Abre tela para inclusão das notas
        FrmIncluirNota tela = new FrmIncluirNota();
        tela.setProposta(proposta);
        tela.setAluno(aluno);
        tela.setVisible(true);
    }//GEN-LAST:event_btn_notasActionPerformed

    private void tbl_propostasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_propostasMouseClicked
        // função disparada ao clicar em um item na tabela
        
        // Tela de carregamento...
        FrmLoading loading = new FrmLoading();
        loading.setLabel("Carregando proposta...");
        loading.setVisible(true);

        // Cria um thread
        Thread t = new Thread() {
            // Implementa método run()
            public void run() {
                // Pega o ID vindo da tabela
                int codTema = Integer.parseInt(tbl_propostas.getValueAt(tbl_propostas.getSelectedRow(), 1).toString());
                // Instancia uma classe PropostaDAO
                PropostaDAO daoP = new PropostaDAO();
                // Armazena no atributo proposta
                proposta = daoP.getProposta(codTema);
                // Pega dados do aluno relacionado caso exista vinculado
                if (proposta.getPropostaAlunoMatricula() != 0) {
                    // Cria um objeto alunoDAO
                    AlunoDAO daoAluno = new AlunoDAO();
                    // atribui valor ao atributo aluno
                    aluno = daoAluno.getAluno(proposta.getPropostaAlunoMatricula());
                    // Libera os botões
                    gerenciaBotoes(true, true, true, true);
                } else { // Verifica se o status está aprovado
                    // Libera os botões
                    gerenciaBotoes(true, true, true, false);
                }

                // Desativa botão de incluir a nota caso já exista
                try {
                    if (tbl_propostas.getValueAt(tbl_propostas.getSelectedRow(), 4) == "Não Calculada" && proposta.getPropostaAlunoMatricula() == 0) {
                        btn_notas.setEnabled(false);
                    }
                } catch (NullPointerException error) {
                    btn_notas.setEnabled(true);
                } catch (NumberFormatException error) {
                    btn_notas.setEnabled(true);
                }
                loading.dispose();
            }

        };

        t.start();


    }//GEN-LAST:event_tbl_propostasMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        FrmLoading loading = new FrmLoading();
        loading.setLabel("Carregando propostas...");
        loading.setVisible(true);

        Thread t = new Thread() {
            public void run() {
                // Ao carregar, bloqueia os botões
                gerenciaBotoes(false, false, false, false);

                // Lista todoas as propostas do professor
                toList();
                loading.dispose();
            }

        };

        t.start();
    }//GEN-LAST:event_formWindowOpened

    public void toList() {
        // Instancia objeto DAO
        PropostaDAO dao = new PropostaDAO();
        // Armazena em uma lista o retorno do método listarAlunos
        List<Proposta> lista = dao.listarMinhasPropostas(professor.getCodigo());
        // Cria o DefaultTableModel para armazenar os dados que serão exibidos na tabela
        DefaultTableModel dados = (DefaultTableModel) tbl_propostas.getModel();
        // limpa dados da tabela
        dados.setNumRows(0);
        // cada ocorrência em lista irá para um objeto professor
        for (Proposta p : lista) {
            // Objeto AlunoDAO
            AlunoDAO daoAluno = new AlunoDAO();
            // E agora será adicionado a lista na tabela. Linha a linha
            Aluno aluno = daoAluno.getAluno(p.getPropostaAlunoMatricula());
            dados.addRow(new Object[]{
                (p.getPropostaAlunoMatricula() == 0) ? "Nenhum aluno vinculado" : aluno.getNome(),
                p.getPropostaId(),
                p.getPropostaTitulo(),
                p.getPropostaStatus(),
                (p.getPropostaAlunoMatricula() == 0 || aluno.getNota().equals("0")) ? "Não Calculada" : aluno.getNota()
            });
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
            java.util.logging.Logger.getLogger(FrmGerenciarPropostas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmGerenciarPropostas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmGerenciarPropostas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmGerenciarPropostas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmGerenciarPropostas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aprovar;
    private javax.swing.JButton btn_detalhes;
    private javax.swing.JButton btn_notas;
    private javax.swing.JButton btn_rejeitar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tbl_propostas;
    // End of variables declaration//GEN-END:variables
}

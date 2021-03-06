package view.gui.alteracao;

import javax.persistence.EntityManager;
import javax.swing.JOptionPane;
import model.dao.TurmaDaoImpl;
import model.pojo.Turma;
import view.gui.MenuPrincipal;

public class AlteracaoTurma extends javax.swing.JFrame {

    private MenuPrincipal menuPrincipal;
    private EntityManager em;
    private TurmaDaoImpl daoTurma = TurmaDaoImpl.getInstancia();
    
    public AlteracaoTurma() {
        initComponents();
    }
    
    public AlteracaoTurma(MenuPrincipal menuPrincipal, EntityManager em){
        this();
        this.menuPrincipal = menuPrincipal;
        this.em = em;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        this.setTitle("Sistema Acadêmico");
        jPanel5 = new javax.swing.JPanel();
        labelDisciplina4 = new javax.swing.JLabel();
        fieldId = new javax.swing.JTextField();
        botaoAlterar = new javax.swing.JButton();
        botaoVoltar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        titulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaTurmas = new javax.swing.JTextArea();
        BotaoListar = new javax.swing.JButton();
        labelDisciplina5 = new javax.swing.JLabel();
        fieldAno = new javax.swing.JTextField();
        botaoAtualizar = new javax.swing.JButton();
        fieldPeriodo = new javax.swing.JTextField();
        labelDisciplina6 = new javax.swing.JLabel();
        fieldLocal = new javax.swing.JTextField();
        labelDisciplina7 = new javax.swing.JLabel();
        fieldHorario = new javax.swing.JTextField();
        labelDisciplina8 = new javax.swing.JLabel();
        fieldNVagas = new javax.swing.JTextField();
        labelDisciplina9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setMaximumSize(new java.awt.Dimension(800, 600));

        labelDisciplina4.setText("ID:");

        fieldId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldIdActionPerformed(evt);
            }
        });

        botaoAlterar.setText("Alterar");
        botaoAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAlterarActionPerformed(evt);
            }
        });

        botaoVoltar.setText("Voltar");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Alteração de Turmas");

        textAreaTurmas.setColumns(20);
        textAreaTurmas.setRows(5);
        jScrollPane1.setViewportView(textAreaTurmas);
        textAreaTurmas.setEditable(false);

        BotaoListar.setText("Listar");
        BotaoListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoListarActionPerformed(evt);
            }
        });

        labelDisciplina5.setText("Ano:");

        fieldAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldAnoActionPerformed(evt);
            }
        });

        botaoAtualizar.setText("Atualizar");
        botaoAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAtualizarActionPerformed(evt);
            }
        });

        fieldPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldPeriodoActionPerformed(evt);
            }
        });

        labelDisciplina6.setText("Período:");

        fieldLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldLocalActionPerformed(evt);
            }
        });

        labelDisciplina7.setText("Local:");

        fieldHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldHorarioActionPerformed(evt);
            }
        });

        labelDisciplina8.setText("Horário:");

        fieldNVagas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNVagasActionPerformed(evt);
            }
        });

        labelDisciplina9.setText("Número de Vagas:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(titulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botaoAtualizar))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelDisciplina5)
                            .addComponent(labelDisciplina6)
                            .addComponent(labelDisciplina7)
                            .addComponent(labelDisciplina8)
                            .addComponent(labelDisciplina9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(botaoAlterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoVoltar))
                            .addComponent(fieldAno, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldNVagas, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(labelDisciplina4)
                        .addGap(18, 18, 18)
                        .addComponent(BotaoListar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(fieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDisciplina4)
                    .addComponent(fieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoListar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                .addGap(13, 13, 13)
                .addComponent(botaoAtualizar)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDisciplina5)
                    .addComponent(fieldAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDisciplina6)
                    .addComponent(fieldPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDisciplina7)
                    .addComponent(fieldLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDisciplina8)
                    .addComponent(fieldHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDisciplina9)
                    .addComponent(fieldNVagas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoAlterar)
                    .addComponent(botaoVoltar))
                .addContainerGap())
        );

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fieldIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldIdActionPerformed

    private void botaoAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAlterarActionPerformed
        String id = fieldId.getText();
        if (!id.trim().isEmpty()){
            Turma turma = daoTurma.buscar(em, Integer.parseInt(id));
            if(turma != null){
                Integer ano = Integer.parseInt(fieldAno.getText());
                turma.setAno(ano);
                Integer periodo = Integer.parseInt(fieldPeriodo.getText());
                turma.setPeriodo(periodo);
                String local = fieldLocal.getText();
                turma.setLocal(local);
                String horario = fieldHorario.getText();
                turma.setHorario(horario);
                Integer nVagas = Integer.parseInt(fieldNVagas.getText());
                turma.setNumeroDeVagas(nVagas);
                daoTurma.alterar(em, turma);
                JOptionPane.showMessageDialog(this,"Alteração efetuada com sucesso.","Mensagem",JOptionPane.PLAIN_MESSAGE);
                fieldId.setText(null);
                fieldAno.setText(null);
                fieldPeriodo.setText(null);
                fieldLocal.setText(null);
                fieldHorario.setText(null);
                fieldNVagas.setText(null);
            }else
            JOptionPane.showMessageDialog(this,"Turma não cadastrado (ID inválido).","Erro",JOptionPane.ERROR_MESSAGE);
        }else
        JOptionPane.showMessageDialog(this,"O campo ID deve ser preenchido.","Erro",JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_botaoAlterarActionPerformed

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void BotaoListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoListarActionPerformed
        textAreaTurmas.setText(null);
        imprimir();
    }//GEN-LAST:event_BotaoListarActionPerformed

    private void fieldAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldAnoActionPerformed

    private void botaoAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAtualizarActionPerformed
        String id = fieldId.getText();
        if (!id.trim().isEmpty()){
            Turma turma = daoTurma.buscar(em, Integer.parseInt(id));
            if(turma != null){
                fieldAno.setText(turma.getAno().toString());
                fieldPeriodo.setText(turma.getPeriodo().toString());
                fieldLocal.setText(turma.getLocal());
                fieldHorario.setText(turma.getHorario());
                fieldNVagas.setText(turma.getNumeroDeVagas().toString());
            }else
            JOptionPane.showMessageDialog(this,"Turma não cadastrado (ID inválido).","Erro",JOptionPane.ERROR_MESSAGE);
        }else
        JOptionPane.showMessageDialog(this,"O campo ID deve ser preenchido.","Erro",JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_botaoAtualizarActionPerformed

    private void fieldPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldPeriodoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldPeriodoActionPerformed

    private void fieldLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldLocalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldLocalActionPerformed

    private void fieldHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldHorarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldHorarioActionPerformed

    private void fieldNVagasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNVagasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNVagasActionPerformed

    public void imprimir (){
        for(Turma turma: daoTurma.obterTodos(em))
            textAreaTurmas.append(turma.toString() + "\n");
    }

    private void formWindowClosed(java.awt.event.WindowEvent evt) {                                  
        menuPrincipal.setEnabled(true);
        menuPrincipal.toFront();
    }
    
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
            java.util.logging.Logger.getLogger(AlteracaoTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlteracaoTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlteracaoTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlteracaoTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlteracaoTurma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoListar;
    private javax.swing.JButton botaoAlterar;
    private javax.swing.JButton botaoAtualizar;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JTextField fieldAno;
    private javax.swing.JTextField fieldHorario;
    private javax.swing.JTextField fieldId;
    private javax.swing.JTextField fieldLocal;
    private javax.swing.JTextField fieldNVagas;
    private javax.swing.JTextField fieldPeriodo;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelDisciplina4;
    private javax.swing.JLabel labelDisciplina5;
    private javax.swing.JLabel labelDisciplina6;
    private javax.swing.JLabel labelDisciplina7;
    private javax.swing.JLabel labelDisciplina8;
    private javax.swing.JLabel labelDisciplina9;
    private javax.swing.JTextArea textAreaTurmas;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}

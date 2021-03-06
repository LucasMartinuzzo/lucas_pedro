package view.gui.consulta;

import javax.persistence.EntityManager;
import javax.swing.JOptionPane;
import model.dao.DisciplinaDaoImpl;
import model.pojo.Disciplina;
import model.pojo.Turma;
import view.gui.MenuPrincipal;

public class TurmasOferecidas extends javax.swing.JFrame {

    private MenuPrincipal menuPrincipal;
    private EntityManager em;
    private DisciplinaDaoImpl daoDisciplina = DisciplinaDaoImpl.getInstancia();
    
    public TurmasOferecidas() {
        initComponents();
    }

    public TurmasOferecidas(MenuPrincipal menuPrincipal, EntityManager em){
        this();
        this.menuPrincipal = menuPrincipal;
        this.em = em;
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        this.setTitle("Sistema Acadêmico");
        jPanel5 = new javax.swing.JPanel();
        labelDisciplina4 = new javax.swing.JLabel();
        fieldDisciplina = new javax.swing.JTextField();
        botaoVerificar = new javax.swing.JButton();
        botaoVoltar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        titulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaTurmas = new javax.swing.JTextArea();
        labelDisciplina5 = new javax.swing.JLabel();
        fieldTotal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setMaximumSize(new java.awt.Dimension(800, 600));

        labelDisciplina4.setText("Disciplina:");

        fieldDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldDisciplinaActionPerformed(evt);
            }
        });

        botaoVerificar.setText("Verificar");
        botaoVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVerificarActionPerformed(evt);
            }
        });

        botaoVoltar.setText("Voltar");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Turmas Oferecidas");

        textAreaTurmas.setColumns(20);
        textAreaTurmas.setRows(5);
        jScrollPane1.setViewportView(textAreaTurmas);
        textAreaTurmas.setEditable(false);

        labelDisciplina5.setText("Total:");

        fieldTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldTotalActionPerformed(evt);
            }
        });

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
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(labelDisciplina5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(botaoVerificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoVoltar))
                            .addComponent(fieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(labelDisciplina4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fieldDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDisciplina4)
                    .addComponent(fieldDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDisciplina5)
                    .addComponent(fieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoVerificar)
                    .addComponent(botaoVoltar)))
        );

        fieldTotal.setEditable(false);

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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fieldTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldTotalActionPerformed

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void botaoVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVerificarActionPerformed
        String nome = fieldDisciplina.getText();
        if (!nome.trim().isEmpty()){
            Disciplina disciplina = daoDisciplina.buscar(em, nome);
            if(disciplina != null){
                if (!disciplina.getTurma().isEmpty()){
                    textAreaTurmas.setText(null);
                    imprimir(disciplina);
                    fieldTotal.setText(null);
                    Integer total = disciplina.getTurma().size();
                    fieldTotal.setText(total.toString());
                }else{
                    textAreaTurmas.setText(null);
                    textAreaTurmas.append("Não há turmas dessa disciplina cadastradas.");
                    fieldTotal.setText("0");
                }
            }else
                JOptionPane.showMessageDialog(this,"Disciplina não cadastrada (nome inválido).","Erro",JOptionPane.ERROR_MESSAGE);
        }else
            JOptionPane.showMessageDialog(this,"O campo Disciplina deve ser preenchido.","Erro",JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_botaoVerificarActionPerformed

    private void fieldDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldDisciplinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldDisciplinaActionPerformed

    public void imprimir (Disciplina disciplina){
        for(Turma turma: disciplina.getTurma())
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
            java.util.logging.Logger.getLogger(TurmasOferecidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TurmasOferecidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TurmasOferecidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TurmasOferecidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TurmasOferecidas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoVerificar;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JTextField fieldDisciplina;
    private javax.swing.JTextField fieldTotal;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelDisciplina4;
    private javax.swing.JLabel labelDisciplina5;
    private javax.swing.JTextArea textAreaTurmas;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}

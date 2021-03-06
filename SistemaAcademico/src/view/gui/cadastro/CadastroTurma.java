package view.gui.cadastro;

import javax.persistence.EntityManager;
import javax.swing.JOptionPane;
import model.dao.DisciplinaDaoImpl;
import model.dao.ProfessorDaoImpl;
import model.dao.TurmaDaoImpl;
import model.pojo.Disciplina;
import model.pojo.Professor;
import model.pojo.Turma;
import view.gui.MenuPrincipal;

public class CadastroTurma extends javax.swing.JFrame {
    
    private MenuPrincipal menuPrincipal;
    private EntityManager em;
    private TurmaDaoImpl daoTurma = TurmaDaoImpl.getInstancia();
    private DisciplinaDaoImpl daoDisciplina = DisciplinaDaoImpl.getInstancia();
    private ProfessorDaoImpl daoProfessor = ProfessorDaoImpl.getInstancia();
    
    
    public CadastroTurma() {
        initComponents();
    }
    public CadastroTurma(MenuPrincipal menuPrincipal, EntityManager em){
        this();
        this.menuPrincipal = menuPrincipal;
        this.em = em;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        this.setTitle("Sistema Acadêmico");
        jPanel1 = new javax.swing.JPanel();
        labelDisciplina = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        fieldDisciplina = new javax.swing.JTextField();
        fieldProfessor = new javax.swing.JTextField();
        botaoCadastrar = new javax.swing.JButton();
        botaoVoltar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        titulo = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        fieldAno = new javax.swing.JTextField();
        fieldPeriodo = new javax.swing.JTextField();
        label4 = new javax.swing.JLabel();
        label5 = new javax.swing.JLabel();
        fieldLocal = new javax.swing.JTextField();
        label6 = new javax.swing.JLabel();
        fieldHorario = new javax.swing.JTextField();
        fieldNVagas = new javax.swing.JTextField();
        label7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setMaximumSize(new java.awt.Dimension(800, 600));

        labelDisciplina.setText("Disciplina:");

        label2.setText("Professor (CPF):");

        fieldProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldProfessorActionPerformed(evt);
            }
        });

        botaoCadastrar.setText("Cadastrar");
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });

        botaoVoltar.setText("Voltar");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Cadastro de Turma");

        label3.setText("Ano:");

        label4.setText("Período:");

        label5.setText("Local:");

        label6.setText("Horário:");

        label7.setText("Número de Vagas:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(titulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoCadastrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoVoltar)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label2)
                    .addComponent(labelDisciplina)
                    .addComponent(label3)
                    .addComponent(label4)
                    .addComponent(label5)
                    .addComponent(label6)
                    .addComponent(label7))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(fieldDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(fieldProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(fieldAno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldPeriodo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldLocal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldHorario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldNVagas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDisciplina)
                    .addComponent(fieldDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label2)
                    .addComponent(fieldProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label3)
                    .addComponent(fieldAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label4)
                    .addComponent(fieldPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label5)
                    .addComponent(fieldLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label6)
                    .addComponent(fieldHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label7)
                    .addComponent(fieldNVagas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCadastrar)
                    .addComponent(botaoVoltar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed
        String nomeDisciplina = fieldDisciplina.getText();
        if(!nomeDisciplina.trim().isEmpty()){
            Disciplina disciplina = daoDisciplina.buscar(em,nomeDisciplina);        
            if (disciplina != null){
                String cpfProfessor = fieldProfessor.getText();
                if(!cpfProfessor.trim().isEmpty()){
                    Professor professor = daoProfessor.buscar(em, cpfProfessor);
                    if (professor != null){
                        Integer ano = Integer.parseInt(fieldAno.getText());
                        Integer periodo = Integer.parseInt(fieldPeriodo.getText());
                        String local = fieldLocal.getText();
                        String horario = fieldHorario.getText();
                        Integer numeroDeVagas = Integer.parseInt(fieldNVagas.getText());
                        Turma turma = new Turma (ano, periodo, local, horario,numeroDeVagas, disciplina, professor);
                        disciplina.getTurma().add(turma);
                        daoTurma.salvar(em, turma);
                        daoDisciplina.alterar(em, disciplina);
                        JOptionPane.showMessageDialog(this,"Cadastro efetuado com sucesso.","Mensagem",JOptionPane.PLAIN_MESSAGE);
                        fieldDisciplina.setText(null);
                        fieldProfessor.setText(null);
                        fieldAno.setText(null);
                        fieldPeriodo.setText(null);
                        fieldLocal.setText(null);
                        fieldHorario.setText(null);
                        fieldNVagas.setText(null);
                    }else
                        JOptionPane.showMessageDialog(this,"Professor não cadastrado (CPF inválido).","Erro",JOptionPane.ERROR_MESSAGE);
                }else
                    JOptionPane.showMessageDialog(this,"O campo Professor (CPF) deve ser preenchido.","Erro",JOptionPane.ERROR_MESSAGE);
            }else
                JOptionPane.showMessageDialog(this,"Disciplina não cadastrada (nome inválido).","Erro",JOptionPane.ERROR_MESSAGE);
        }else
            JOptionPane.showMessageDialog(this,"O campo Disciplina deve ser preenchido.","Erro",JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_botaoCadastrarActionPerformed

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void fieldProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldProfessorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldProfessorActionPerformed

    
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
            java.util.logging.Logger.getLogger(CadastroTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroTurma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JTextField fieldAno;
    private javax.swing.JTextField fieldDisciplina;
    private javax.swing.JTextField fieldHorario;
    private javax.swing.JTextField fieldLocal;
    private javax.swing.JTextField fieldNVagas;
    private javax.swing.JTextField fieldPeriodo;
    private javax.swing.JTextField fieldProfessor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel label6;
    private javax.swing.JLabel label7;
    private javax.swing.JLabel labelDisciplina;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}

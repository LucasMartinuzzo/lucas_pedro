package view.gui.cadastro;

import javax.persistence.EntityManager;
import javax.swing.JOptionPane;
import model.dao.AlunoDaoImpl;
import model.dao.FaltaDaoImpl;
import model.dao.TurmaDaoImpl;
import model.pojo.Aluno;
import model.pojo.Falta;
import model.pojo.Turma;
import view.gui.MenuPrincipal;

public class CadastroFalta extends javax.swing.JFrame {
    
    private MenuPrincipal menuPrincipal;
    private EntityManager em;
    private FaltaDaoImpl daoFalta = FaltaDaoImpl.getInstancia();
    private TurmaDaoImpl daoTurma = TurmaDaoImpl.getInstancia();
    private AlunoDaoImpl daoAluno = AlunoDaoImpl.getInstancia();

    public CadastroFalta() {
        initComponents();
    }
    
    public CadastroFalta(MenuPrincipal menuPrincipal, EntityManager em){
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
        fieldTurma = new javax.swing.JTextField();
        fieldAluno = new javax.swing.JTextField();
        botaoCadastrar = new javax.swing.JButton();
        botaoVoltar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        titulo = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        fieldNFaltas = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaTurmas = new javax.swing.JTextArea();
        BotaoListar = new javax.swing.JButton();
        BotaoAtualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setMaximumSize(new java.awt.Dimension(800, 600));

        labelDisciplina.setText("Turma (ID):");

        label2.setText("Aluno:");

        fieldTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldTurmaActionPerformed(evt);
            }
        });

        fieldAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldAlunoActionPerformed(evt);
            }
        });
        fieldAluno.setEditable(false);

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
        titulo.setText("Cadastro de Faltas");

        label3.setText("Número de Faltas:");

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

        BotaoAtualizar.setText("Atualizar");
        BotaoAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(titulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botaoCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoVoltar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(labelDisciplina)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                                        .addComponent(BotaoListar))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(label3)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(label2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(BotaoAtualizar)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(fieldTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(fieldAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(fieldNFaltas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDisciplina)
                    .addComponent(fieldTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoListar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label2)
                    .addComponent(fieldAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoAtualizar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label3)
                    .addComponent(fieldNFaltas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fieldAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldAlunoActionPerformed

    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed
        String verificarId = fieldTurma.getText();
        if(!verificarId.trim().isEmpty()){
            Integer id = Integer.parseInt(verificarId);
            Turma turma = daoTurma.buscar(em, id);
            if (turma != null){
                Boolean aux = false;
                Boolean aux2 = false;
                if(!turma.getAluno().isEmpty()){
                    for (Aluno aluno: turma.getAluno()) {
                        aux = false;
                        for (Falta faltaConsultada: aluno.getFalta()){
                            if (faltaConsultada.getTurma().equals(turma)){
                                aux = true;
                                break;
                            }
                        }
                        if (aux == true)
                            continue;
                        else{
                            if(aux2 == true){
                                fieldAluno.setText(aluno.getNome());
                                break;
                            }
                            Integer nfaltas = Integer.parseInt(fieldNFaltas.getText());
                            Falta falta = new Falta (nfaltas, turma);
                            aluno.getFalta().add(falta);
                            daoFalta.salvar(em, falta);
                            daoAluno.alterar(em,aluno);
                            JOptionPane.showMessageDialog(this,"Cadastro efetuado com sucesso.","Mensagem",JOptionPane.PLAIN_MESSAGE);
                            aux2 = true;
                            fieldNFaltas.setText(null);
                        }
                    }
                    if(aux == true){
                        JOptionPane.showMessageDialog(this,"O cadastro de faltas dessa turma foi concluído.","Alerta",JOptionPane.WARNING_MESSAGE);
                        fieldAluno.setText(null);
                    }
                }else
                    JOptionPane.showMessageDialog(this,"Não há alunos cadastrados nessa turma.","Erro",JOptionPane.ERROR_MESSAGE);
            }else
                JOptionPane.showMessageDialog(this,"Turma não cadastrada (ID inválido).","Erro",JOptionPane.ERROR_MESSAGE);
        }else
            JOptionPane.showMessageDialog(this,"O campo Turma (ID) deve ser preenchido.","Erro",JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_botaoCadastrarActionPerformed

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void fieldTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldTurmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldTurmaActionPerformed

    private void BotaoListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoListarActionPerformed
        textAreaTurmas.setText(null);
        imprimir();
    }//GEN-LAST:event_BotaoListarActionPerformed

    private void BotaoAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAtualizarActionPerformed
        String verificarId = fieldTurma.getText();
        if(!verificarId.trim().isEmpty()){
            Integer id = Integer.parseInt(verificarId);
            Turma turma = daoTurma.buscar(em, id);
            if (turma != null){
                Boolean aux = false;
                if(!turma.getAluno().isEmpty()){
                    for (Aluno aluno: turma.getAluno()) {
                        aux = false;
                        for (Falta faltaConsultada: aluno.getFalta()){
                            if (faltaConsultada.getTurma().equals(turma)){
                                aux = true;
                                break;
                            }
                        }
                        if (aux == true)
                            continue;
                        else{
                            fieldAluno.setText(aluno.getNome());
                            fieldNFaltas.setText(null);
                            break;
                        }
                    }
                    if(aux == true){
                        JOptionPane.showMessageDialog(this,"O cadastro de faltas dessa turma foi concluído.","Alerta",JOptionPane.WARNING_MESSAGE);
                        fieldAluno.setText(null);
                        fieldNFaltas.setText(null);
                    }
                }else
                    JOptionPane.showMessageDialog(this,"Não há alunos cadastrados nessa turma.","Erro",JOptionPane.ERROR_MESSAGE);
            }else
                JOptionPane.showMessageDialog(this,"Turma não cadastrada (ID inválido).","Erro",JOptionPane.ERROR_MESSAGE);
        }
        else
            JOptionPane.showMessageDialog(this,"O campo Turma (ID) deve ser preenchido.","Erro",JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_BotaoAtualizarActionPerformed
    
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
            java.util.logging.Logger.getLogger(CadastroFalta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroFalta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroFalta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroFalta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroFalta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoAtualizar;
    private javax.swing.JButton BotaoListar;
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JTextField fieldAluno;
    private javax.swing.JTextField fieldNFaltas;
    private javax.swing.JTextField fieldTurma;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel labelDisciplina;
    private javax.swing.JTextArea textAreaTurmas;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}

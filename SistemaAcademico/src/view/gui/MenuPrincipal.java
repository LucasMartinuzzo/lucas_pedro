package view.gui;

import view.gui.cadastro.CadastroAluno;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.swing.JOptionPane;
import model.dao.AlunoDaoImpl;
import model.dao.AtividadeDaoImpl;
import model.dao.DisciplinaDaoImpl;
import model.dao.FaltaDaoImpl;
import model.dao.NotaDaoImpl;
import model.dao.ProfessorDaoImpl;
import model.dao.TurmaDaoImpl;
import view.gui.alteracao.AlteracaoAluno;
import view.gui.alteracao.AlteracaoAtividade;
import view.gui.alteracao.AlteracaoDisciplina;
import view.gui.alteracao.AlteracaoFalta;
import view.gui.alteracao.AlteracaoNota;
import view.gui.alteracao.AlteracaoProfessor;
import view.gui.alteracao.AlteracaoTurma;
import view.gui.alteracao.AtribuicaoProfessorDisciplina;
import view.gui.alteracao.MatriculaAluno;
import view.gui.cadastro.CadastroAtividade;
import view.gui.cadastro.CadastroDisciplina;
import view.gui.cadastro.CadastroFalta;
import view.gui.cadastro.CadastroNota;
import view.gui.cadastro.CadastroProfessor;
import view.gui.cadastro.CadastroTurma;
import view.gui.consulta.ConsultaTurma;
import view.gui.consulta.DisciplinasLecionadas;
import view.gui.consulta.SituacaoAluno;
import view.gui.consulta.TurmasOferecidas;
import view.gui.listagem.ListagemAluno;
import view.gui.listagem.ListagemAtividade;
import view.gui.listagem.ListagemDisciplina;
import view.gui.listagem.ListagemFalta;
import view.gui.listagem.ListagemNota;
import view.gui.listagem.ListagemProfessor;
import view.gui.listagem.ListagemTurma;

public class MenuPrincipal extends javax.swing.JFrame {
    private static final EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("SistemaAcademicoPU");
    private static final EntityManager em = emf.createEntityManager();
    private DisciplinaDaoImpl daoDisciplina = DisciplinaDaoImpl.getInstancia();
    private ProfessorDaoImpl daoProfessor = ProfessorDaoImpl.getInstancia();
    private AtividadeDaoImpl daoAtividade = AtividadeDaoImpl.getInstancia();
    private TurmaDaoImpl daoTurma = TurmaDaoImpl.getInstancia();
    private AlunoDaoImpl daoAluno = AlunoDaoImpl.getInstancia();
    private FaltaDaoImpl daoFalta = FaltaDaoImpl.getInstancia();
    private NotaDaoImpl daoNota = NotaDaoImpl.getInstancia();
    
    public static EntityManager getEM (){
        return MenuPrincipal.em;
    }

    public MenuPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JSeparator();
        botaoSair = new javax.swing.JButton();
        this.setTitle("Sistema Acadêmico");
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCadastrar = new javax.swing.JMenu();
        menuCadastrarAluno = new javax.swing.JMenuItem();
        menuCadastrarAtividade = new javax.swing.JMenuItem();
        menuCadastrarDisciplina = new javax.swing.JMenuItem();
        menuCadastrarFalta = new javax.swing.JMenuItem();
        menuCadastrarNota = new javax.swing.JMenuItem();
        menuCadastrarProfessor = new javax.swing.JMenuItem();
        menuCadastrarTurma = new javax.swing.JMenuItem();
        menuAlterar = new javax.swing.JMenu();
        menuAtribuir = new javax.swing.JMenuItem();
        menuMatricularAluno = new javax.swing.JMenuItem();
        menuAlterarAluno = new javax.swing.JMenuItem();
        menuAlterarAtividade = new javax.swing.JMenuItem();
        menuAlterarDisciplina = new javax.swing.JMenuItem();
        menuAlterarFalta = new javax.swing.JMenuItem();
        menuAlterarNota = new javax.swing.JMenuItem();
        menuAlterarProfessor = new javax.swing.JMenuItem();
        menuAlterarTurma = new javax.swing.JMenuItem();
        menuListar = new javax.swing.JMenu();
        menuListarAluno = new javax.swing.JMenuItem();
        menuListarAtividade = new javax.swing.JMenuItem();
        menuListarDisciplina = new javax.swing.JMenuItem();
        menuListarFalta = new javax.swing.JMenuItem();
        menuListarNota = new javax.swing.JMenuItem();
        menuListarProfessor = new javax.swing.JMenuItem();
        menuListarTurma = new javax.swing.JMenuItem();
        menuConsultar = new javax.swing.JMenu();
        menuConsultarTurma = new javax.swing.JMenuItem();
        menuConsultarSituacaoAluno = new javax.swing.JMenuItem();
        menuConsultarQuantidadeTurmas = new javax.swing.JMenuItem();
        menuConsultarDisciplinasLecionadas = new javax.swing.JMenuItem();

        jButton1.setText("jButton1");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botaoSair.setText("Sair");
        botaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairActionPerformed(evt);
            }
        });

        menuCadastrar.setText("Cadastrar");

        menuCadastrarAluno.setText("Aluno");
        menuCadastrarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarAlunoActionPerformed(evt);
            }
        });
        menuCadastrar.add(menuCadastrarAluno);

        menuCadastrarAtividade.setText("Atividade");
        menuCadastrarAtividade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarAtividadeActionPerformed(evt);
            }
        });
        menuCadastrar.add(menuCadastrarAtividade);

        menuCadastrarDisciplina.setText("Disciplina");
        menuCadastrarDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarDisciplinaActionPerformed(evt);
            }
        });
        menuCadastrar.add(menuCadastrarDisciplina);

        menuCadastrarFalta.setText("Falta");
        menuCadastrarFalta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarFaltaActionPerformed(evt);
            }
        });
        menuCadastrar.add(menuCadastrarFalta);

        menuCadastrarNota.setText("Nota");
        menuCadastrarNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarNotaActionPerformed(evt);
            }
        });
        menuCadastrar.add(menuCadastrarNota);

        menuCadastrarProfessor.setText("Professor");
        menuCadastrarProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarProfessorActionPerformed(evt);
            }
        });
        menuCadastrar.add(menuCadastrarProfessor);

        menuCadastrarTurma.setText("Turma");
        menuCadastrarTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarTurmaActionPerformed(evt);
            }
        });
        menuCadastrar.add(menuCadastrarTurma);

        jMenuBar1.add(menuCadastrar);

        menuAlterar.setText("Alterar / Gerenciar");
        menuAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAlterarActionPerformed(evt);
            }
        });

        menuAtribuir.setText("Atribuir Professor à Disciplina");
        menuAtribuir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAtribuirActionPerformed(evt);
            }
        });
        menuAlterar.add(menuAtribuir);

        menuMatricularAluno.setText("Matricular Aluno");
        menuMatricularAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMatricularAlunoActionPerformed(evt);
            }
        });
        menuAlterar.add(menuMatricularAluno);

        menuAlterarAluno.setText("Aluno");
        menuAlterarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAlterarAlunoActionPerformed(evt);
            }
        });
        menuAlterar.add(menuAlterarAluno);

        menuAlterarAtividade.setText("Atividade");
        menuAlterarAtividade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAlterarAtividadeActionPerformed(evt);
            }
        });
        menuAlterar.add(menuAlterarAtividade);

        menuAlterarDisciplina.setText("Disciplina");
        menuAlterarDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAlterarDisciplinaActionPerformed(evt);
            }
        });
        menuAlterar.add(menuAlterarDisciplina);

        menuAlterarFalta.setText("Falta");
        menuAlterarFalta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAlterarFaltaActionPerformed(evt);
            }
        });
        menuAlterar.add(menuAlterarFalta);

        menuAlterarNota.setText("Nota");
        menuAlterarNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAlterarNotaActionPerformed(evt);
            }
        });
        menuAlterar.add(menuAlterarNota);

        menuAlterarProfessor.setText("Professor");
        menuAlterarProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAlterarProfessorActionPerformed(evt);
            }
        });
        menuAlterar.add(menuAlterarProfessor);

        menuAlterarTurma.setText("Turma");
        menuAlterarTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAlterarTurmaActionPerformed(evt);
            }
        });
        menuAlterar.add(menuAlterarTurma);

        jMenuBar1.add(menuAlterar);

        menuListar.setText("Listar");

        menuListarAluno.setText("Aluno");
        menuListarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuListarAlunoActionPerformed(evt);
            }
        });
        menuListar.add(menuListarAluno);

        menuListarAtividade.setText("Atividade");
        menuListarAtividade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuListarAtividadeActionPerformed(evt);
            }
        });
        menuListar.add(menuListarAtividade);

        menuListarDisciplina.setText("Disciplina");
        menuListarDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuListarDisciplinaActionPerformed(evt);
            }
        });
        menuListar.add(menuListarDisciplina);

        menuListarFalta.setText("Falta");
        menuListarFalta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuListarFaltaActionPerformed(evt);
            }
        });
        menuListar.add(menuListarFalta);

        menuListarNota.setText("Nota");
        menuListarNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuListarNotaActionPerformed(evt);
            }
        });
        menuListar.add(menuListarNota);

        menuListarProfessor.setText("Professor");
        menuListarProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuListarProfessorActionPerformed(evt);
            }
        });
        menuListar.add(menuListarProfessor);

        menuListarTurma.setText("Turma");
        menuListarTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuListarTurmaActionPerformed(evt);
            }
        });
        menuListar.add(menuListarTurma);

        jMenuBar1.add(menuListar);

        menuConsultar.setText("Consultar");

        menuConsultarTurma.setText("Turmas");
        menuConsultarTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultarTurmaActionPerformed(evt);
            }
        });
        menuConsultar.add(menuConsultarTurma);

        menuConsultarSituacaoAluno.setText("Situação Aluno");
        menuConsultarSituacaoAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultarSituacaoAlunoActionPerformed(evt);
            }
        });
        menuConsultar.add(menuConsultarSituacaoAluno);

        menuConsultarQuantidadeTurmas.setText("Turmas Oferecidas");
        menuConsultarQuantidadeTurmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultarQuantidadeTurmasActionPerformed(evt);
            }
        });
        menuConsultar.add(menuConsultarQuantidadeTurmas);

        menuConsultarDisciplinasLecionadas.setText("Disciplinas Lecionadas");
        menuConsultarDisciplinasLecionadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultarDisciplinasLecionadasActionPerformed(evt);
            }
        });
        menuConsultar.add(menuConsultarDisciplinasLecionadas);

        jMenuBar1.add(menuConsultar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(331, Short.MAX_VALUE)
                .addComponent(botaoSair)
                .addContainerGap())
            .addComponent(jSeparator1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(147, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoSair)
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuCadastrarDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarDisciplinaActionPerformed
        this.setEnabled(false);
        new CadastroDisciplina(this, em).setVisible(true);
    }//GEN-LAST:event_menuCadastrarDisciplinaActionPerformed

    private void menuCadastrarFaltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarFaltaActionPerformed
        if (daoTurma.obterTodos(em).isEmpty())
            JOptionPane.showMessageDialog(this,"Não existem turmas cadastradas.","Alerta",JOptionPane.WARNING_MESSAGE);
        else{
            this.setEnabled(false);
            new CadastroFalta(this, em).setVisible(true);
        }
    }//GEN-LAST:event_menuCadastrarFaltaActionPerformed

    private void menuAlterarDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAlterarDisciplinaActionPerformed
        if (daoDisciplina.obterTodos(em).isEmpty())
            JOptionPane.showMessageDialog(this,"Não existem disciplinas cadastrados.","Alerta",JOptionPane.WARNING_MESSAGE);
        else{
            this.setEnabled(false);
            new AlteracaoDisciplina(this, em).setVisible(true);
        }
    }//GEN-LAST:event_menuAlterarDisciplinaActionPerformed

    private void menuAlterarFaltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAlterarFaltaActionPerformed
        if (daoFalta.obterTodos(em).isEmpty())
            JOptionPane.showMessageDialog(this,"Não existem faltas cadastrados.","Alerta",JOptionPane.WARNING_MESSAGE);
        else{
            this.setEnabled(false);
            new AlteracaoFalta(this, em).setVisible(true);
        }
    }//GEN-LAST:event_menuAlterarFaltaActionPerformed

    private void menuListarDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuListarDisciplinaActionPerformed
        if (daoDisciplina.obterTodos(em).isEmpty())
            JOptionPane.showMessageDialog(this,"Não existem disciplinas cadastradas.","Alerta",JOptionPane.WARNING_MESSAGE);
        else{
            this.setEnabled(false);
            new ListagemDisciplina(this, em).setVisible(true);
        }
    }//GEN-LAST:event_menuListarDisciplinaActionPerformed

    private void menuListarFaltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuListarFaltaActionPerformed
        if (daoFalta.obterTodos(em).isEmpty())
            JOptionPane.showMessageDialog(this,"Não existem faltas cadastradas.","Alerta",JOptionPane.WARNING_MESSAGE);
        else{
            this.setEnabled(false);
            new ListagemFalta(this, em).setVisible(true);
        }
    }//GEN-LAST:event_menuListarFaltaActionPerformed

    private void menuConsultarDisciplinasLecionadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultarDisciplinasLecionadasActionPerformed
        if (daoProfessor.obterTodos(em).isEmpty())
            JOptionPane.showMessageDialog(this,"Não existem professores cadastrados.","Alerta",JOptionPane.WARNING_MESSAGE);
        else{
            this.setEnabled(false);
            new DisciplinasLecionadas(this, em).setVisible(true);
        }
    }//GEN-LAST:event_menuConsultarDisciplinasLecionadasActionPerformed

    private void botaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botaoSairActionPerformed

    private void menuCadastrarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarAlunoActionPerformed
        this.setEnabled(false);
        new CadastroAluno(this, em).setVisible(true);
    }//GEN-LAST:event_menuCadastrarAlunoActionPerformed

    private void menuCadastrarAtividadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarAtividadeActionPerformed
        if (daoTurma.obterTodos(em).isEmpty())
            JOptionPane.showMessageDialog(this,"Não existem turmas cadastradas.","Alerta",JOptionPane.WARNING_MESSAGE);
        else{
            this.setEnabled(false);
            new CadastroAtividade(this, em).setVisible(true);
        }
    }//GEN-LAST:event_menuCadastrarAtividadeActionPerformed

    private void menuCadastrarProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarProfessorActionPerformed
        this.setEnabled(false);
        new CadastroProfessor(this, em).setVisible(true);
    }//GEN-LAST:event_menuCadastrarProfessorActionPerformed

    private void menuCadastrarTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarTurmaActionPerformed
        if (daoDisciplina.obterTodos(em).isEmpty())
            JOptionPane.showMessageDialog(this,"Não existem disciplinas cadastradas.","Alerta",JOptionPane.WARNING_MESSAGE);
        else if(daoProfessor.obterTodos(em).isEmpty())
                JOptionPane.showMessageDialog(this,"Não existem professores cadastrados.","Alerta",JOptionPane.WARNING_MESSAGE);
        else {
            this.setEnabled(false);
            new CadastroTurma(this, em).setVisible(true);
        }
    }//GEN-LAST:event_menuCadastrarTurmaActionPerformed

    private void menuCadastrarNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarNotaActionPerformed
        if (daoAtividade.obterTodos(em).isEmpty())
            JOptionPane.showMessageDialog(this,"Não existem atividades cadastradas.","Alerta",JOptionPane.WARNING_MESSAGE);
        else{
            this.setEnabled(false);
            new CadastroNota(this, em).setVisible(true);
        }
    }//GEN-LAST:event_menuCadastrarNotaActionPerformed

    private void menuListarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuListarAlunoActionPerformed
        if (daoAluno.obterTodos(em).isEmpty())
            JOptionPane.showMessageDialog(this,"Não existem alunos cadastrados.","Alerta",JOptionPane.WARNING_MESSAGE);
        else{
            this.setEnabled(false);
            new ListagemAluno(this, em).setVisible(true);
        }
    }//GEN-LAST:event_menuListarAlunoActionPerformed

    private void menuListarProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuListarProfessorActionPerformed
        if (daoProfessor.obterTodos(em).isEmpty())
            JOptionPane.showMessageDialog(this,"Não existem professores cadastrados.","Alerta",JOptionPane.WARNING_MESSAGE);
        else{
            this.setEnabled(false);
            new ListagemProfessor(this, em).setVisible(true);
        }
    }//GEN-LAST:event_menuListarProfessorActionPerformed

    private void menuListarTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuListarTurmaActionPerformed
        if (daoTurma.obterTodos(em).isEmpty())
            JOptionPane.showMessageDialog(this,"Não existem turmas cadastradas.","Alerta",JOptionPane.WARNING_MESSAGE);
        else{
            this.setEnabled(false);
            new ListagemTurma(this, em).setVisible(true);
        }
    }//GEN-LAST:event_menuListarTurmaActionPerformed

    private void menuListarAtividadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuListarAtividadeActionPerformed
        if (daoAtividade.obterTodos(em).isEmpty())
            JOptionPane.showMessageDialog(this,"Não existem atividades cadastradas.","Alerta",JOptionPane.WARNING_MESSAGE);
        else{
            this.setEnabled(false);
            new ListagemAtividade(this, em).setVisible(true);
        }
    }//GEN-LAST:event_menuListarAtividadeActionPerformed

    private void menuListarNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuListarNotaActionPerformed
        if (daoNota.obterTodos(em).isEmpty())
            JOptionPane.showMessageDialog(this,"Não existem notas cadastradas.","Alerta",JOptionPane.WARNING_MESSAGE);
        else{
            this.setEnabled(false);
            new ListagemNota(this, em).setVisible(true);
        }
    }//GEN-LAST:event_menuListarNotaActionPerformed

    private void menuMatricularAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMatricularAlunoActionPerformed
        if (daoAluno.obterTodos(em).isEmpty())
            JOptionPane.showMessageDialog(this,"Não existem alunos cadastrados.","Alerta",JOptionPane.WARNING_MESSAGE);
        else if(daoTurma.obterTodos(em).isEmpty())
                JOptionPane.showMessageDialog(this,"Não existem turmas cadastradas.","Alerta",JOptionPane.WARNING_MESSAGE);
        else {
            this.setEnabled(false);
            new MatriculaAluno(this, em).setVisible(true);
        }
    }//GEN-LAST:event_menuMatricularAlunoActionPerformed

    private void menuAtribuirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAtribuirActionPerformed
        if (daoProfessor.obterTodos(em).isEmpty())
            JOptionPane.showMessageDialog(this,"Não existem professores cadastrados.","Alerta",JOptionPane.WARNING_MESSAGE);
        else if(daoDisciplina.obterTodos(em).isEmpty())
                JOptionPane.showMessageDialog(this,"Não existem disciplinas cadastradas.","Alerta",JOptionPane.WARNING_MESSAGE);
        else {
            this.setEnabled(false);
            new AtribuicaoProfessorDisciplina(this, em).setVisible(true);
        }
    }//GEN-LAST:event_menuAtribuirActionPerformed

    private void menuAlterarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAlterarAlunoActionPerformed
        if (daoAluno.obterTodos(em).isEmpty())
            JOptionPane.showMessageDialog(this,"Não existem alunos cadastrados.","Alerta",JOptionPane.WARNING_MESSAGE);
        else{
            this.setEnabled(false);
            new AlteracaoAluno(this, em).setVisible(true);
        }
    }//GEN-LAST:event_menuAlterarAlunoActionPerformed

    private void menuAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAlterarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuAlterarActionPerformed

    private void menuAlterarNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAlterarNotaActionPerformed
        if (daoNota.obterTodos(em).isEmpty())
            JOptionPane.showMessageDialog(this,"Não existem notas cadastradas.","Alerta",JOptionPane.WARNING_MESSAGE);
        else{
            this.setEnabled(false);
            new AlteracaoNota(this, em).setVisible(true);
        }
    }//GEN-LAST:event_menuAlterarNotaActionPerformed

    private void menuAlterarProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAlterarProfessorActionPerformed
        if (daoProfessor.obterTodos(em).isEmpty())
            JOptionPane.showMessageDialog(this,"Não existem professores cadastrados.","Alerta",JOptionPane.WARNING_MESSAGE);
        else{
            this.setEnabled(false);
            new AlteracaoProfessor(this, em).setVisible(true);
        }
    }//GEN-LAST:event_menuAlterarProfessorActionPerformed

    private void menuAlterarTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAlterarTurmaActionPerformed
        if (daoTurma.obterTodos(em).isEmpty())
            JOptionPane.showMessageDialog(this,"Não existem turmas cadastrados.","Alerta",JOptionPane.WARNING_MESSAGE);
        else{
            this.setEnabled(false);
            new AlteracaoTurma(this, em).setVisible(true);
        }
    }//GEN-LAST:event_menuAlterarTurmaActionPerformed

    private void menuAlterarAtividadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAlterarAtividadeActionPerformed
        if (daoAtividade.obterTodos(em).isEmpty())
            JOptionPane.showMessageDialog(this,"Não existem atividades cadastrados.","Alerta",JOptionPane.WARNING_MESSAGE);
        else{
            this.setEnabled(false);
            new AlteracaoAtividade(this, em).setVisible(true);
        }
    }//GEN-LAST:event_menuAlterarAtividadeActionPerformed

    private void menuConsultarQuantidadeTurmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultarQuantidadeTurmasActionPerformed
        if (daoDisciplina.obterTodos(em).isEmpty())
            JOptionPane.showMessageDialog(this,"Não existem disciplinas cadastradas.","Alerta",JOptionPane.WARNING_MESSAGE);
        else{
            this.setEnabled(false);
            new TurmasOferecidas(this, em).setVisible(true);
        }
    }//GEN-LAST:event_menuConsultarQuantidadeTurmasActionPerformed

    private void menuConsultarSituacaoAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultarSituacaoAlunoActionPerformed
        if (daoAluno.obterTodos(em).isEmpty())
            JOptionPane.showMessageDialog(this,"Não existem alunos cadastrados.","Alerta",JOptionPane.WARNING_MESSAGE);
        else if(daoDisciplina.obterTodos(em).isEmpty())
                JOptionPane.showMessageDialog(this,"Não existem disciplinas cadastradas.","Alerta",JOptionPane.WARNING_MESSAGE);
        else {
            this.setEnabled(false);
            new SituacaoAluno(this, em).setVisible(true);
        }
    }//GEN-LAST:event_menuConsultarSituacaoAlunoActionPerformed

    private void menuConsultarTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultarTurmaActionPerformed
        if (daoTurma.obterTodos(em).isEmpty())
            JOptionPane.showMessageDialog(this,"Não existem turmas cadastradas.","Alerta",JOptionPane.WARNING_MESSAGE);
        else{
            this.setEnabled(false);
            new ConsultaTurma(this, em).setVisible(true);
        }
    }//GEN-LAST:event_menuConsultarTurmaActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoSair;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JMenu menuAlterar;
    private javax.swing.JMenuItem menuAlterarAluno;
    private javax.swing.JMenuItem menuAlterarAtividade;
    private javax.swing.JMenuItem menuAlterarDisciplina;
    private javax.swing.JMenuItem menuAlterarFalta;
    private javax.swing.JMenuItem menuAlterarNota;
    private javax.swing.JMenuItem menuAlterarProfessor;
    private javax.swing.JMenuItem menuAlterarTurma;
    private javax.swing.JMenuItem menuAtribuir;
    private javax.swing.JMenu menuCadastrar;
    private javax.swing.JMenuItem menuCadastrarAluno;
    private javax.swing.JMenuItem menuCadastrarAtividade;
    private javax.swing.JMenuItem menuCadastrarDisciplina;
    private javax.swing.JMenuItem menuCadastrarFalta;
    private javax.swing.JMenuItem menuCadastrarNota;
    private javax.swing.JMenuItem menuCadastrarProfessor;
    private javax.swing.JMenuItem menuCadastrarTurma;
    private javax.swing.JMenu menuConsultar;
    private javax.swing.JMenuItem menuConsultarDisciplinasLecionadas;
    private javax.swing.JMenuItem menuConsultarQuantidadeTurmas;
    private javax.swing.JMenuItem menuConsultarSituacaoAluno;
    private javax.swing.JMenuItem menuConsultarTurma;
    private javax.swing.JMenu menuListar;
    private javax.swing.JMenuItem menuListarAluno;
    private javax.swing.JMenuItem menuListarAtividade;
    private javax.swing.JMenuItem menuListarDisciplina;
    private javax.swing.JMenuItem menuListarFalta;
    private javax.swing.JMenuItem menuListarNota;
    private javax.swing.JMenuItem menuListarProfessor;
    private javax.swing.JMenuItem menuListarTurma;
    private javax.swing.JMenuItem menuMatricularAluno;
    // End of variables declaration//GEN-END:variables
}

package bpd.controle_almoxerifado.cadastro;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import bpd.ultilitarios.ConectaBanco;
import bpd.ultilitarios.InOut;
import bpd.ultilitarios.LookAndFeel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author marcos.junior
 */
public class CadastroFornecedor extends javax.swing.JDialog {
    ConectaBanco con = new ConectaBanco();
    ResultSet rs;
    String NomeBanco="bpd_estoque";
    /**
     * Creates new form CadastroFornecedor
     */
    public CadastroFornecedor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPesquisa = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtpesquisa = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtID = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtInsEstadual = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNomeFantasia = new javax.swing.JTextField();
        txtRazaoSocial = new javax.swing.JTextField();
        txtCNPJ = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Fornecedor");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisa de Fornecedor"));

        tbPesquisa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID ", "NOME FORNECEDOR"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbPesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPesquisaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbPesquisa);
        tbPesquisa.getColumnModel().getColumn(0).setResizable(false);
        tbPesquisa.getColumnModel().getColumn(0).setPreferredWidth(5);
        tbPesquisa.getColumnModel().getColumn(1).setResizable(false);
        tbPesquisa.getColumnModel().getColumn(1).setPreferredWidth(300);

        jLabel7.setText("NOME:");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bpd/imagens/find24.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtpesquisa)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton3)
                    .addComponent(txtpesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Fornecedor"));

        txtID.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel2.setText("RAZÃO SOCIAL :");

        jLabel1.setText("NOME FANTASIA:");

        jLabel6.setText("INS. ESTADUAL:");

        jLabel3.setText("CNPJ :");

        jLabel5.setText("TELEFONE :");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bpd/imagens/addfile24.png"))); // NOI18N
        jButton1.setText("Novo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bpd/imagens/accept24.png"))); // NOI18N
        jButton2.setText("Salvar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bpd/imagens/delete24.png"))); // NOI18N
        jButton4.setText("Deletar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRazaoSocial)
                            .addComponent(txtNomeFantasia)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTelefone)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtInsEstadual))
                    .addComponent(jSeparator1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtInsEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1)
                    .addComponent(jButton4)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(!"".equals(txtpesquisa.getText().trim())){
            try {
                Pesquisar();
            } catch (SQLException ex) {
                Logger.getLogger(CadastroFornecedor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tbPesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPesquisaMouseClicked
        try {
            PopularPesquisa();
        } catch (SQLException ex) {
            Logger.getLogger(CadastroFornecedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tbPesquisaMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        LimparDados();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if("".equals(txtID.getText().trim())){
            try {
                SalvarDados();
                InOut.MsgDeInformacao(null, "Dados Salvos com Sucesso!");
            } catch (SQLException ex) {
                InOut.MsgDeErro(NomeBanco, ex.getMessage());
            }
        }
        else{
            try {
                AtualizarDados();
                InOut.MsgDeInformacao(null, "Dados Atualizados com Sucesso!");
            } catch (SQLException ex) {
                InOut.MsgDeErro(NomeBanco, ex.getMessage());
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int verificar = InOut.MsgDeSimNao("Deletar Fornecedor", "Deseja realmente apagar fornecedor?");
        if(verificar==0){
            try {
                DeletarDados();
                InOut.MsgDeInformacao(null, "Dados Deletados com Sucesso!");
                LimparDados();
            } catch (SQLException ex) {
                InOut.MsgDeErro(NomeBanco, ex.getMessage());
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        LookAndFeel.Sistema();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CadastroFornecedor dialog = new CadastroFornecedor(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tbPesquisa;
    private javax.swing.JFormattedTextField txtCNPJ;
    private javax.swing.JLabel txtID;
    private javax.swing.JTextField txtInsEstadual;
    private javax.swing.JTextField txtNomeFantasia;
    private javax.swing.JTextField txtRazaoSocial;
    private javax.swing.JFormattedTextField txtTelefone;
    private javax.swing.JTextField txtpesquisa;
    // End of variables declaration//GEN-END:variables

    private void Pesquisar() throws SQLException {
        String sql = "select idfornecedor,nome_fantasia from fornecedor where nome_fantasia like '%"+txtpesquisa.getText().trim()+"%' order by nome_fantasia;";
        DefaultTableModel modelo1 = (DefaultTableModel) tbPesquisa.getModel();
        con.conecta(NomeBanco);
        con.executaSelect(sql);
        rs = con.resultset;
        modelo1.setRowCount(0);
        while(rs.next()){
            
            modelo1.addRow(new Object[]{
                          rs.getString("idfornecedor"),
                          rs.getString("nome_fantasia")
            });
        }
        con.desconecta();
    }

    private void PopularPesquisa() throws SQLException {
        int linha;
        linha=tbPesquisa.getSelectedRow();
        String pesquisa = tbPesquisa.getValueAt(linha, 0).toString();
        String sql="select * from fornecedor where idfornecedor='"+pesquisa+"';";
        con.conecta(NomeBanco);
        con.executaSelect(sql);
        rs = con.resultset;
        while(rs.next()){
            txtID.setText(rs.getString("idfornecedor"));
            txtNomeFantasia.setText(rs.getString("nome_fantasia"));
            txtRazaoSocial.setText(rs.getString("razao_social"));
            txtCNPJ.setText(rs.getString("cnpj"));
            txtInsEstadual.setText(rs.getString("ins_estadual"));
            txtTelefone.setText(rs.getString("telefone"));
        }
        con.desconecta();
               
    }

    private void LimparDados() {
        txtID.setText("");
        txtNomeFantasia.setText("");
        txtRazaoSocial.setText("");
        txtCNPJ.setText("");
        txtInsEstadual.setText("");
        txtTelefone.setText("");
    }

    private void AtualizarDados() throws SQLException {
        String sql = "update fornecedor set "
                + "razao_social='"+txtRazaoSocial.getText().trim()+"' ,"
                + "nome_fantasia='"+txtNomeFantasia.getText().trim()+"' ,"
                + "cnpj='"+txtCNPJ.getText().trim()+"' ,"
                + "ins_estadual='"+txtInsEstadual.getText().trim()+"' ,"
                + "telefone='"+txtTelefone.getText().trim()+"' "
                + "where idfornecedor="+txtID.getText().trim()+";";
        con.conecta(NomeBanco);
        con.executa(sql);
        con.desconecta();
    }

    private void SalvarDados() throws SQLException {
       String sql = "insert into fornecedor(razao_social,nome_fantasia,cnpj,ins_estadual,telefone) values ('"
               + ""+txtRazaoSocial.getText()+"','"
               + ""+txtNomeFantasia.getText()+"','"
               + ""+txtCNPJ.getText()+"','"
               + ""+txtInsEstadual.getText()+"','"
               + ""+txtTelefone.getText()+"');";
        con.conecta(NomeBanco);
        con.executa(sql);
        con.desconecta(); 
    }

    private void DeletarDados() throws SQLException {
        String sql = "delete from fornecedor where idfornecedor="+txtID.getText()+";";
        con.conecta(NomeBanco);
        con.executa(sql);
        con.desconecta(); 
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bpd.controle_almoxerifado.producao;

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
public class CadastroCartao extends javax.swing.JDialog {
    ConectaBanco con = new ConectaBanco();
    ResultSet rs;
    String NomeBanco="bpd_estoque";
    /**
     * Creates new form CadastroCartao
     */
    public CadastroCartao(java.awt.Frame parent, boolean modal) {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNomeEmpresa = new javax.swing.JTextField();
        txtNomeLojista = new javax.swing.JTextField();
        txtQuantidade = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPesquisa = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtPesquisa = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        txtID = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Cartões");

        jLabel1.setText("Nome do Lojista:");

        jLabel2.setText("Nome Empresa:");

        jLabel3.setText("Quantidade :");

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

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisa de Cadastro de Cartões"));

        tbPesquisa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Empresa", "Lojista"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
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
        tbPesquisa.getColumnModel().getColumn(1).setPreferredWidth(150);
        tbPesquisa.getColumnModel().getColumn(2).setResizable(false);
        tbPesquisa.getColumnModel().getColumn(2).setPreferredWidth(150);

        jLabel4.setText("Nome Empresa:");

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
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesquisa))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        txtID.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomeEmpresa))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomeLojista))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNomeEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNomeLojista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int verifica = InOut.MsgDeSimNao(null, "Deseja Salvar?");
        if(verifica==0){
            if("".equals(txtID.getText().trim())){
                try {
                    SalvarDados();
                    InOut.MsgDeInformacao(null, "Dados Salvos com Sucesso!");
                } catch (SQLException ex) {
                    InOut.MsgDeErro(NomeBanco, ex.getMessage());
                }
            }else{
                try {
                    AtualizarDados();
                    InOut.MsgDeInformacao(null, "Dados Atualizados com Sucesso!");
                } catch (SQLException ex) {
                    InOut.MsgDeErro(NomeBanco, ex.getMessage());
                }
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(!"".equals(txtPesquisa.getText().trim())){
            try {
                PesquisarDados();
            } catch (SQLException ex) {
                InOut.MsgDeErro(NomeBanco, ex.getMessage());
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tbPesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPesquisaMouseClicked
        try {
            PopularPesquisa();
        } catch (SQLException ex) {
            InOut.MsgDeErro(NomeBanco, ex.getMessage());
        }
    }//GEN-LAST:event_tbPesquisaMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        LimparDados();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        LookAndFeel.McWin();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CadastroCartao dialog = new CadastroCartao(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbPesquisa;
    private javax.swing.JLabel txtID;
    private javax.swing.JTextField txtNomeEmpresa;
    private javax.swing.JTextField txtNomeLojista;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JFormattedTextField txtQuantidade;
    // End of variables declaration//GEN-END:variables

    private void SalvarDados() throws SQLException {
        String sql="Insert into estoque_cartao (empresa,lojista,quantidade) values ('"
                + ""+txtNomeEmpresa.getText().trim()+"','"
                + ""+txtNomeLojista.getText().trim()+"','"
                + ""+txtQuantidade.getText().trim()+"');";
        con.conecta(NomeBanco);
        con.executa(sql);
        con.desconecta();
    }

    private void AtualizarDados() throws SQLException {
        String sql="Update estoque_cartao set "
                + "empresa='"+txtNomeEmpresa.getText().trim()+"', "
                + "lojista='"+txtNomeLojista.getText().trim()+"', "
                + "quantidade='"+txtQuantidade.getText().trim()+"' "
                + "where idestoque_cartao='"+txtID.getText()+"';";
        con.conecta(NomeBanco);
        con.executa(sql);
        con.desconecta();
    }

    private void PesquisarDados() throws SQLException {
        String sql = "select idestoque_cartao,empresa,lojista from estoque_cartao where empresa like '"+txtPesquisa.getText().trim()+"%' order by lojista;";
        DefaultTableModel modelo1 = (DefaultTableModel) tbPesquisa.getModel();
        con.conecta(NomeBanco);
        con.executaSelect(sql);
        rs = con.resultset;
        modelo1.setRowCount(0);
        while(rs.next()){
            
            modelo1.addRow(new Object[]{
                          rs.getString("idestoque_cartao"),
                          rs.getString("empresa"),
                          rs.getString("lojista")
            });
        }
        con.desconecta();
    }

    private void PopularPesquisa() throws SQLException {
        int linha;
        linha=tbPesquisa.getSelectedRow();
        String pesquisa = tbPesquisa.getValueAt(linha, 0).toString();
        String sql="select * from estoque_cartao where idestoque_cartao='"+pesquisa+"';";
        con.conecta(NomeBanco);
        con.executaSelect(sql);
        rs = con.resultset;
        while(rs.next()){
            txtID.setText(rs.getString("idestoque_cartao"));
            txtNomeEmpresa.setText(rs.getString("empresa"));
            txtNomeLojista.setText(rs.getString("lojista"));
            txtQuantidade.setText(rs.getString("quantidade"));
            
        }
        con.desconecta();
    }

    private void LimparDados() {
        txtID.setText(null);
        txtNomeEmpresa.setText(null);
        txtNomeLojista.setText(null);
        txtQuantidade.setText(null);
    }
}

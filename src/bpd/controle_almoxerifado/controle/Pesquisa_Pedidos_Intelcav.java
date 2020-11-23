/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bpd.controle_almoxerifado.controle;

import bpd.ultilitarios.ConectaBanco;
import bpd.ultilitarios.InOut;
import java.awt.FileDialog;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author marcos.junior
 */
public class Pesquisa_Pedidos_Intelcav extends javax.swing.JFrame {
    FileDialog fdSelecionarArte,fdSelecionarAP,fdExportarCSV;
    ConectaBanco con = new ConectaBanco();
    ResultSet rs;
    /**
     * Creates new form Pesquisa_Pedidos_Intelcav
     */
    public Pesquisa_Pedidos_Intelcav() {
       
        initComponents();
        fdExportarCSV = new FileDialog(this,"Exportar Arquivo", FileDialog.SAVE);
        CarregarClientes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        rbData = new javax.swing.JRadioButton();
        rbAP = new javax.swing.JRadioButton();
        rbCodigo = new javax.swing.JRadioButton();
        rbPedido = new javax.swing.JRadioButton();
        label9 = new java.awt.Label();
        cbCliente = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPesquisaCartao = new javax.swing.JTable();
        jToolBar1 = new javax.swing.JToolBar();
        btnPesquisar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtPesquisa = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtCaminhoArte = new javax.swing.JTextField();
        txtCaminhoAP = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        cbClienteCadastro = new javax.swing.JComboBox();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        buttonGroup1.add(rbData);
        rbData.setText("Data do Pedido");

        buttonGroup1.add(rbAP);
        rbAP.setText("Nº AP");

        buttonGroup1.add(rbCodigo);
        rbCodigo.setText("Codigo");

        buttonGroup1.add(rbPedido);
        rbPedido.setText("Nº Pedido");

        label9.setText("Cliente");

        tbPesquisaCartao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID Pedido", "Nº AP", "Cliente", "Codigo", "Nº Pedido", "Data Pedido"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbPesquisaCartao.getTableHeader().setReorderingAllowed(false);
        tbPesquisaCartao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPesquisaCartaoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbPesquisaCartao);
        tbPesquisaCartao.getColumnModel().getColumn(0).setResizable(false);
        tbPesquisaCartao.getColumnModel().getColumn(0).setPreferredWidth(15);

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bpd/imagens/find24.png"))); // NOI18N
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnPesquisar);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bpd/imagens/printer24.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton4);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bpd/imagens/foldermove24.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton3);

        txtPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbAP)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(rbPedido)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbData)
                                    .addComponent(rbCodigo)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(cbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbPedido)
                    .addComponent(rbCodigo))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbAP))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbData)))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalhamento"));

        jLabel1.setText("ID Pedido :");

        jLabel2.setText("Número da AP :");

        jLabel3.setText("Número do Pedido :");

        jLabel4.setText("Cliente :");

        jLabel5.setText("Código do Pedido :");

        jLabel6.setText("Data do Pedido :");

        jLabel7.setText("Data de Entrega :");

        jLabel8.setText("Valor do Pedido :");

        jLabel9.setText("Quantidade :");

        jLabel10.setText("Caminho da Arte :");

        jLabel11.setText("Caminho da AP :");

        jButton1.setText("Deletar");

        jButton2.setText("Limpar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCaminhoArte))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(12, 12, 12)
                        .addComponent(txtCaminhoAP))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbClienteCadastro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 119, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTextField2, jTextField3});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(cbClienteCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7))
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtCaminhoArte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtCaminhoAP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        Pesquisar();
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        fdExportarCSV.setVisible(true);
        if(fdExportarCSV.getFile()!=null){
            ExportarCSV();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tbPesquisaCartaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPesquisaCartaoMouseClicked
        CarregarPesquisaSeleta();
    }//GEN-LAST:event_tbPesquisaCartaoMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
            String sql;
            if(rbCodigo.isSelected()){
               sql = "select * from pedidos where cliente='"+cbCliente.getSelectedItem()+"' and codigo like '"+txtPesquisa.getText()+"%'"; 
            }else if (rbAP.isSelected()){
               sql = "select * from pedidos where cliente='"+cbCliente.getSelectedItem()+"' and num_ap like '"+txtPesquisa.getText()+"%'"; 
            }else if (rbData.isSelected()){
               sql = "select * from pedidos where cliente='"+cbCliente.getSelectedItem()+"' and data_pedido like '"+txtPesquisa.getText()+"%'";  
            }else if (rbPedido.isSelected()){
               sql = "select * from pedidos where cliente='"+cbCliente.getSelectedItem()+"' and num_pedido like '"+txtPesquisa.getText()+"%'"; 
            }else{
                InOut.MsgDeAviso(null,"SELECIONE A OPÇÃO DE PESQUISA" );
                return;
            }
            
        try {
          //  relatorios.Gerar("Relatorio_pedidos", sql, "bpd_teste_pedidos");
            GerarRelatorio("Relatorio_pedidos",sql,"bpd_testes_pedidos");
        } catch (JRException ex) {
            Logger.getLogger(Pesquisa_Pedidos_Intelcav.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisaActionPerformed

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
            java.util.logging.Logger.getLogger(Pesquisa_Pedidos_Intelcav.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pesquisa_Pedidos_Intelcav.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pesquisa_Pedidos_Intelcav.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pesquisa_Pedidos_Intelcav.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pesquisa_Pedidos_Intelcav().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cbCliente;
    private javax.swing.JComboBox cbClienteCadastro;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JToolBar jToolBar1;
    private java.awt.Label label9;
    private javax.swing.JRadioButton rbAP;
    private javax.swing.JRadioButton rbCodigo;
    private javax.swing.JRadioButton rbData;
    private javax.swing.JRadioButton rbPedido;
    private javax.swing.JTable tbPesquisaCartao;
    private javax.swing.JTextField txtCaminhoAP;
    private javax.swing.JTextField txtCaminhoArte;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables
private void Pesquisar() {
        String sSql = new String();
        DefaultTableModel modelo1 = (DefaultTableModel) tbPesquisaCartao.getModel();
        
        if(rbCodigo.isSelected()){
           sSql = "select * from pedidos where cliente='"+cbCliente.getSelectedItem()+"' and codigo like '"+txtPesquisa.getText()+"%'"; 
        }else if (rbAP.isSelected()){
           sSql = "select * from pedidos where cliente='"+cbCliente.getSelectedItem()+"' and num_ap like '"+txtPesquisa.getText()+"%'"; 
        }else if (rbData.isSelected()){
           sSql = "select * from pedidos where cliente='"+cbCliente.getSelectedItem()+"' and data_pedido like '"+txtPesquisa.getText()+"%'";  
        }else if (rbPedido.isSelected()){
           sSql = "select * from pedidos where cliente='"+cbCliente.getSelectedItem()+"' and num_pedido like '"+txtPesquisa.getText()+"%'"; 
        }else{
            InOut.MsgDeAviso(null,"SELECIONE A OPÇÃO DE PESQUISA" );
            return;
        }
        
        con.conecta("bpd_teste_pedidos");
        con.executaSelect(sSql);
        rs=con.resultset;
        try {
            modelo1.setRowCount(0);
            while (rs.next()) {
                    modelo1.addRow(new Object[]{
                                rs.getString("id_pedido"),
                                rs.getString("num_ap"),
                                rs.getString("cliente"),
                                rs.getString("codigo"),
                                rs.getString("num_pedido"),
                                rs.getString("data_pedido")
                               });
                }
            tbPesquisaCartao.setModel(modelo1);
        } catch (SQLException ex) {
            InOut.MsgDeErro(null, ex.getMessage());
        }
    con.desconecta();   
    }

    private void ExportarCSV() {
        String sSql = new String();
        StringBuilder imprimir = new StringBuilder();
        
        con = new ConectaBanco();
        if(rbCodigo.isSelected()){
           sSql = "select * from pedidos_intelcav where cliente='"+cbCliente.getSelectedItem()+"' and codigo like '"+txtPesquisa.getText()+"%'"; 
        }else if (rbAP.isSelected()){
           sSql = "select * from pedidos_intelcav where cliente='"+cbCliente.getSelectedItem()+"' and num_ap like '"+txtPesquisa.getText()+"%'"; 
        }else if (rbData.isSelected()){
           sSql = "select * from pedidos_intelcav where cliente='"+cbCliente.getSelectedItem()+"' and data_pedido like '"+txtPesquisa.getText()+"%'";  
        }else if (rbPedido.isSelected()){
           sSql = "select * from pedidos_intelcav where cliente='"+cbCliente.getSelectedItem()+"' and num_pedido like '"+txtPesquisa.getText()+"%'"; 
        }else{
            InOut.MsgDeAviso(null,"SELECIONE A OPÇÃO DE PESQUISA" );
            return;
        }
        System.out.println(sSql);
        PrintWriter out;
        try {
            out = new PrintWriter(fdExportarCSV.getDirectory()+fdExportarCSV.getFile()+".csv");
        
        con.conecta("bpd_pedidos_intelcav");
        con.executaSelect(sSql);
        rs=con.resultset;
        out.println("Cliente;Codigo;Numero AP;Numero Pedido;Data Pedido;Data Entrega;Quantidade;Valor;Arquivo;");
            while (rs.next()) {
                        imprimir = new StringBuilder();
                
                        imprimir.append(rs.getString("cliente")).append(";");
                        imprimir.append(rs.getString("codigo")).append(";");
                        imprimir.append(rs.getString("num_ap")).append(";");
                        imprimir.append(rs.getString("num_pedido")).append(";");
                        imprimir.append(rs.getString("data_pedido")).append(";");
                        imprimir.append(rs.getString("data_entrega")).append(";");
                        imprimir.append(rs.getString("quantidade")).append(";");
                        imprimir.append(rs.getString("valor")).append(";");
                        imprimir.append(rs.getString("arquivo")).append(";");
                        
                        out.println(imprimir.toString());
                }
            InOut.MsgDeInformacao(null, "ARQUIVO SALVO COM SUCESSO!");
        } catch (SQLException ex) {
            InOut.MsgDeErro(null, ex.getMessage());
        } catch (FileNotFoundException ex) {
           InOut.MsgDeErro(null, ex.getMessage());
        }

    }
    private void CarregarClientes() {
        
        cbCliente.removeAllItems();
        cbClienteCadastro.removeAllItems();
        
        String sql ="select * from clientes_intelcav order by clientes";
        
        con.conecta("bpd_pedidos_intelcav");
        con.executaSelect(sql);
        rs=con.resultset;
        try {
            while(rs.next()){
                  cbCliente.addItem(rs.getString("clientes")); 
                  cbClienteCadastro.addItem(rs.getString("clientes")); 
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void CarregarPesquisaSeleta() {
        int Linha;
        Linha=tbPesquisaCartao.getSelectedRow();
        String ID = tbPesquisaCartao.getValueAt(Linha, 0).toString();
        
        String sql="select * from pedidos where id_pedido="+ID+";";
        con.conecta("bpd_teste_pedidos");
        con.executaSelect(sql);
        rs=con.resultset;
        try {
            while(rs.next()){
                txtCaminhoAP.setText(rs.getString("arquivo_ap"));
                txtCaminhoArte.setText(rs.getString("arte"));
                
            }
        } catch (SQLException ex) {
            InOut.MsgDeErro(null, ex.getMessage());
        }
    }

    private void GerarRelatorio(String layout, String sql, String BancoDados) throws JRException {
        
        JasperDesign desenho = JRXmlLoader.load("Relatorios\\"+layout+".jrxml");
        JasperReport relatorio = JasperCompileManager.compileReport(desenho);
        
        con.conecta(BancoDados);
        con.executaSelect(sql);
        rs=con.resultset;
       
        JRResultSetDataSource jrRS = new JRResultSetDataSource(rs);
        
        JasperPrint impressao = JasperFillManager.fillReport(relatorio, null, jrRS);
        
        //JasperViewer viewer = new JasperViewer(impressao, false);
        JasperViewer viewer = new JasperViewer(impressao, false, Locale.ENGLISH);
        viewer.show();
        con.desconecta();
    }
}
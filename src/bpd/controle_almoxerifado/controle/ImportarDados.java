/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bpd.controle_almoxerifado.controle;

import bpd.ultilitarios.ConectaBanco;
import bpd.ultilitarios.InOut;
import java.awt.FileDialog;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.UnsupportedEncodingException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.SwingWorker;

/**
 *
 * @author marcos.junior
 */
public class ImportarDados extends javax.swing.JDialog {
     FileDialog abrir ;
     ConectaBanco con = new ConectaBanco();
     ResultSet rs;
     String NomeBanco ="bpd_estoque";
    /**
     * Creates new form ImportarDados
     */
    public ImportarDados(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        abrir = new FileDialog(this,"Carregar Arquivo", FileDialog.LOAD);
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

        jButton1 = new javax.swing.JButton();
        txtArquivo = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        pgImportar = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        cbCliente = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bpd/imagens/folder24.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bpd/imagens/down24.png"))); // NOI18N
        jButton2.setText("Carregar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        pgImportar.setStringPainted(true);

        jLabel1.setText("Cliente:");

        cbCliente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtArquivo))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pgImportar, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(pgImportar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         try {
             CarregarArquivo();
         } catch (SQLException ex) {
             Logger.getLogger(ImportarDados.class.getName()).log(Level.SEVERE, null, ex);
         } catch (FileNotFoundException ex) {
             Logger.getLogger(ImportarDados.class.getName()).log(Level.SEVERE, null, ex);
         } catch (UnsupportedEncodingException ex) {
             Logger.getLogger(ImportarDados.class.getName()).log(Level.SEVERE, null, ex);
         } catch (IOException ex) {
             Logger.getLogger(ImportarDados.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        abrir.setVisible(true);
        if(abrir.getFile()==null){
            //txtArquivo.setText("");
        }else{
            txtArquivo.setText(abrir.getDirectory()+abrir.getFile());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ImportarDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ImportarDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ImportarDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ImportarDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ImportarDados dialog = new ImportarDados(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox cbCliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JProgressBar pgImportar;
    private javax.swing.JTextField txtArquivo;
    // End of variables declaration//GEN-END:variables

    private void CarregarArquivo() throws SQLException, FileNotFoundException, UnsupportedEncodingException, IOException {
        SwingWorker work = new SwingWorker() {

            @Override
            protected Object doInBackground() throws Exception {
                 con.conecta(NomeBanco);
                 int progresso=0;
                 pgImportar.setMinimum(0);
                 pgImportar.setMaximum(TamanhoArquivo());
                 BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(txtArquivo.getText().trim()), "ISO-8859-1"));
                 String linha;
                 while( (linha = in.readLine()) != null ){
                     String sql=new String();
                     if(!"".equals(linha.trim())){
                      String[] dados = linha.split(Pattern.quote("\t"));
                      System.out.println(dados[0]);
                      System.out.println(dados[1]);
                      sql="insert into pedidos_intelcav(cliente,num_ap,codigo) values('"
                              + ""+cbCliente.getSelectedItem().toString()+"','"
                              + ""+dados[0]+"','"
                              + ""+dados[1].replace("'", "")+"');";
                      con.executa(sql);
                     }
                     pgImportar.setValue(progresso++);
                 }

                con.desconecta();
                InOut.MsgDeInformacao(null, "Dados Importados com Sucesso!");
                pgImportar.setValue(0);
                return null;
            }

        };
        work.execute();
    }

    private int TamanhoArquivo() throws FileNotFoundException, IOException {
        File arquivoLeitura = new File(txtArquivo.getText().trim());  
        LineNumberReader linhaLeitura = new LineNumberReader(new FileReader(arquivoLeitura));  
        linhaLeitura.skip(arquivoLeitura.length());  
        int qtdLinha = linhaLeitura.getLineNumber();
        return qtdLinha;
    }

    private void CarregarClientes() {
        cbCliente.removeAllItems();
        String sql ="select * from clientes_intelcav order by clientes";   
        con.conecta(NomeBanco);
        con.executaSelect(sql);
        rs=con.resultset;
        try {
            while(rs.next()){
                  cbCliente.addItem(rs.getString("clientes"));                  
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        con.desconecta();
    }
}

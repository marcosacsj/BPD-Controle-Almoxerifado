/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bpd.ultilitarios;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class relatorios {
    public static void Gerar(String layout, String sql, String BancoDados) throws JRException{
        ConectaBanco con = new ConectaBanco();
        ResultSet rs;
        JasperDesign desenho = JRXmlLoader.load("Relatorios\\"+layout+".jrxml");
       
        JasperReport relatorio = JasperCompileManager.compileReport(desenho);
        
        con.conecta(BancoDados);
        con.executaSelect(sql);
        rs=con.resultset;
       
        JRResultSetDataSource jrRS = new JRResultSetDataSource(rs);
        
        JasperPrint impressao = JasperFillManager.fillReport(relatorio, null, jrRS);
  
        //JasperViewer viewer = new JasperViewer(impressao, false);
        JasperViewer viewer = new JasperViewer(impressao, false);
        
        viewer.show();
        con.desconecta();
    }
}

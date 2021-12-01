package projeto.a3;

import java.sql.*;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class RequisitosDao {
    public void inserir(Requisitos requi) {
        ConnectionFactory factory = new ConnectionFactory();
        Connection c = factory.getConnection();
        PreparedStatement stmt = null;
        try{
            stmt = c.prepareStatement("INSERT INTO requisitos(Projeto, Nome, Módulo, Funções, DatadeCriação, Autor, Autordaúltimaalteração, Datadaultimaalteração, Versão, Prioridade, Complexidade, Esforçoemhoras, Estado, Fase, Descrição) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            stmt.setString(1, requi.getProjeto());
            stmt.setString(2, requi.getNome());
            stmt.setString(3, requi.getModulo());
            stmt.setString(4, requi.getFuncoes());
            stmt.setString(5, requi.getDataCriacao());
            stmt.setString(6, requi.getAutor());
            stmt.setString(7, requi.getAutorUltAlt());
            stmt.setString(8, requi.getDataUltMod());
            stmt.setString(9, requi.getVersao());
            stmt.setString(10, requi.getPrior());
            stmt.setString(11, requi.getComplex());
            stmt.setString(12, requi.getEsfHoras());
            stmt.setString(13, requi.getEstado());
            stmt.setString(14, requi.getFase());
            stmt.setString(15, requi.getDescricao());
            JOptionPane.showMessageDialog(null, "Requisito cadastrado com sucesso!");
            stmt.executeUpdate();
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void atualizar(Requisitos requi){
        ConnectionFactory factory = new ConnectionFactory();
        Connection con = factory.getConnection();
        PreparedStatement stmt = null;
        try{
            stmt = con.prepareStatement("UPDATE requisitos SET Projeto = ?, Nome = ?, Módulo = ?, Funções = ?, DatadeCriação = ?, Autor = ?, Autordaúltimaalteração = ?, Datadaultimaalteração = ?, Versão = ?, Prioridade = ?, Complexidade = ?, Esforçoemhoras = ?, Estado = ?, Fase = ?, Descrição = ? WHERE id = ?");
            
            stmt.setString(1, requi.getProjeto());
            stmt.setString(2, requi.getNome());
            stmt.setString(3, requi.getModulo());
            stmt.setString(4, requi.getFuncoes());
            stmt.setString(5, requi.getDataCriacao());
            stmt.setString(6, requi.getAutor());
            stmt.setString(7, requi.getAutorUltAlt());
            stmt.setString(8, requi.getDataUltMod());
            stmt.setString(9, requi.getVersao());
            stmt.setString(10, requi.getPrior());
            stmt.setString(11, requi.getComplex());
            stmt.setString(12, requi.getEsfHoras());
            stmt.setString(13, requi.getEstado());
            stmt.setString(14, requi.getFase());
            stmt.setString(15, requi.getDescricao());
            stmt.setInt(16, requi.getId());
            
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Alteração efetudada!");
       
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + e);
        } finally {
            factory.closeConnection(con, stmt);
        }
    }
    
    public List<Requisitos> read(){
        ConnectionFactory cf = new ConnectionFactory();
        Connection con = cf.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Requisitos> requisitosList = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM requisitos");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Requisitos requi = new Requisitos();
                requi.setId(rs.getInt("id"));
                requi.setProjeto(rs.getString("Projeto"));
                requi.setNome(rs.getString("Nome"));
                requi.setModulo(rs.getString("Módulo"));
                requi.setFuncoes(rs.getString("Funções"));
                requi.setDataCriacao(rs.getString("Datadecriação"));
                requi.setAutor(rs.getString("Autor"));
                requi.setAutorUltAlt(rs.getString("Autordaúltimaalteração"));
                requi.setDataUltMod(rs.getString("Datadaultimaalteração"));
                requi.setVersao(rs.getString("Versão"));
                requi.setPrior(rs.getString("Prioridade"));
                requi.setComplex(rs.getString("Complexidade"));
                requi.setEsfHoras(rs.getString("Esforçoemhoras"));
                requi.setEstado(rs.getString("Estado"));
                requi.setFase(rs.getString("Fase"));
                requi.setDescricao(rs.getString("Descrição"));
                      
                requisitosList.add(requi);
            }
        } catch (Exception e){
        }finally{
            cf.closeConnection(con, stmt);
        }
        return requisitosList;
    }
    
    public void deletar(Requisitos requi){
        ConnectionFactory factory = new ConnectionFactory();
        Connection con = factory.getConnection();
        PreparedStatement stmt = null;
        try{
            stmt = con.prepareStatement("DELETE FROM requisitos WHERE Id = ?");
            stmt.setInt(1, requi.getId());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Requisito excluido com sucesso!");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + e);
        } finally{
            factory.closeConnection(con, stmt);
        }
    }
    
}

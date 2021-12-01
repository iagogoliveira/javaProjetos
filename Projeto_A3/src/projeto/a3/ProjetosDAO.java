package projeto.a3;

import java.sql.*;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ProjetosDAO {

    public void inserir(Projetos projs) {
        ConnectionFactory factory = new ConnectionFactory();
        Connection c = factory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = c.prepareStatement("INSERT INTO projetos(Nome, Descricao, Proprietario) VALUES (?,?,?)");
            stmt.setString(1, projs.getNome());
            stmt.setString(2, projs.getDescricao());
            stmt.setString(3, projs.getUserProp());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Projeto cadastrado com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void atualizar(Projetos projs) {
        ConnectionFactory factory = new ConnectionFactory();
        Connection con = factory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("UPDATE projetos SET Nome = ?, Descricao = ?, Proprietario = ? WHERE id = ?");
            stmt.setString(1, projs.getNome());
            stmt.setString(2, projs.getDescricao());
            stmt.setString(3, projs.getUserProp());
            stmt.setInt(4, projs.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Alteração efetudada!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + e);
        } finally {
            factory.closeConnection(con, stmt);
        }
    }

    public List<Projetos> read() {
        ConnectionFactory cf = new ConnectionFactory();
        Connection con = cf.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Projetos> projetos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM projetos");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Projetos projs = new Projetos();
                projs.setId(rs.getInt("Id"));
                projs.setNome(rs.getString("Nome"));
                projs.setDescricao(rs.getString("Descricao"));
                projs.setUserProp(rs.getString("Proprietario"));
                projetos.add(projs);
            }
        } catch (Exception e) {
        } finally {
            cf.closeConnection(con, stmt);
        }
        return projetos;
    }

    public void deletar(Projetos projs) {
        ConnectionFactory factory = new ConnectionFactory();
        Connection con = factory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("DELETE FROM projetos WHERE Id = ?");
            stmt.setInt(1, projs.getId());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Projeto excluido com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + e);
        } finally {
            factory.closeConnection(con, stmt);
        }
    }

}

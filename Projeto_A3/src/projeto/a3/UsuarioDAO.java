package projeto.a3;

import java.sql.*;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class UsuarioDAO {

    public void inserir(Usuario user) {
        ConnectionFactory factory = new ConnectionFactory();
        Connection c = factory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = c.prepareStatement("INSERT INTO usuarios(nome, login, email, senha, telefone) VALUES (?,?,?,?,?)");
            stmt.setString(1, user.getNome());
            stmt.setString(2, user.getNomeUser());
            stmt.setString(3, user.getEmail());
            stmt.setString(4, user.getSenha());
            stmt.setString(5, user.getTelefone());
            JOptionPane.showMessageDialog(null, "Cadastro com sucesso!");
            stmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean checkLogin(String login, String senha) {
        ConnectionFactory factory = new ConnectionFactory();
        Connection con = factory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        boolean check = false;
        if(!login.isEmpty() && !senha.isEmpty()){
            try {
                String SQL = "SELECT login, senha FROM usuarios WHERE login LIKE '"+login +"' and senha LIKE '"+senha+"'";
                stmt = con.prepareStatement(SQL);
                rs = stmt.executeQuery();

                if (rs.next()) {
                    check = true;
                }

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                factory.closeConnection(con,stmt,rs);
            }
        }
        return check;
    } 
    public void atualizar(Usuario user) {
        //1: Comando do sql para inserir os dados na tabela de usuários
        ConnectionFactory factory = new ConnectionFactory();
        Connection con = factory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("UPDATE usuarios SET nome = ?, login = ?, email = ?, senha = ?, telefone = ? WHERE id = ?");

            stmt.setString(1, user.getNome());
            stmt.setString(2, user.getNomeUser());
            stmt.setString(3, user.getEmail());
            stmt.setString(4, user.getSenha());
            stmt.setString(5, user.getTelefone());
            stmt.setInt(6, user.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Alteração efetuada!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + e);
        } finally {
            factory.closeConnection(con, stmt);
        }

    }

    public List<Usuario> read() {
        ConnectionFactory cf = new ConnectionFactory();
        Connection con = cf.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Usuario> usuarios = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM usuarios");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Usuario users = new Usuario();
                users.setId(rs.getInt("id"));
                users.setNome(rs.getString("nome"));
                users.setNomeUser(rs.getString("login"));
                users.setEmail(rs.getString("email"));
                users.setSenha(rs.getString("senha"));
                users.setTelefone(rs.getString("telefone"));
                usuarios.add(users);

            }

        } catch (Exception e) {

        } finally {
            cf.closeConnection(con, stmt);
        }
        return usuarios;
    }

    public void deletar(Usuario user) {
        //1: Comando do sql para inserir os dados na tabela de usuários
        ConnectionFactory factory = new ConnectionFactory();
        Connection con = factory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("DELETE FROM usuarios WHERE id = ?");

            stmt.setInt(1, user.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Exclusão efetuada!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + e);
        } finally {
            factory.closeConnection(con, stmt);
        }

    }
}

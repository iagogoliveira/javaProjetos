package projeto.a3;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;


public class ConnectionFactory {
    
    private  String BD = "db_usuarios";
    
    public  Connection getConnection(){
        try{
            Connection c = DriverManager.getConnection("jdbc:sqlite:"+BD+".db");
            
            Statement statement = c.createStatement();
            statement.setQueryTimeout(30);
            return c;
        } catch (Exception e){
            System.out.println("Conexão efetuada"+e);
            return null;
        }
         
    }
    // Esse metodo serve para fechar a conexão com o banco, pois a cada pedido de login/cadastro, o banco travava por que já existia conexões abertas
    public void closeConnection(Connection con){
        try{
            if(con!=null){
                con.close();
            }
        }
        catch(Exception e){
           System.out.println("Conexão finalizada!");
        }
    }
    public void closeConnection(Connection con, PreparedStatement stmt){
        closeConnection(con);
        try{
            if(stmt!=null){
                stmt.close();
            }
        }
        catch(Exception e){
           System.out.println("Conexão finalizada!");
        }
    }
    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs) {
        ConnectionFactory cf = new ConnectionFactory();
        cf.closeConnection(con, stmt);

        try {

            if (rs != null) {
                rs.close();
            }

        } catch (Exception e) {
            System.out.println("Conexão finalizada!");
        }
    }
}

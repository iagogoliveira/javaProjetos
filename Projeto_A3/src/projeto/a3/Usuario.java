package projeto.a3;

public class Usuario {
    private String nome;
    private String nomeUser;
    private String email;
    private String senha;
    private String telefone;
    private int id;
    

    public Usuario(Integer id, String nome, String nomeUser, String email, String senha, String telefone){
        this.id = id;
        this.nome = nome;
        this.nomeUser = nomeUser;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
        
    }
    public Usuario() {
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeUser() {
        return nomeUser;
    }

    public void setNomeUser(String nomeUser) {
        this.nomeUser = nomeUser;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    } 
    
}
    


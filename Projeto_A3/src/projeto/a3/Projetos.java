/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.a3;

/**
 *
 * @author iagol
 */
public class Projetos {
    private String nome;
    private String descricao;
    private String userProp;
    private int id;
    
    public Projetos(Integer id, String nome, String descricao, String userProp){
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.userProp = userProp;
    }
    
    public Projetos(){
        
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getUserProp() {
        return userProp;
    }

    public void setUserProp(String userProp) {
        this.userProp = userProp;
    }
    
}

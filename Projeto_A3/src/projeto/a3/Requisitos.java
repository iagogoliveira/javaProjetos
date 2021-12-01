package projeto.a3;

public class Requisitos {
    private String projeto;
    private String nome;
    private String modulo;
    private String funcoes;
    private String dataCriacao;
    private String autor;
    private String autorUltAlt;
    private String dataUltMod;
    private String versao;
    private String prior;
    private String complex;
    private String esfHoras;
    private String estado;
    private String fase;
    private String descricao;
    private int id;
    
    public Requisitos(Integer id,String projeto, String nome, String modulo, String funcoes, String dataCriacao, String autor, String autorUltAlt, String dataUltMod, String versao, String prior, String complex, String esfHoras, String estado, String fase, String descricao){
        this.id = id;
        this.projeto = projeto;
        this.nome = nome;
        this.modulo = modulo;
        this.funcoes = funcoes;
        this.dataCriacao = dataCriacao;
        this.autor = autor;
        this.autorUltAlt = autorUltAlt;
        this.dataUltMod = dataUltMod;
        this.versao = versao;
        this.prior = prior;
        this.complex = complex;
        this.esfHoras = esfHoras;
        this.estado = estado;
        this.fase = fase;
        this.descricao = descricao;
    }
    public Requisitos(){
    }
        
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    
    public String getProjeto(){
        return projeto;
    }
    
    public void setProjeto(String projeto){
        this.projeto = projeto;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    public String getFuncoes() {
        return funcoes;
    }

    public void setFuncoes(String funcoes) {
        this.funcoes = funcoes;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutorUltAlt() {
        return autorUltAlt;
    }

    public void setAutorUltAlt(String autorUltAlt) {
        this.autorUltAlt = autorUltAlt;
    }

    public String getDataUltMod() {
        return dataUltMod;
    }

    public void setDataUltMod(String dataUltMod) {
        this.dataUltMod = dataUltMod;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public String getPrior() {
        return prior;
    }

    public void setPrior(String prior) {
        this.prior = prior;
    }

    public String getComplex() {
        return complex;
    }

    public void setComplex(String complex) {
        this.complex = complex;
    }

    public String getEsfHoras() {
        return esfHoras;
    }

    public void setEsfHoras(String esfHoras) {
        this.esfHoras = esfHoras;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFase() {
        return fase;
    }

    public void setFase(String fase) {
        this.fase = fase;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
}

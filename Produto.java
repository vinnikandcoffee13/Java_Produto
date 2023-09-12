package prjprodutos;

public class Produto {
    private int codigo;
    private String nome;
    private String Descricao;
    private float valor;
    private int qtdeEstoque;
    private boolean ativo;

    public Produto(int codigo, String nome, String Descricao, float valor, int qtdeEstoque, boolean ativo) {
        this.codigo = codigo;
        this.nome = nome;
        this.Descricao = Descricao;
        this.valor = valor;
        this.qtdeEstoque = qtdeEstoque;
        this.ativo = ativo;
    }
 
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getQtdeEstoque() {
        return qtdeEstoque;
    }

    public void setQtdeEstoque(int qtdeEstoque) {
        this.qtdeEstoque = qtdeEstoque;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public String toString() {
        return "Produto{" + "codigo=" + codigo + ", nome=" + nome + ", Descricao=" + Descricao + ", valor=" + valor + ", qtdeEstoque=" + qtdeEstoque + ", ativo=" + ativo + '}';
    }

}
    
    
    
    



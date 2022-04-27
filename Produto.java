public class Produto {

    private String nome;

    private String descricao;

    private int valor;

    private int valorPromoção;

    private int dataVencimento;

    private int codigDeBarra;

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

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getValorPromoção() {
        return valorPromoção;
    }

    public void setValorPromoção(int valorPromoção) {
        this.valorPromoção = valorPromoção;
    }

    public int getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(int dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public int getCodigDeBarra() {
        return codigDeBarra;
    }

    public void setCodigDeBarra(int codigDeBarra) {
        this.codigDeBarra = codigDeBarra;
    }
}


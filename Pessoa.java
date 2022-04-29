public class Pessoa extends Abstract {
    private String nome;
    private String rg;
    private String cpf;
    private String dataNascimento;
    private String signo;
    private String genero;
    private String altura;
    private String religiao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSigno() {
        return signo;
    }

    public void setSigno(String signo) {
        this.signo = signo;
    }

    public String getGenero(String masculino) {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getReligiao() {
        return religiao;
    }

    public void setReligiao(String religiao) {
        this.religiao = religiao;
    }

    @Override
    public void editar() {
        System.out.println("Editado com sucesso!");
    }

    @Override
    public void salvar() {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Kevin");
        pessoa.setAltura("1.85");
        pessoa.setCpf("");
        pessoa.setReligiao("Catolica");
        pessoa.setRg("");
        pessoa.setDataNascimento("10/05/1996");
        pessoa.setSigno("Sagitario");
        pessoa.getGenero("Masculino");

        System.out.println("Pessoa cadastrada com sucesso");
    }

    @Override
    public void excluir() {
        System.out.println("Cadastro excluido com sucesso!");
    }

    @Override
    public void listar() {
        System.out.println("Busca efetivada com sucesso!");
    }
}

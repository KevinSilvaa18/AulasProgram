public class Aluno {
    String nome;
    int nota;

    public <Public> Public Aluno(String nome, int nota){
        this.nota = nota;
        this.nome = nome;
        Public o = null;
        return o;
    }

    public void validarNota() {
        System.out.println("Você foi aprovado");
    }
}

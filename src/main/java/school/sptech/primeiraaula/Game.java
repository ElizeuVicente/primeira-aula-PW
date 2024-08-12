package school.sptech.primeiraaula;

public class Game {
    private String nome;
    private Produtora produtora;
    private Double nota;

    public Game(String nome, Produtora produtora, Double nota) {
        this.nome = nome;
        this.produtora = produtora;
        this.nota = nota;
    }

    public Game() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Produtora getProdutora() {
        return produtora;
    }

    public void setProdutora(Produtora produtora) {
        this.produtora = produtora;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Games{" +
                "nome='" + nome + '\'' +
                ", produtora='" + produtora + '\'' +
                ", nota='" + nota + '\'' +
                '}';
    }
}

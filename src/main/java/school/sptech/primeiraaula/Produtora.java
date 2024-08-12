package school.sptech.primeiraaula;

public class Produtora {
    private String nome;
    private String fundador;
    private String paisDeOrigem;

    public Produtora(String nome, String fundador, String paisDeOrigem) {
        this.nome = nome;
        this.fundador = fundador;
        this.paisDeOrigem = paisDeOrigem;
    }

    public Produtora() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFundador() {
        return fundador;
    }

    public void setFundador(String fundador) {
        this.fundador = fundador;
    }

    public String getPaisDeOrigem() {
        return paisDeOrigem;
    }

    public void setPaisDeOrigem(String paisDeOrigem) {
        this.paisDeOrigem = paisDeOrigem;
    }

    @Override
    public String toString() {
        return "Produtora{" +
                "nome='" + nome + '\'' +
                ", fundador='" + fundador + '\'' +
                ", paisDeOrigem='" + paisDeOrigem + '\'' +
                '}';
    }
}

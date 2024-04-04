public class TextoSaida {
    private int id;
    private int tamLetra;
    private String corFonte;
    private String corFundo;
    private String compExibicao; // label, edit e memo

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTamLetra() {
        return tamLetra;
    }

    public void setTamLetra(int tamLetra) {
        this.tamLetra = tamLetra;
    }

    public String getCorFonte() {
        return corFonte;
    }

    public void setCorFonte(String corFonte) {
        this.corFonte = corFonte;
    }

    public String getCorFundo() {
        return corFundo;
    }

    public void setCorFundo(String corFundo) {
        this.corFundo = corFundo;
    }

    public String getCompExibicao() {
        return compExibicao;
    }

    public void setCompExibicao(String compExibicao) {
        this.compExibicao = compExibicao;
    }

    public TextoSaida(int id, int tamLetra, String corFonte, String corFundo, String compExibicao){
        this.id = id;
        this.tamLetra = tamLetra;
        this.corFonte = corFonte;
        this.corFundo = corFundo;
        this.compExibicao = compExibicao;
    }

    public TextoSaida editarTexto(int id, int tamLetra, String corFonte, String corFundo, String compExibicao){
        this.id = id;
        this.tamLetra = tamLetra;
        this.corFonte = corFonte;
        this.corFundo = corFundo;
        this.compExibicao = compExibicao;

        return this;
    }
}

import java.util.ArrayList;
import java.util.List;
public  class Pais {
    private String codigoIso;
    private String nome;
    private double populacao;
    private double dimensao;
    private List <Pais> paisFronteira = new ArrayList();

    public Pais(String codigoIso, String nome, double populacao, double dimensao) {
        this.codigoIso = codigoIso;
        this.nome = nome;
        this.populacao = populacao;
        this.dimensao = dimensao;
    }

    public String getCodigoIso() {
        return codigoIso;
    }

    public  void setCodigoIso(String codigoIso) {
        this.codigoIso = codigoIso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPopulacao() {
        return populacao;
    }

    public void setPopulacao(double populacao) {
        this.populacao = populacao;
    }

    public double getDimensao() {
        return dimensao;
    }

    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
    }

    public void adicionarFronteira(Pais pais) {
    paisFronteira.add(pais);
    }

    public boolean paisFronteira(String fronteira) {
        for (int i = 0; i < paisFronteira.size(); i++) {
            if (paisFronteira.get(i).getNome().equals(fronteira)) {
                return true;
            }
        }
        return false;
    }

    List<Pais> getPaisFronteira() {
    return paisFronteira;
    }

    public List<Pais> fronteirasEmComum (Pais paisVizinho) {
    List <Pais> fronteirasEmComum = new ArrayList();
          for (int i = 0; i < paisFronteira.size(); i++) {
        for (int v = 0; v < paisVizinho.getPaisFronteira().size(); v++) {
    if(paisFronteira.get(i).getNome().equals(paisVizinho.getPaisFronteira().get(v).getNome())) {
    fronteirasEmComum.add(paisFronteira.get(i));

    }

        }

        }
        return fronteirasEmComum;
    }

}

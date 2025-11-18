package br.com.alura.minhasmusicas;

public class Podcast extends Audio {
    private String apresentador;
    private String descricao;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    @Override
    public int getClassificacao() {
        if (this.getTotalCurtidas() >= 100){
            return 10;
        } else if (this.getTotalCurtidas() > 50 && this.getTotalCurtidas() < 100) {
            return 8;
        } else {
            return 0;
        }
    }
}

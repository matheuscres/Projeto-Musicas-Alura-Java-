package br.com.alura.minhasmusicas;

public class Musica extends Audio {
    private String album;
    private String artista;
    private String genero;

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    @Override
    public int getClassificacao() {
        if (this.getTotalCurtidas() >= 200){
            return 10;
        } else if (this.getTotalCurtidas() > 100 && this.getTotalCurtidas() < 200) {
            return 8;
        } else {
            return 0;
        }
    }
}



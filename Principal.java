package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.MinhasPreferidas;
import br.com.alura.minhasmusicas.Musica;
import br.com.alura.minhasmusicas.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();

        minhaMusica.setTitulo("Kiss");
        minhaMusica.setArtista("Lil Peep");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }
        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Podnheiro");
        meuPodcast.setApresentador("Dicley");

        for (int i = 0; i < 3000; i++) {
            meuPodcast.reproduz();
        }
        for (int i = 0; i < 100; i++) {
            meuPodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);
    }
}

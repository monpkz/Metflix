package app;

import java.util.ArrayList;
import java.util.List;
import app.personas.*;

public class Metflix {

    public List<Pelicula> peliculas = new ArrayList<>();
    public List<Serie> series = new ArrayList<>();
    public List<INominable> nominados = new ArrayList<>();

    // Metodo que inicializa el catalogo cno las pelis/series qeu querramos
    public void inicializarCatalogo() {

        // Pelis: Titanic, Batman: El caballero de la noche
        Pelicula titanic; // declara una variable que apuntara a una Pelicula
        titanic = new Pelicula(); // Estas ultimas 2 lineas: Pelicula titanic = new Pelicula();

        // Agrego setters
        titanic.setNombre("Titanic");
        titanic.setAñoLanzamiento(1997);
        titanic.setDuracion(210); // 3hs 30

        Actor actor = new Actor();
        actor.setNombre("Leo DiCaprio");

        // Agrego a la lista de actores del objeto titanic
        // agrego getters
        titanic.getActores().add(actor); // metodo Add -> agregar a una lista

        // Recien ahora estoy agregando a Titanic al catalogo
        this.peliculas.add(titanic);

        // Otra Peli
        Pelicula batman = new Pelicula();
        batman.setNombre("Batman: el caballero de la nohe");
        batman.setAñoLanzamiento(2008);
        batman.setDuracion(152);

        // No voy a declarar otra variable actor, voy a reusar
        // siempre primero antes de reusar
        // re instanciar
        actor = new Actor(); // Creo un nuevo actor, pero referenciado con la variable actor
        actor.setNombre("Christian Bale");

        batman.getActores().add(actor);

        this.peliculas.add(batman);

        this.nominados.add(batman);
        this.nominados.add(actor);

        // agrego pelicula Scarface
        Pelicula scarface;
        scarface = new Pelicula();

        scarface.setNombre("Scarface");
        scarface.setAñoLanzamiento(1983);
        scarface.setDuracion(170); // 2hs 50

        actor = new Actor();
        actor.setNombre("Al Pacino");

        scarface.getActores().add(actor);

        this.peliculas.add(scarface);
        this.nominados.add(scarface);

        // agrego pelicula midsommar
        Pelicula midsommar;
        midsommar = new Pelicula();

        midsommar.setNombre("Midsommar");
        midsommar.setAñoLanzamiento(2019);
        midsommar.setDuracion(138);

        actor = new Actor();
        actor.setNombre("Florence Pugh");

        midsommar.getActores().add(actor);

        this.peliculas.add(midsommar);

        // How I met your mother. Serie

        Serie howIMetYM = new Serie();
        howIMetYM.setNombre("How I met your mother");
        howIMetYM.setAñoLanzamiento(2005);

        actor = new Actor();
        actor.setNombre("Neil Patrick Harris");

        howIMetYM.getActores().add(actor);

        actor = new Actor();
        actor.setNombre("Cobie Smulders");

        howIMetYM.getActores().add(actor);

        // T5:E11
        // creo la temporada
        Temporada temporada = new Temporada();
        temporada.setNumero(5);

        // Creo el episodio
        Episodio episodio = new Episodio(11, "The last cigarrette");
        // episodio.nombre = "The last cigarrette";
        // episodio.numero = 11;

        // vinculo temporada con episodio
        temporada.getEpisodios().add(episodio);

        episodio = new Episodio(1, "Definitions", 41);

        temporada.getEpisodios().add(episodio);

        Websodio ws = new Websodio(35, "Blue", "http://miespisodio.com/websodio.avi");
        // ws.setNombre("Blue");
        // ws.setNumero(35);
        ws.setDuracion(42);
        // ws.setlink("http://miespisodio.com/websodio.avi");

        temporada.getEpisodios().add(ws);

        // Agrego la temporada
        howIMetYM.getTemporadas().add(temporada);

        // T3
        // creo la temporada
        temporada = new Temporada();
        temporada.setNumero(3);

        // Creo el episodio
        episodio = new Episodio(1, "Wait for it", 40);
        // episodio.setNombre("Wait for it");
        // episodio.setNumero(1);
        // episodio.setDuracion(40);

        // vinculo temporada con episodio
        temporada.getEpisodios().add(episodio);

        episodio = new Episodio(4, "Little Boys");
        episodio.setDuracion(44);

        temporada.getEpisodios().add(episodio);

        // Agrego la temporada
        howIMetYM.getTemporadas().add(temporada);

        // Aca esta toda la serie con 2 temporadas y cada una con 2 episodios.
        this.series.add(howIMetYM);

        Serie bbt = new Serie();
        bbt.setNombre("The BigBang Theory");
        bbt.setAñoLanzamiento(2007);

        actor = new Actor();
        actor.setNombre("Kaley Cuoco");

        bbt.getActores().add(actor);

        // creo la temporada
        temporada = new Temporada();
        temporada.setNumero(1);

        // Creo el episodio
        episodio = new Episodio(1, "Pilot", 41);

        // vinculo temporada con episodio
        temporada.getEpisodios().add(episodio);

        episodio = new Episodio(13, "The Cooper-Hofstadter Polarizatio");
        episodio.setDuracion(43);

        temporada.getEpisodios().add(episodio);

        // creo la temporada
        bbt.getTemporadas().add(temporada);

        this.series.add(bbt);

        // creo serie Stranger Trings
        Serie strangerT = new Serie();
        strangerT.setNombre("Stranger Things");
        strangerT.setAñoLanzamiento(2016);

        actor = new Actor();
        actor.setNombre("Millie Bobby Brown");

        strangerT.getActores().add(actor);

        actor = new Actor();
        actor.setNombre("Winona Ryder");

        strangerT.getActores().add(actor);

        // T2 : E3,E4
        temporada = new Temporada();
        temporada.setNumero(2);

        // creo episodio 3 y 4
        episodio = new Episodio(3, "«Chapter Three: The Pollywog»");

        temporada.getEpisodios().add(episodio);

        episodio = new Episodio(4, "«Chapter Four: Will the Wise»");

        temporada.getEpisodios().add(episodio);
        strangerT.getTemporadas().add(temporada);

        this.series.add(strangerT);

        // T3 : E5,E6
        temporada = new Temporada();
        temporada.setNumero(3);

        episodio = new Episodio(5, "«Chapter Five: The Flayed»");

        temporada.getEpisodios().add(episodio);

        episodio = new Episodio(6, "«Chapter Six: E Pluribus Unum»");

        temporada.getEpisodios().add(episodio);
        strangerT.getTemporadas().add(temporada);

        this.series.add(strangerT);

        // creo serie You con dos temporadas y dos episodios
        Serie you = new Serie();
        you.setNombre("You");
        you.setAñoLanzamiento(2018);

        actor = new Actor();
        actor.setNombre("Penn Badgley");

        you.getActores().add(actor);

        actor = new Actor();
        actor.setNombre("Elizabeth Lail");

        you.getActores().add(actor);

        // T1 E9, E10
        temporada = new Temporada();
        temporada.setNumero(1);

        episodio = new Episodio(9, "«Candace»");

        temporada.getEpisodios().add(episodio);

        episodio = new Episodio(10, "«Bluebeard's Castle»");

        temporada.getEpisodios().add(episodio);
        you.getTemporadas().add(temporada);

        this.series.add(you);

        // T2 E6, E7
        temporada = new Temporada();
        temporada.setNumero(2);

        episodio = new Episodio(6, "«Farewell, My Bunny»");

        temporada.getEpisodios().add(episodio);

        episodio = new Episodio(7, "«Ex-istential Crisis»");

        temporada.getEpisodios().add(episodio);
        you.getTemporadas().add(temporada);

        this.series.add(you);
    }

    // Buscar Serie
    public Serie buscarSerie(String nombreABuscar) {

        // series = | serie1 | serie2 | serie25 | serie40 |
        // vamos a usar el foreach: que sirve para recorrer listas
        // este ciclo, tiene una variable, qeu apunta en cada vuelta
        // a cada elemento de la lista
        // o sea la primer vez, va a apuntar a serie1, despues a serie2 ddesp
        // serie25 hasta que termina.
        for (Serie serie : this.series) {
            // pregunto si el nombre de la serie actual
            // que estoy recorriendo es la que necesito
            if (serie.getNombre().equals(nombreABuscar))
                return serie; // devuelvo esta serie.
        }
        // si llego hasta aca, es porque no encontro la serie.
        return null;
    }

    // buscar un director

    // Buscar Serie
    public Serie buscarSerieV2(String nombreABuscar) {
        Serie serieBuscada = null;
        // En este caso se recorre TODO(aunque haya 1000 series)
        // y al final se devuelve si encontr una serie.
        // en el caso anterior, se devuelve una vez encontrada.
        // ej si hay 1000 series pero esta en la posicion 3, hace 3 vueltas
        for (Serie serie : this.series) {
            if (serie.getNombre().equals(nombreABuscar))
                serieBuscada = serie;
        }
        return serieBuscada;
        /*
         * if (serieBuscada == null) return null; else return serieBuscada;
         */

    }

    public void mostrarNominaciones() {
        // voy a imprimir el trailer de nominados.
        int totalPelis = 0;
        int totalActores = 0;
        for (INominable nominado : this.nominados) {
            nominado.reproducirTrailerNominacion();

            if (nominado instanceof Pelicula)
                totalPelis++;
            if (nominado instanceof Actor)
                totalActores++;
        }
        System.out.println("Peliculas nominadas: " + totalPelis);
        System.out.println("Actores nominados: " + totalActores);
    }

    public void reproducirEpisodioDeSerie(String nombreSerie, int nroTemporada, int nroEpisodio) {

        Serie serie = this.buscarSerie(nombreSerie);
        Temporada temporada = serie.buscarTemporada(nroTemporada);
        Episodio episodio = temporada.buscarEpisodio(nroEpisodio);
        episodio.reproducir();
    }
}
public class App {
    public static void main(String[] args) throws Exception {
        //A partir de Metflix, buscar la temporada, episodio de la serie
        //Strangers Things y 
        //reproducir el episodio.

        Metflix miMetflix = new Metflix();

        System.out.println("Inicializando catalogo de Metflix");

        miMetflix.inicializarCatalogo();//Estoy llamando al metodo que crea las pelis y series.

        Serie serieBuscada = miMetflix.buscarSerie("You");

        Temporada temporada = serieBuscada.buscarTemporada(1);

        Episodio episodio = temporada.buscarEpisodio(10);

        episodio.reproducir();



    }
}

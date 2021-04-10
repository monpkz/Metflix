public class Episodio {
    private int numero;
    private String nombre;
    private int duracion; // en minutos
    private Director director = new Director();
    private String sinopsis;

    // GETTERS/SETTERS
    // GETTER => permite leer un valor de atributo
    // SETTER => permite asignar un valor a un atributo

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return this.duracion;
    }

    public void setDuracion(int duracion) {
        this.numero = duracion;
    }

    public Director getDirector(){ 
        return this.director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public String getSinopsis() {
        return this.sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public void reproducir() {
        System.out.println("Reproduciendo episodio " + nombre);
    }
}

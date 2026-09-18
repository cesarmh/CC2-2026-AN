public class Persona{
    String nombre,dpi;
    public Persona(String nombre, String dpi){
        this.nombre = nombre;
        this.dpi = dpi;
    }
    public boolean equals(Persona p){
        return this.nombre.equals(p.nombre) && this.dpi.equals(p.dpi);

    }
}
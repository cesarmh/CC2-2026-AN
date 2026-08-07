
public class Persona {
  String nombre;
  String carnet;

  public Persona(String nombre, String carnet) {
    this.nombre = nombre;
    this.carnet = carnet;
  }

  public boolean equals(Persona otra) {
    if (this == otra) return true;
    // comparamos ambos carnets
    return carnet.equals(otra.carnet); 
  }
}



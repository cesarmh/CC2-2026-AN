
public class PruebaPersona {
  public static void main(String[] args) {

    Persona per1 = new Persona("Ana", "A001");
    Persona per2 = new Persona("Ana", "A001");
    Persona per3 = new Persona("Ana", "A002");

    System.out.println("per1 == per2 : " + (per1 == per2));
    System.out.println("per1 equals per2 : " + per1.equals(per2));
    System.out.println("per1 equals per3 : " + per1.equals(per3));

  }
}



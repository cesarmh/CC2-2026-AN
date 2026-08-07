public class PruebaBasica {
  public static void main(String[] args) {
    CuentaBancaria cuenta1, cuenta2;
    cuenta1 = new CuentaBancaria("Juan Perez", "1934181-5", 'A');
    String nombre1 = cuenta1.getNombre();
    double saldo1 = cuenta1.getSaldoActual();
    System.out.println("Nombre cuenta: " + nombre1);
    System.out.println("Saldo cuenta: " + saldo1);
    cuenta1.depositar(115.0);
    System.out.println("Despues de deposito: " + cuenta1.getSaldoActual());
    cuenta1.retirar(25.50);
    System.out.println("Despues de retiro: " + cuenta1.getSaldoActual());
  }
}


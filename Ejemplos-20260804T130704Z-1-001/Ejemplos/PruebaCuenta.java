public class PruebaCuenta {
  public static void main(String[] args) {
    CuentaBancaria cuenta1, cuenta2;
    cuenta1 = new CuentaBancaria("Maria Lopez", "19181-5", 'A');
    cuenta2 = new CuentaBancaria("Juan Perez", "34210-7", 'M', 420.00);
    System.out.println("Cuenta #1: " + cuenta1);
    System.out.println("Cuenta #2: " + cuenta2);
    System.out.println("Depositando 150.00 en Cuenta #1");
    cuenta1.depositar(150.0);
    String nombre1 = cuenta1.getNombre();
    double saldo1 = cuenta1.getSaldoActual();
    System.out.println("Nuevo saldo de " + nombre1 + "es: " + saldo1);
    System.out.println("Retirando 115.00 de Cuenta #2");
    cuenta2.retirar(115.0);
    System.out.println("Cuenta #2: " + cuenta2);
  }
}

public class CuentaBancaria {

  private String nombre, numeroCuenta;
  private double saldo;
  private char tipo;

  public CuentaBancaria (String nombre, String nocuenta, char tipo, double s) {
    this.nombre = new String(nombre);
    numeroCuenta = new String(nocuenta);
    this.tipo = tipo;
    saldo = s;
  }

  public CuentaBancaria (String nombre, String nocuenta, char tipo) {
    this(nombre, nocuenta, tipo, 0.00);
  }

  public String getNombre() {
    return nombre;
  }

  public String getNumeroCuenta() {
    return numeroCuenta;
  }

  public double getSaldoActual() {
    return saldo;
  }

  public char getTipo() {
    return tipo;
  }

  public void depositar(double monto) {
		if (monto >0) saldo += monto;
		else System.out.println("Monto debe ser positivo");
  }

  public boolean disponible(double cantidad) {
		if (cantidad <= this.getSaldoActual()) return true;
		else return false;
	}

	public void retirar(double monto) {
		if (this.disponible(monto)) saldo -= monto;
		else System.out.println("No hay suficientes fondos");
  }

  public String toString() {
    String s =  "Nombre: " + nombre +
                ", No. Cuenta: " + numeroCuenta +
                ", Tipo: " + tipo +
                ", Saldo Actual: " + saldo;
    return s;
  }

  public boolean equals(CuentaBancaria otra) {
    if (this.nombre.equals(otra.nombre) &&
        this.numeroCuenta.equals(otra.numeroCuenta) &&
        (this.tipo == otra.tipo) && (this.saldo == otra.saldo))
        return true;
    return false;
  }

}

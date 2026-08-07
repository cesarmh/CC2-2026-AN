public class Fraccion {
  private int numerador, denominador;

  public Fraccion(int num, int den) {
    numerador = num;
    if (den != 0) {
      denominador = den;
    } else {
      denominador = 1;
    }
  }

  public Fraccion(int num) {
    this(num,1);
  }

  public int getNum() {
    return this.numerador;
  }

  public int getDen() {
    return this.denominador;
  }

  public void setNum(int num) {
    this.numerador = num;
  }

  public void setDen(int den) {
    if (den != 0) {
      this.denominador = den;
    }
  }

  private static int mfc(int a, int b) {
    if (b == 0) {
      return a;
    } else {
      return mfc(b, a%b);
    }
  }

  public void simplify() {
    int maxfc = mfc(this.getNum(), this.getDen());
    this.setNum(numerador/maxfc);
    this.setDen(denominador/maxfc);
  }

  public Fraccion add (Fraccion f) {
    int n = (this.getNum() * f.getDen()) +
            (f.getNum() * this.getDen());
    int d = this.getDen() * f.getDen();
    Fraccion resultado = new Fraccion(n,d);
    resultado.simplify();
    return resultado;
  }

  public String toString() {
    String str = "["+ this.numerador + "/" + this.denominador + "]";
    return str;
  }

}

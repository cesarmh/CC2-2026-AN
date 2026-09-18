public class SimpleNode<T> {
  private T dato;
  SimpleNode<T> next;

  public SimpleNode(T d, SimpleNode<T> n) {
    this.dato = d;
    this.next = n;
  }

  public SimpleNode(T d) {
    this(d, null);
  }

  public T getDato() {
    return this.dato;
  }

  public String toString() {
    String s = "";
    s += "[ " + this.getDato() + " ]->";
    if (this.next != null)
      s += this.next.toString();
    return s;
  }

}

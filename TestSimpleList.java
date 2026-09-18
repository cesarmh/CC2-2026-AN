/*public class TestSimpleList {
  public static void main(String[] args) {
    SimpleList<Integer> slist = new SimpleList<Integer>();
    System.out.println(slist);
    slist.addLast(1);
    System.out.println(slist);
    slist.addLast(2);
    System.out.println(slist);
    slist.addLast(3);
    System.out.println(slist);
  }
}
*/


public class TestSimpleList {
  public static void main(String[] args) {
    SimpleList<Integer> slist = new SimpleList<Integer>();
    System.out.println(slist);
    slist.addFirst(1);
    //slist.addLast(1);
    System.out.println(slist);
    slist.addFirst(2);
    //slist.addLast(2);
    System.out.println(slist);
    slist.addFirst(3);
    slist.add(4,1);
    //slist.addLast(3);
    System.out.println(slist);
  }
} 

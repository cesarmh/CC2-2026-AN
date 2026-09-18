public class SimpleList<T> {
	 private SimpleNode<T> head;
	 private int size;

   public SimpleList() {
     this.head = null;
     this.size = 0;
   }

   public boolean isEmpty() {
     return head == null;
   }

   public int size() {
     return this.size;
   }

   public void addFirst(T dato) {
     if (this.isEmpty()) {
       this.head = new SimpleNode<T>(dato);
       this.size = 1;
     } else {
       SimpleNode<T> nuevo = new SimpleNode<T>(dato, head);
       this.head = nuevo;
       this.size += 1;
     }
   }

   public void addLast(T dato) {
     if (this.isEmpty()) {
       this.head = new SimpleNode<T>(dato);
       this.size = 1;
     } else {
       SimpleNode<T> aux = head;
       while (aux.next != null)
 			   aux = aux.next;
       aux.next = new SimpleNode<T>(dato);
 			 size += 1;
     }
   }
   public void add(T dato,int n){
    if(n<=0){
      this.addFirst(dato);
    }else if(n>=this.size-1){
      this.addLast(dato);
    }else{
      if(n==size-1){
        this.addLast(dato);
      }else{
        SimpleNode<T> aux = head;
        SimpleNode<T> aux2 = head;
        for(int i=0;i<n;i++){
          if(i==n-2){
            aux2 = aux2.next;
          }
          aux = aux.next;
        }
        //System.out.println(aux.getDato());
        aux2.next = new SimpleNode<T>(dato,aux);
        aux = null;
        aux2 = null;
      }
      
      
      
    }
   }

   public String toString() {
     String s = "|->";
     if (!this.isEmpty()) {
       s += this.head.toString();
     }
     return s;
   }

}

public class TestSimpleNode{
    /*Cree un primer nodo que tenga un entero 5, asignado a la variable x. 
Enlace un segundo nodo como siguiente al primero que tenga un dato 3, SIN crear otra variable
Enlace un tercer nodo entre el primero y el segundo, que tenga dato 4; puede crear variables auxiliares, 
pero al final solo debe quedar la variable x, las demás deben apuntar a null. 
Despliege los datos de los tres nodos, desde la variable x, deberia imprimerse 5, 4, 3
Enlace un cuarto nodo con dato 6, para el cual el nodo que tiene 5, 
debe ser su next, quedando x apuntando a ese nodo. De igual manera al final solo debe quedar la variable x
*/
    public static void main(String[] args){
        SimpleNode<Integer> x = new SimpleNode<Integer>(5);
        x.next = new SimpleNode<Integer>(3);
        SimpleNode<Integer> aux = new SimpleNode<Integer>(4) ;
        //SimpleNode<Integer> aux = x.next;
        //x.next = new SimpleNode<Integer>(4) ;
        //x.next.next = aux;
       
        aux.next = x.next;
        x.next = aux;
        System.out.println(x);
        aux = x;
        x=new SimpleNode<Integer>(6);
        x.next = aux;
        System.out.println(x);

    }
}
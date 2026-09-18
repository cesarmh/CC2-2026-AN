public class PruebaPersona{
    public static int sumar(int a,int b){
        return a+b;
    }
    public static void main(String[] args){
        Persona gabriela = new Persona("Gabriela","123445566676");
        Persona david = new Persona("David","123445866676");
        System.out.println(sumar(5,6));
    }
}
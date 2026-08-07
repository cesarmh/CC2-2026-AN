import java.util.Scanner;
public class Correos{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese su apellido: ");
        String apellido = sc.nextLine();
        String username = nombre.substring(0,1) + apellido;
        username = username.toLowerCase();
        System.out.println(username);
    }
}
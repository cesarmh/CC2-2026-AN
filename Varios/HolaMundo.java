import java.util.Scanner;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class HolaMundo{
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        //Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombreIncorrecto = bf.readLine();
        String edad = bf.readLine();
        int edad2 = Integer.parseInt(edad);
        //String nombreIncorrecto = "   mArTíN fIeRrO   ";
        String limpio = nombreIncorrecto.trim();
        String[] partes = limpio.split(" ");
        String partNombre = partes[0];
        String partApellido = partes[1];
        String nombre = partNombre.substring(0, 1).toUpperCase() 
                      + partNombre.substring(1).toLowerCase();
        String apellido = partApellido.substring(0, 1).toUpperCase() 
                        + partApellido.substring(1).toLowerCase();
        String resultado =  nombre + ", " + apellido;
        System.out.println(resultado); 

    }
}
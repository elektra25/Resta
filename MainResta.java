import java.util.Scanner;

class MainResta {
    public static void main(String[] args) {
        // Declaración de variables
        int a, b, res;
        // Creación de un objeto Scanner para leer la entrada del usuario
        Scanner op = new Scanner(System.in);
        // Creación de un objeto Resta
        Resta resta = new Resta();
        // Solicitar al usuario que ingrese el primer número
        System.out.println("Ingresa un numero");
        // Leer el primer número ingresado por el usuario
        a = op.nextInt();
        // Solicitar al usuario que ingrese el segundo número
        System.out.println("Ingresa otro numero");
        // Leer el segundo número ingresado por el usuario
        b = op.nextInt();
        // Calcular la resta de los dos números ingresados y asignar el resultado a la variable res
        resta.res = (a - b);
        // Mostrar el resultado de la resta
        resta.mostrarResta();
    }
}

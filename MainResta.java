import java.util.Scanner;
class MainResta {
    public static void main (String [] args){
    int a,b,res;
        Scanner op = new Scanner (System.in);
        Resta resta = new Resta ();
        System.out.println ("Ingresa un numero");
        a=op.nextInt();
        System.out.println ("Ingresa otro numero");
        b=op.nextInt();
        resta.res=(a-b);
        resta.mostrarResta();
    }

    }
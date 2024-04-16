import java.util.Scanner;
public class Ifaejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte calificacion;
        byte suma;

        System.out.println("Ingresa tu calificación");
        calificacion = sc.nextByte();
    

        if(calificacion >=70){
            if(calificacion <= 100){
                System.out.println("Felicidades aprovaste");
            }
        } else {
            System.out.println("Lo siento la calificación que ingresaste no es aprovatoria");
        }
    }


    
}

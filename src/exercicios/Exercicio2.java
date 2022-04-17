package exercicios;
import java.util.Scanner;
public class Exercicio2 {

    public static void main(String[] args) {

        int x, y, z;
        Scanner input = new Scanner(System.in);

        System.out.println("Qual o primeiro numero ? ");
        x = input.nextInt();

        System.out.println("Qual o segundo numero ? ");
        y = input.nextInt();

        System.out.println("Qual o terceiro numero ? ");
        z = input.nextInt();


        if (x < y && y < z) {
            System.out.println("A ordem crescente é: "+x+" "+y+" "+z);
        } else if (x < z && z < y) {
            System.out.println("A ordem crescente é: "+x+" "+z+" "+y);
        } else if (y < x && x < z) {
            System.out.println("A ordem crescente é: "+y+" "+x+" "+z);
        } else if (y < z && z < x) {
            System.out.println("A ordem crescente é: "+y+" "+z+" "+x);
        } else if (z < x && x < y) {
            System.out.println("A ordem crescente é: "+z+" "+x+""+y);
        } else {
            System.out.println("A ordem crescente é: "+z+" "+y+" "+x);
        }
    }

}
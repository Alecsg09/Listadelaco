package exercicios;
import java.util.Scanner;
public class Exercicio1 {

    public static void main(String[] args) {

        int num1, num2,num3;
        Scanner input = new Scanner (System.in);

        System.out.println("Qual o primeiro numero ? ");
        num1 = input.nextInt();

        System.out.println("Qual o segundo numero ? ");
        num2 = input.nextInt();

        System.out.println("Qual o terceiro numero ? ");
        num3 = input.nextInt();

        if (num1 > num2 && num1 > num3){
            System.out.println("O maior numero é : "+num1);
        }if(num2 > num1 && num2 > num3){
            System.out.println("O maior numero é : "+num2);
        }if (num3 > num1 && num3 > num2){
            System.out.println("O maior numero é : "+num3);
        }


    }
}

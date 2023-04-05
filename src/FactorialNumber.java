import java.util.Scanner;

public class FactorialNumber {

    public static void main(String[] args) {

        int num, a = 1, i;

        Scanner in = new Scanner(System.in);
        System.out.println("input value");  // enter any number from you want to  factorial
        num = in.nextInt();

        for (i = 1; i <= num; i++){
            a= a * i;
        }

        System.out.println("Factorial number is: " + a);




    }
}



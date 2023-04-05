import java.util.Scanner;

public class SumOfNaturalNumber {

    public static void main(String[] args) {
        // from 1 to n using for loop and scanner to do sum of natural number
        int n = 0;int sum = 0;

        Scanner scanner=new Scanner(System.in);
        n= scanner.nextInt();

        System.out.print("First " + n + " Numbers = ");

        //  initialize the value of the variable i
        // with 1 and increment each time with 1
        for (int i = 1; i <= n; i++) {


            System.out.print(i + " ");
            sum = sum + i;
        }
        System.out.println();
        System.out.println("Sum of first " + n
                + " Natural Number = " + sum);
    }

}

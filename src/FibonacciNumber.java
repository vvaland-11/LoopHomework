import java.util.Scanner;

public class FibonacciNumber {

    public static void main(String[] args) {

        int n, a = 0, b = 0, c = 1;

        Scanner scanner = new Scanner(System.in); // input any number ex.30
        System.out.print("Enter value of n:");
        n = scanner.nextInt();
        System.out.print("Fibonacci Series:");
        for(int i = 1; i <= n; i++)
        {
            a = b;
            b = c;
            c= a+b;


            System.out.print(a+" ");
        }
    }

    }






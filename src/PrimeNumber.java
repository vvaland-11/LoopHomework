import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
       // using forloop na scanner to check the given number is prime or not

        int n;
        boolean prime;
        Scanner scanner=new Scanner(System.in);

        System.out.println("input any number"); // enter any number

        prime = scanner.hasNextBoolean();
        n= scanner.nextInt();


        for (int i = 2; i <= (n / 2); ++i) {
            // condition for  not prime number
            if (n % i == 0) {
                prime = true;
                break;
            }
        }

        if (!prime)
            System.out.println(n + " is a prime number.");

        else
            System.out.println(n + " is not a prime number.");
    }


    }




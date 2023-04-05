import java.util.Scanner;

public class InputRange {


    public static void main(String[] args) {

        // user input any range ex 20 to 30

        Scanner scanner = new Scanner(System.in);
        System.out.println("input starting number"); //enter any start number ex.10
        int a= scanner.nextInt();
        System.out.println("input end number"); //enter any end number ex.20
        int b= scanner.nextInt();

        for (int i = a; i <= b; i++)     //it will print between 10 to 20 including 10 and 20
        {
            System.out.println(i);

        }

        }
    }


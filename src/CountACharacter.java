import java.util.Scanner;
public class CountACharacter {
    public static void main(String[] args) {


        //Run this class and write any String and count total number of in that string
         Scanner scanner = new Scanner(System.in);
         String hello = scanner.nextLine();
         int charCount = hello.length() - hello.replaceAll("a", "").length();
         System.out.println(charCount);
            }

}



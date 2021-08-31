import java.util.Scanner;

/**
  Takes in string and prints length
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the input string?");
        String str = input.nextLine();
        System.out.println(str + " has " + str.length() + " characters" );

    }
}

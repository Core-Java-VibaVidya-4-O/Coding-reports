import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char c = 'a';
        //int sw = sc.nextInt();

        switch(c) {
            case 'b':
                    System.out.println("a is 1");
                    break;

            case 's':
                    System.out.println("a is 100");
                    break;

            case 'a':
                    System.out.println("a is 150");
                    break;

            default:
                    System.out.println("a is "+c);

        }
    }
}

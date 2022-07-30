import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(in);

        System.out.print(" a ");
        int a = scanner.nextInt();
        System.out.print(" b ");
        int b = scanner.nextInt();
        System.out.print(" c ");
        int c = scanner.nextInt();
        System.out.print(" d ");
        int d = scanner.nextInt();

        if (a == b && b == c) {
            System.out.println("D");
        }
        if (b == c && d == c) {
            System.out.println("A");
        }
        if (d == c && d == a) {
            System.out.println("B");
        }
        if (b == d && b == a) {
            System.out.println("C");
        }


    }

}












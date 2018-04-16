package String.Task1;

import java.util.Scanner;

public class FirstHalf {
   static void firsHalf() {
        String a, b;
        System.out.println("Введите строку: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextLine();
        b = a.substring(0, a.length()/2);
        System.out.println(b);
    }

}

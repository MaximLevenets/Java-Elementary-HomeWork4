package String.Task2;

import java.util.Scanner;

public class LastTwoChars {
    static void lastTwoChars(){
        String a, b = "ly";
        System.out.println("Введите строку: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextLine();
        System.out.println(a.endsWith(b));
    }
}

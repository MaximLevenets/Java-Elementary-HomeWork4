package String.Task3;

import java.util.*;

public class OrderedRows {
    static void orderedRows() {

        int numOfStrings;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество строк: ");
        numOfStrings = sc.nextInt();
        System.out.println("Введите " + numOfStrings + " строк:");
        String[] inSentence = new String[numOfStrings];
        for (int i = 0; i < inSentence.length; i++) {
            inSentence[i] = sc.nextLine();
        }

        Comparator<String> stringLengthComparator = new StringLengthSort();
        Arrays.sort(inSentence, stringLengthComparator); // применяем сортировку
        System.out.println("Сортировка по возрастанию длины строки: ");
        for(String str : inSentence){
            System.out.println(str);
        }
        }
    }


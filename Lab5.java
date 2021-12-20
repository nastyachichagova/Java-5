//Необходимо переписать одно из
//упражнений л/р No4 на массивы с
//использованием коллекций.

import java.util.Scanner;
import java.util.ArrayList;

public class Lab5 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int N, X;
        ArrayList<Integer> List_of_numbers = new ArrayList<Integer>();

        System.out.print("Введите размер списка: ");

        if(in.hasNextInt()) {
            N = in.nextInt();
            if (N > 0){
                System.out.print("Введите число X: ");

                if(in.hasNextInt()) {
                    X = in.nextInt();

                    System.out.print("Введите список из " + (N) + " элементов: ");
                    System.out.println();

                    while (List_of_numbers.size() < N && in.hasNextInt()){
                        int A = in.nextInt();
                        List_of_numbers.add(A);
                    }

                    System.out.print("Оригинальный список: ");

                    for (int i = 0; i < List_of_numbers.size(); i++) {
                        System.out.print(List_of_numbers.get(i) + " ");
                    }
                    System.out.println();

                    while (List_of_numbers.contains(Integer.valueOf(X))) {
                        List_of_numbers.remove(Integer.valueOf(X));
                    }

                    System.out.print("Новый список: ");

                    for (int i = 0; i < List_of_numbers.size(); i++) {
                        System.out.print(List_of_numbers.get(i) + " ");
                    }
                    System.out.println();
                }
                else
                    System.out.println("Введены неверные данные");
            }
            else
                System.out.println("Введены неверные данные");
        }
        else
            System.out.println("Введены неверные данные");
        in.close();
    }
}
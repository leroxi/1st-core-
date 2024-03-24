package task.methods;

import java.util.Objects;
import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {
        Task11.getEquality();
    }

    public static void getEquality() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое имя для сравнения --> ");
        String firstName = scan.nextLine();
        System.out.print("Введите второе имя --> ");
        String secondName = scan.nextLine();
        if (firstName.equalsIgnoreCase(secondName)) {
            System.out.println("Они одинаковые! ");
        } else {
            System.out.println("Они разные! ");
        }
    }
}


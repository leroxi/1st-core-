package task.methods;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
        System.out.print("Введите ваш возраст --> ");
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();

        getMonth(m);
        getHour(m);
        getMinute(m);


    }

    public static void getMonth(int m) {
        int a = m * 12;
        System.out.println("Вы прожили: " + a + " месяцев");
    }

    public static void getHour(int m) {
        long a = m * 365 * 24L;
        System.out.println("Вы прожили: " + a + " часов ");
    }

    public static void getMinute(int m) {
        long a = m * 365 * 24 * 60L;
        System.out.println("Вы прожили: " + a + " минут");
    }
}

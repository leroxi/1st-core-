package task.methods;

import java.util.Scanner;

public class Task14 {
    static int koshel = 0;

    public static void main(String[] args) {

        Task14.getKoshelek();


    }

    private static int getKoshelek() {
        int koshel = 50000;
        Scanner scan = new Scanner(System.in);

        do {
            int i = scan.nextInt();
            koshel = koshel + i;
            System.out.println("Баланс кошелька --> " + koshel);

        } while (koshel > 0 && koshel < 100000);

        if (koshel > 100000) {
            System.out.println(koshel + " <-- Сумма кошелька больше максимального числа");
        } else {
            System.out.println(koshel + " <-- Сумма кошелька меньше ноль или меньше нуля");
        }
        return koshel;
    }
}

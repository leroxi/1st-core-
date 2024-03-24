package task.methods;

public class Methods {
    public static void main(String[] args) {
        String string = getString("HELLO");
        System.out.println("Проверка возвращаемого значения --> " + string);
        Methods.getInt1();
        System.out.println("1)" + "Проверка возвращаемого значения --> " + Methods.getInt1());
        Methods.getStrings2();
        System.out.println("2)" + "Проверка возвращаемого значения --> " + Methods.getStrings2());
        Methods.getStrToNumb3();
        System.out.println("3)" + "Проверка возвращаемого значения --> " + Methods.getStrToNumb3());
        Methods.getStrAndNumbrTF4();
        System.out.println("4)" + "Проверка возвращаемого значения --> " + Methods.getStrAndNumbrTF4());
        Methods.getDvaBola5();
        System.out.println("5)" + "Проверка возвращаемого значения --> " + Methods.getDvaBola5());
        Methods.ChetNeChet6();
        System.out.println("6)" + "Проверка возвращаемого значения --> " + Methods.ChetNeChet6());
        Methods.getMassiveChetNeChet7();
        System.out.println("7)" + "Проверка возвращаемого значения --> " + Methods.getMassiveChetNeChet7());
        int[] array = getNovblyArray8();
        System.out.println("8)" + "Проверка возвращаемого значения --> " + array[0] + array[1] + array[2] + array[3]);
        Methods.getSumArr9();
        System.out.println("9)" + "Проверка возвращаемого значения --> " + Methods.getSumArr9());


    }

    public static String getString(String example) {
        return example.toLowerCase();
    }

    private static int getInt1() {
        int axes;
        return axes = 10 + 3;
    }

    private static String getStrings2() {
        String s = "Две";
        String d = " строки";
        return s + d;
    }

    private static String getStrToNumb3() {
        int y = 100;
        String x = "16";
        int z = Integer.parseInt(x.trim());
        int u = z + y;
        String str = Integer.toString(u);
        return str;
    }

    private static boolean getStrAndNumbrTF4() {
        int a = 100;
        String b = "50";
        int c = Integer.parseInt(b.trim());
        boolean s;
        if (c < a) {
            s = true;
        } else {
            s = false;
        }
        return s;
    }


    private static boolean getDvaBola5() {
        boolean c;
        boolean a = false;
        boolean b = true;
        if (a == true && b == true) {
            c = true;
        } else if (a == false && b == true) {
            c = true;
        } else if (a == true && b == false) {
            c = true;
        } else {
            c = false;
        }
        return c;
    }

    private static boolean ChetNeChet6() {
        int v = 6;
        boolean o;
        if (v % 2 == 0) {
            o = true;
        } else {
            o = false;
        }

        return o;
    }

    private static String getMassiveChetNeChet7() {
        int[] numbers = {1, 3, 5, 7}; //new int[5];
        int chet = 0;
        int neChet = 0;  //если нужно с значениями по порядку в массиве, убрать комментарии
        String a = null;
//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = i + 1;
//
//        }
        for (int job : numbers) {
            if (job % 2 == 0) {
                chet++;
            } else {
                neChet++;
            }
        }
        if (chet > 0 && neChet == 0) {
            a = "Массив четных чисел";
        } else if (chet == 0 && neChet > 0) {
            a = "Массив не четных чисел";
        } else {
            a = "Массив четных и не четных чисел";
        }

        return a;
    }

    private static int[] getNovblyArray8() {
        int[] a = {2, 4, 6, 8};
        int[] b = new int[4];
        for (int i = 0; i < b.length; i++) {
            for (int x : a) {
                b[i] = a[i];
            }
        }
//        for (int i = 0; i < b.length; i++) {
//            System.out.print(b[i]);
//        }
        return b;
    }

    private static int getSumArr9() {
        int sum = 0;
        int[] array1 = {1, 1, 1, 1, 10, 11};
        for (int x : array1) {
            sum = x + sum;
        }

        return sum;
    }
}



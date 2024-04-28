package task.methods;

import java.util.Scanner;

public class Methods {
    static String[] array1 = {"boba", "zoba", " moba", "doba", "zola", "kola"};
    static int[] array2 = {1, 2, 3, 4, 3, 1, 9};
    static int koshel = 0;
    static String s = "Две";
    static String d = " строки";
    static int y = 100;
    static String x = "16";
    static int a = 100;
    static String b = "50";
    static boolean cc;
    static boolean aa = false;
    static boolean bb = true;
    static int v = 6;
    static boolean o;
    static int[] numbers = {1, 3, 5, 7};
    static int chet = 0;
    static int neChet = 0;
    static String da = null;
    static int[] am = {2, 4, 6, 8};
    static int[] bm = new int[4];
    static int sum1 = 0;

    public static void main(String[] args) {
        String string = getString("HELLO");
        System.out.println("Проверка возвращаемого значения --> " + string);
        Methods.SumOfTwoNumbers();
        System.out.println("1)" + "Проверка возвращаемого значения --> " + Methods.SumOfTwoNumbers());
        Methods.SumOfTwoStrings();
        System.out.println("2)" + "Проверка возвращаемого значения --> " + Methods.SumOfTwoStrings());
        Methods.SumOfTwoNumbersFromString();
        System.out.println("3)" + "Проверка возвращаемого значения --> " + Methods.SumOfTwoNumbersFromString());
        Methods.getStrAndNumbrTF4();
        System.out.println("4)" + "Проверка возвращаемого значения --> " + Methods.getStrAndNumbrTF4());
        Methods.getEqualityOfData();
        System.out.println("5)" + "Проверка возвращаемого значения --> " + Methods.getEqualityOfData());
        Methods.isOddOrEvenNumber();
        System.out.println("6)" + "Проверка возвращаемого значения --> " + Methods.isOddOrEvenNumber());
        Methods.getMassiveisOddOrEven();
        System.out.println("7)" + "Проверка возвращаемого значения --> " + Methods.getMassiveisOddOrEven());
        int[] array = PolychitNovblyMassiv();
        System.out.println("8)" + "Проверка возвращаемого значения --> " + array[0] + array[1] + array[2] + array[3]);
        Methods.SummaVsehElementovMassiva();
        System.out.println("9)" + "Проверка возвращаемого значения --> " + Methods.SummaVsehElementovMassiva());
        //10
        System.out.print("Введите ваш возраст --> ");
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        getMonth(m);
        getHour(m);
        getMinute(m);

        //11
        Methods.getEquality();
        //12
        getLastElMassiva();
        //13
        getCountedLetters();
        //14
        Methods.getKoshelek();

    }

    public static String getString(String example) {
        return example.toLowerCase();
    }

    // TODO: Создайте метод который вернет сумму двух чисел
    private static int sumOfTwoNumbers() {
        return 10 + 3;
    }

    // TODO: Создайте метод который вернет сумму двух переданных строк
    private static String SumOfTwoStrings() {
        return s + d;
    }
    // TODO: создайте метод который примет строку внутри которой передается число , а также принимает число . Метод должен суммировать числа
    //  обернуть их в строку и вернуть результат строкой

    private static String SumOfTwoNumbersFromString() {
        int z = Integer.parseInt(x.trim());
        int uu = z + y;
        String str = Integer.toString(uu);
        return str;
    }
    // TODO: Создайте метод который принимает строку , число . Внутри строки передается число . Проверить , что если число внутри строки больше чем
    //  число которое передается как int , то пусть метод вернет false , а если меньше , то true


    private static boolean getStrAndNumbrTF4() {
        int c = Integer.parseInt(b.trim());
        boolean s;
        if (c < a) {
            s = true;
        } else {
            s = false;
        }
        return s;
    }
    // TODO: Создайте метод который принимает 2 булевые переменные . Если обе true , верни true , если хоть одна из них true верни true ,
    //  если обе false верни false


    private static boolean getEqualityOfData() {
        if (aa == true && bb == true) {
            cc = true;
        } else if (aa == false && bb == true) {
            cc = true;
        } else if (aa == true && bb == false) {
            cc = true;
        } else {
            cc = false;
        }
        return cc;
    }
    // TODO: Создайте метод который принимает число и вернет true если оно четное , и false если оно не четное

    private static boolean isOddOrEvenNumber() {
        if (v % 2 == 0) {
            o = true;
        } else {
            o = false;
        }
        return o;
    }
    // TODO: Создайте метод который проверят числа в массиве , если все они четные верни "Массив четных чисел" , если есть и четные и не
    //  четные верни "Массив четных и не четных чисел" и если в массиве только нечетные числа верни "Массив не четных чисел"


    private static String getMassiveisOddOrEven() {
        for (int job : numbers) {
            if (job % 2 == 0) {
                chet++;
            } else {
                neChet++;
            }
        }
        if (chet > 0 && neChet == 0) {
            da = "Массив четных чисел";
        } else if (chet == 0 && neChet > 0) {
            da = "Массив не четных чисел";
        } else {
            da = "Массив четных и не четных чисел";
        }

        return da;
    }
    // TODO: Создайте метод который принимает массив чисел и возвращает новый массив чисел . Внутри метода пройдитесь по элементам
    //  массива который подается в аргументы  и сложите все элементы в новый массив и верните его

    private static int[] PolychitNovblyMassiv() {
        for (int i = 0; i < bm.length; i++) {
            for (int x : am) {
                bm[i] = am[i];
            }
        }
        return bm;
    }
    // TODO: Создайте метод который принимает массив чисел и возвращает число . Внутри метода пройдитесь по элементам массива который подается в
    //  аргументы сложите все числа который переданы в массиве и верните сумму всех чисел

    private static int SummaVsehElementovMassiva() {
        int[] array1 = {1, 1, 1, 1, 10, 11};
        for (int x : array1) {
            sum1 = x + sum1;
        }

        return sum1;
    }
    // TODO: Создайте методы в которые можно будет передавать свой возраст , а возвращаться сколько полных месяцев в этом возрасте ,
    //  тоесть если человек прожил 10 лет , это 120 месяцевтак же сделайте перевод возраста в минуты и метод который расчетает возраст в часах

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
    // TODO: Создайте метод которому передаю имена , а он проверяет одинаковые ли они , причем не зависимо от регистра

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
    // TODO: Создайте метод которому можно передать массив элементов , а он вернет последний элемент

    public static void getLastElMassiva() {
        var lastel = array1[array1.length - 1];
        System.out.println(lastel);
    }
    // TODO: Создайте метод счетчик букв А . Подается строка и метод посчитает сколько букв А в строке

    public static void getCountedLetters() {
        String str = "AAA";
        int index = 0;
        for (char elem : str.toCharArray()) {
            if (elem == 'A') index++;
        }
        System.out.println(index + " Букв А в строке ");


    }
    // TODO: Создайте метод кошелек , у него есть началная сумма и можно вычитать пока деньги не кончатся или сумма не будет слишком велика

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



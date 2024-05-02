package task.methods;
import java.util.Scanner;

public class Methods {


    static String[] array1 = {"boba", "zoba", " moba", "doba", "zola", "kola"};
    static String s = "Две";
    static String d = " строки";
    static int y = 100;
    static String x = "16";
    static int a = 100;
    static String b = "50";
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
    static int[] array12 = {1, 1, 1, 1, 10, 11};

    public static void main(String[] args) {
        String string = getString("HELLO");
        System.out.println("Проверка возвращаемого значения --> " + string);
        Methods.sumOfTwoNumbers();
        System.out.println("1)" + "Проверка возвращаемого значения --> " + Methods.sumOfTwoNumbers());
        Methods.sumOfTwoStrings(s, d);
        System.out.println("2)" + "Проверка возвращаемого значения --> " + Methods.sumOfTwoStrings(s, d));
        Methods.sumOfTwoNumbersFromString(x, y);
        System.out.println("3)" + "Проверка возвращаемого значения --> " + Methods.sumOfTwoNumbersFromString(x, y));
        Methods.getStrAndNumbrTF4(b, a);
        System.out.println("4)" + "Проверка возвращаемого значения --> " + Methods.getStrAndNumbrTF4(b, a));
        Methods.getEqualityOfData(aa, bb);
        System.out.println("5)" + "Проверка возвращаемого значения --> " + Methods.getEqualityOfData(aa, bb));
        Methods.isOddOrEvenNumber(v, o);
        System.out.println("6)" + "Проверка возвращаемого значения --> " + Methods.isOddOrEvenNumber(v, o));
        Methods.isEven(numbers);
        System.out.println("7)" + "Проверка возвращаемого значения --> " + Methods.isEven(numbers));
        int[] array = getNewArray(bm);
        System.out.println("8)" + "Проверка возвращаемого значения --> " + array[0] + array[1] + array[2] + array[3]);
        Methods.sumOfAllTheElementsOfTheArray(array12);
        System.out.println("9)" + "Проверка возвращаемого значения --> " + Methods.sumOfAllTheElementsOfTheArray(array12));
        System.out.print("Введите ваш возраст --> ");
        int years = 2;
        getYearsInMonth(years);
        getYearsInHour(years);
        getYearsInMinute(years);
        String firstName = "kola";
        String secondName = "Kola";
        String stringWithALetter = "AAA";

        Methods.equalityNames(firstName, secondName);
        lastElementOfArray(array1);

        countedLetters(stringWithALetter);
        int amount = 50000;
        Methods.getWallet(amount);

    }

    public static String getString(String example) {
        return example.toLowerCase();
    }

    // TODO: Создайте метод который вернет сумму двух чисел
    private static int sumOfTwoNumbers() {
        return 10 + 3;
    }

    // TODO: Создайте метод который вернет сумму двух переданных строк
    private static String sumOfTwoStrings(String s, String d) {
        return s + d;
    }
    // TODO: создайте метод который примет строку внутри которой передается число , а также принимает число . Метод должен суммировать числа
    //  обернуть их в строку и вернуть результат строкой

    private static String sumOfTwoNumbersFromString(String x, int y) {
        int z = Integer.parseInt(x.trim());
        int sumOfNumbers = z + y;
        String result = Integer.toString(sumOfNumbers);
        return result;
    }
    // TODO: Создайте метод который принимает строку , число . Внутри строки передается число . Проверить , что если число внутри строки больше чем
    //  число которое передается как int , то пусть метод вернет false , а если меньше , то true


    private static boolean getStrAndNumbrTF4(String b, int a) {
        return Integer.parseInt(b.trim()) < a;
    }
    // TODO: Создайте метод который принимает 2 булевые переменные . Если обе true , верни true , если хоть одна из них true верни true ,
    //  если обе false верни false


    private static boolean getEqualityOfData(boolean aa, boolean bb) {
        return aa && bb;
    }
    // TODO: Создайте метод который принимает число и вернет true если оно четное , и false если оно не четное

    private static boolean isOddOrEvenNumber(int v, boolean o) {
        return (v % 2 == 0);
    }
    // TODO: Создайте метод который проверят числа в массиве , если все они четные верни "Массив четных чисел" , если есть и четные и не
    //  четные верни "Массив четных и не четных чисел" и если в массиве только нечетные числа верни "Массив не четных чисел"


    private static String isEven(int[] numbers) {
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

    private static int[] getNewArray(int[] bm) {
        for (int i = 0; i < bm.length; i++) {
            bm[i] = am[i];
        }
        return bm;
    }
    // TODO: Создайте метод который принимает массив чисел и возвращает число . Внутри метода пройдитесь по элементам массива который подается в
    //  аргументы сложите все числа который переданы в массиве и верните сумму всех чисел

    private static int sumOfAllTheElementsOfTheArray(int[] array12) {
        for (int x : array12) {
            sum1 = x + sum1;
        }
        return sum1;
    }
    // TODO: Создайте методы в которые можно будет передавать свой возраст , а возвращаться сколько полных месяцев в этом возрасте ,
    //  тоесть если человек прожил 10 лет , это 120 месяцевтак же сделайте перевод возраста в минуты и метод который расчетает возраст в часах

    public static int getYearsInMonth(int years) {
        int result1 = years * 12;
        System.out.println("Вы прожили: " + result1 + " месяцев");
        return result1;
    }

    public static long getYearsInHour(int years) {
        long result2 = years * 365 * 24L;
        System.out.println("Вы прожили: " + result2 + " часов ");
        return result2;
    }

    public static long getYearsInMinute(int years) {
        long result3 = years * 365 * 24 * 60L;
        System.out.println("Вы прожили: " + result3 + " минут");
        return result3;
    }
    // TODO: Создайте метод которому передаю имена , а он проверяет одинаковые ли они , причем не зависимо от регистра

    public static boolean equalityNames(String firstName, String secondName) {
        return firstName.equalsIgnoreCase(secondName);
    }
    // TODO: Создайте метод которому можно передать массив элементов , а он вернет последний элемент

    public static String lastElementOfArray(String[] array1) {
        System.out.println(array1[array1.length - 1]);
        return (array1[array1.length - 1]);
    }
    // TODO: Создайте метод счетчик букв А . Подается строка и метод посчитает сколько букв А в строке

    public static int countedLetters(String stringWithALetter) {
        int index = 0;
        for (char elem : stringWithALetter.toCharArray()) {
            if (elem == 'A') index++;
        }
        return index;
    }
    // TODO: Создайте метод кошелек , у него есть началная сумма и можно вычитать пока деньги не кончатся или сумма не будет слишком велика

    private static int getWallet(int amount) {
        Scanner scan = new Scanner(System.in);
        int i;
        do {
            i = scan.nextInt();
            amount = amount + i;
            System.out.println("Баланс кошелька --> " + amount + "(Введите 0 если хотите прекратить действие с кошельком)");
            if (i == 0) {
                break;
            }
        } while (amount > 0 && amount < 100000);

        if (amount > 100000) {
            System.out.println(amount + " <-- Сумма кошелька больше максимального числа");
        } else if (amount < 0) {
            System.out.println(amount + " <-- Сумма кошелька меньше ноль или меньше нуля");
        }

        return amount;
    }
}



